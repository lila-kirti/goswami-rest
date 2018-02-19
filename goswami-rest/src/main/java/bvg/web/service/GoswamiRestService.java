package bvg.web.service;

import bvg.api.CatalogueService;
import bvg.api.NewsService;
import bvg.model.ImageModel;
import bvg.model.MediaModel;
import bvg.model.NewsModel;
import bvg.web.GoswamiRestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lgalimova
 * @since 22.01.2018
 */
@Component
public class GoswamiRestService implements GoswamiRestApi {

    @Autowired
    private CatalogueService catalogueService;
    @Autowired
    private NewsService newsService;

    @Override
    public List<ImageModel> getTopCarouselData() {
        return newsService.getCarousel();
    }

    @Override
    public List<NewsModel> getTopNews() {
        return newsService.getNews();
    }

    @Override
    public List<MediaModel> getTopAudio(Integer count) {
        return catalogueService.getLastAudio(count);
    }
}
