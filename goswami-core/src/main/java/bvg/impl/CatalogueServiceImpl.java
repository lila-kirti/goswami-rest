package bvg.impl;

import bvg.api.CatalogueService;
import bvg.entity.MediaEntity;
import bvg.model.MediaModel;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author lgalimova
 * @since 22.01.2018
 */
@Service
public class CatalogueServiceImpl implements CatalogueService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<MediaModel> getLastAudio(Integer count) {
        List<MediaEntity> list = entityManager.createQuery(
                "select m from MediaEntity m where m.type='audio' order by m.occurrenceDate desc",
                MediaEntity.class)
                .setFirstResult(0).setMaxResults(count == null ? 10 : count)
                .getResultList();
        List<MediaModel> result = new ArrayList<>();
        for (MediaEntity entity : list) {
            MediaModel model = new MediaModel();
            model.setId(entity.getId());
            model.setTitle(entity.getTitle());
            model.setFileUrl(entity.getFileUri());
            model.setDuration(entity.getDuration());
            model.setDate(entity.getOccurrenceDate());
            result.add(model);
        }
        return result;
    }

    @Override
    public List<MediaModel> getMedia() {
        List<MediaEntity> list = entityManager.createQuery("select m from MediaEntity m", MediaEntity.class)
                .setFirstResult(0).setMaxResults(10)
                .getResultList();
        return list.stream().map(mediaEntity -> new MediaModel().populateFrom(mediaEntity))
                .collect(Collectors.toList());
    }
}
