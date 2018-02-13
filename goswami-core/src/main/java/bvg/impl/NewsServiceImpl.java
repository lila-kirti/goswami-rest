package bvg.impl;

import bvg.api.NewsService;
import bvg.model.ImageModel;
import bvg.model.NewsModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author lgalimova
 * @since 13.02.2018
 */
@Service
public class NewsServiceImpl implements NewsService {
    @Override
    public List<ImageModel> getCarousel() {
        List<ImageModel> list = new ArrayList<>();
        list.add(new ImageModel("/image/carousel1.png", "/catalogue/collection/1", 1));
        list.add(new ImageModel("/image/carousel2.png", "/catalogue/collection/2", 2));
        list.add(new ImageModel("/image/carousel3.png", "/catalogue/collection/3", 3));
        list.add(new ImageModel("/image/carousel4.png", "/catalogue/collection/4", 4));
        return list;
    }

    @Override
    public List<NewsModel> getNews() {
        Calendar c = Calendar.getInstance();
        List<NewsModel> news = new ArrayList<>();
        news.add(new NewsModel(1, "/image/news1.png", "Заголовок 1", "Аннотация 1", generateDate(1), "/catalogue/collection/1", "collection"));
        c.add(Calendar.DAY_OF_YEAR, 3);
        news.add(new NewsModel(2, "/image/news2.png", "Заголовок 2", "Аннотация 2", generateDate(2), "/catalogue/audio/1", "audio"));
        news.add(new NewsModel(3, "/image/news3.png", "Заголовок 3", "Аннотация 3", generateDate(3), "/catalogue/collection/2", "collection"));
        news.add(new NewsModel(4, "/image/news4.png", "Заголовок 4", "Аннотация 4", generateDate(4), "/catalogue/book/3", "book"));
        news.add(new NewsModel(5, "/image/news5.png", "Заголовок 5", "Аннотация 5", generateDate(5), "/catalogue/article/4", "article"));
        news.add(new NewsModel(6, "/image/news6.png", "Заголовок 6", "Аннотация 6", generateDate(6), "/catalogue/collection/5", "collection"));
        news.add(new NewsModel(7, "/image/news7.png", "Заголовок 7", "Аннотация 7", generateDate(7), "/catalogue/book/6", "book"));
        news.add(new NewsModel(8, "/image/news8.png", "Заголовок 8", "Аннотация 8", generateDate(8), "/catalogue/article/7", "article"));
        return news;
    }

    private Date generateDate(int index) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_YEAR, index);
        return c.getTime();
    }
}
