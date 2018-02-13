package bvg.impl;

import bvg.api.CatalogueService;
import bvg.model.MediaModel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lgalimova
 * @since 22.01.2018
 */
@Service
public class CatalogueServiceImpl implements CatalogueService {

    @Override
    public List<MediaModel> getMedia() {
        return null;
    }
}
