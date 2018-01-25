package bvg.impl;

import bvg.entity.MediaEntity;
import bvg.api.CatalogueService;
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
    public List<MediaModel> getMedia() {
        List<MediaEntity> list = entityManager.createQuery("select m from MediaEntity m", MediaEntity.class).getResultList();
        return list.stream().map(mediaEntity -> new MediaModel().populateFrom(mediaEntity))
                .collect(Collectors.toList());
    }
}
