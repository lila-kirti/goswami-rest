package bvg.api;

import bvg.entity.MediaEntity;
import bvg.model.MediaModel;

import java.util.List;

/**
 * @author lgalimova
 * @since 22.01.2018
 */
public interface CatalogueService {
    List<MediaModel> getMedia();
}
