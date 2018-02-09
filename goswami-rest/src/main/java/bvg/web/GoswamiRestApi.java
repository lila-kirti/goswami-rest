package bvg.web;

import bvg.model.MediaModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

    @RequestMapping(value = "/echo", method= RequestMethod.GET)
    @ApiOperation(value = "Тестовый запрос")
    ResponseEntity echo();

    @RequestMapping(value = "/media", method= RequestMethod.GET)
    @ApiOperation(value = "MediaEntity")
    List<MediaModel> getMedia();

}
