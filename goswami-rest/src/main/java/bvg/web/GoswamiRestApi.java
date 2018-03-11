package bvg.web;

import bvg.model.CollectionPage;
import bvg.model.ImageModel;
import bvg.model.MediaModel;
import bvg.model.NewsModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @author lgalimova
 * @since 22.01.2018
 */
@RestController
@RequestMapping("/")
@Api(value = "Описание сервисов goswami.ru")
public interface GoswamiRestApi {

    @RequestMapping(value = "/top/carousel", method = RequestMethod.GET)
    @ApiOperation(value = "Получение изображений для карусели", tags = "Главная страница",
            response = ImageModel.class, responseContainer = "List")
    List<ImageModel> getTopCarouselData();

    @RequestMapping(value = "/top/news", method = RequestMethod.GET)
    @ApiOperation(value = "Получение данных карточек", tags = "Главная страница")
    List<NewsModel> getTopNews();

    @RequestMapping(value = "/catalogue/audio", method = RequestMethod.GET)
    @ApiOperation(value = "Получение списка аудио-лекций", tags = "Каталог")
    CollectionPage<MediaModel> getAudio(
            @ApiParam(value = "Номер страницы списка") @RequestParam(defaultValue = "1", required = false) Integer pagenum,
            @ApiParam(value = "Количество записей на странице") @RequestParam(defaultValue = "10", required = false)Integer pagesize,
            @ApiParam(value = "Идентификатор категории лекции") @RequestParam(required = false) Integer categoryId,
            @ApiParam(value = "Идентификатор священного писания") @RequestParam(required = false)  Integer scriptureId,
            @ApiParam(value = "Строка поиска по священному писанию") @RequestParam(required = false)  String verse,
            @ApiParam(value = "Дата прочтения лекции. Начало интервала") @RequestParam(required = false)  Date dateBegin,
            @ApiParam(value = "Дата прочтения лекции. Конец интервала") @RequestParam(required = false)  Date dateEnd,
            @ApiParam(value = "Идентификатор метки") @RequestParam(required = false)  Integer tag,
            @ApiParam(value = "Идентификатор места прочтения") @RequestParam(required = false)  Integer venueId,
            @ApiParam(value = "Идентификатор автора лекции") @RequestParam(required = false)  Integer authorId,
            @ApiParam(value = "Общий поиск") @RequestParam(required = false)  String searchText,
            @ApiParam(value = "Поле сортировки (date)") @RequestParam(required = false)  String sortingField,
            @ApiParam(value = "Направление сортировки ASC, DESC") @RequestParam(required = false)  String direction);

}
