package bvg.api;

import bvg.criteria.MediaCriteria;
import bvg.model.CollectionPage;
import bvg.model.MediaModel;

/**
 * @author lgalimova
 * @since 22.01.2018
 */
public interface CatalogueService {
    CollectionPage<MediaModel> getMedia(MediaCriteria criteria);
}
