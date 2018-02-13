package bvg.api;

import bvg.model.ImageModel;
import bvg.model.NewsModel;

import java.util.List;

/**
 * @author lgalimova
 * @since 13.02.2018
 */
public interface NewsService {
    List<ImageModel> getCarousel();
    List<NewsModel> getNews();
}
