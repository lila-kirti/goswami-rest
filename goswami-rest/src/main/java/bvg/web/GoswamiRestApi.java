package bvg.web;

import bvg.model.ImageModel;
import bvg.model.MediaModel;
import bvg.model.NewsModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "/top/audio", method = RequestMethod.GET)
    @ApiOperation(value = "Получение списка последних лекций", tags = "Главная страница")
    List<MediaModel> getTopAudio(@ApiParam(value = "Количество лекций в ответе", required = true) @RequestParam(defaultValue="10") Integer count);

}
