package bvg.web.service;

import bvg.MediaTypeEnum;
import bvg.api.CatalogueService;
import bvg.api.NewsService;
import bvg.criteria.MediaCriteria;
import bvg.model.CollectionPage;
import bvg.model.ImageModel;
import bvg.model.MediaModel;
import bvg.model.NewsModel;
import bvg.web.GoswamiRestApi;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
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
    public CollectionPage<MediaModel> getAudio(
            @ApiParam(value = "Номер страницы списка") @RequestParam(defaultValue = "1", required = false) Integer pagenum,
            @ApiParam(value = "Количество записей на странице") @RequestParam(defaultValue = "10", required = false) Integer pagesize,
            @ApiParam(value = "Идентификатор категории лекции") @RequestParam(required = false) Integer categoryId,
            @ApiParam(value = "Идентификатор священного писания") @RequestParam(required = false) Integer scriptureId,
            @ApiParam(value = "Строка поиска по священному писанию") @RequestParam(required = false) String verse,
            @ApiParam(value = "Дата прочтения лекции. Начало интервала") @RequestParam(required = false) Date dateBegin,
            @ApiParam(value = "Дата прочтения лекции. Конец интервала") @RequestParam(required = false) Date dateEnd,
            @ApiParam(value = "Идентификатор метки") @RequestParam(required = false) Integer tag,
            @ApiParam(value = "Идентификатор места прочтения") @RequestParam(required = false) Integer venueId,
            @ApiParam(value = "Идентификатор автора лекции") @RequestParam(required = false) Integer authorId,
            @ApiParam(value = "Общий поиск") @RequestParam(required = false) String searchText,
            @ApiParam(value = "Поле сортировки (date)") @RequestParam(required = false) String sortingField,
            @ApiParam(value = "Направление сортировки ASC, DESC") @RequestParam(required = false) String direction) {
        pagenum = pagenum == null ? 1 : pagenum;
        pagesize = pagesize == null ? 10 : pagesize;
        return catalogueService.getMedia(
                new MediaCriteria(MediaTypeEnum.AUDIO, pagenum, pagesize, sortingField, direction, categoryId,
                        scriptureId, verse, dateBegin, dateEnd, tag, venueId, authorId, searchText));
    }

}
