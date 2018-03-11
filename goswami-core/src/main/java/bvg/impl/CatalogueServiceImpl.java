package bvg.impl;

import bvg.api.CatalogueService;
import bvg.criteria.MediaCriteria;
import bvg.entity.MediaEntity;
import bvg.model.CollectionPage;
import bvg.model.MediaModel;
import bvg.model.SimpleDirectory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author lgalimova
 * @since 22.01.2018
 */
@Service
public class CatalogueServiceImpl implements CatalogueService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public CollectionPage<MediaModel> getMedia(MediaCriteria criteria) {
        String countStr = "select count(*) ";
        String selectStr = "select m ";
        String where = "from MediaEntity m where " +
                "m.type = 'audio' ";
        if (criteria.getDateBegin() != null) {
            where += "and m.date >= :bdate ";
        }
        if (criteria.getDateEnd() != null) {
            where += "and m.date <= :edate ";
        }
        String orderBy = getOrderBy(criteria.getSortingField(), criteria.getSortingDirection());
        TypedQuery<MediaEntity> selectQuery = entityManager.createQuery(selectStr + where + orderBy, MediaEntity.class)
//                .setParameter("type", "'" + criteria.getMediaType().toString() +"'")
                .setFirstResult((criteria.getPage() - 1) * criteria.getSize())
                .setMaxResults(criteria.getSize());
        TypedQuery<Long> countQuery = entityManager.createQuery(countStr + where, Long.class);
//                .setParameter("type", "'" + criteria.getMediaType().toString() +"'");
        if (criteria.getDateBegin() != null) {
            selectQuery.setParameter("bdate", criteria.getDateBegin());
            countQuery.setParameter("bdate", criteria.getDateBegin());
        }
        if (criteria.getDateEnd() != null) {
            selectQuery.setParameter("edate", criteria.getDateEnd());
            countQuery.setParameter("edate", criteria.getDateEnd());
        }
        List<MediaEntity> list = selectQuery.getResultList();
        Long count = countQuery.getSingleResult();
        List<MediaModel> result = new ArrayList<>();
        for (MediaEntity entity : list) {
            MediaModel model = new MediaModel();
            model.setId(entity.getId());
            model.setImageUrl(entity.getImgUri());
            model.setTitle(entity.getTitle());
            model.setCategory(Collections.singletonList(new SimpleDirectory(1, "публичные лекции")));
            if (!CollectionUtils.isEmpty(entity.getAuthors())) {
                model.setAuthor(new ArrayList<>(entity.getAuthors()));
            }
            model.setVenue(entity.getVenue());
            model.setFileUrl(entity.getFileUri());
            model.setDuration(entity.getDuration());
            model.setDate(entity.getOccurrenceDate());
            result.add(model);
        }
        return new CollectionPage<>(count.intValue(), result, null);
    }


    private String getOrderBy(String sortingField, String direction) {
        if (StringUtils.isEmpty(sortingField))
            return "order by m.id";
        direction = direction == null ? "ASC" : direction;
        String orderBy = "";
        switch (sortingField) {
            case "date":
                orderBy += "m.occurrenceDate ";
        }
        return "order by " + orderBy + direction;
    }
}
