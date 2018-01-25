package bvg.web;

import bvg.model.MediaModel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * @author lgalimova
 * @since 22.01.2018
 */
@Path("/")
@Produces(MediaType.APPLICATION_JSON + ";charset=UTF-8")
@Api(value = "Описание сервисов goswami.ru")
public interface GoswamiRestApi {

    @GET
    @Path("/echo")
    @Produces(MediaType.TEXT_PLAIN)
    @ApiOperation(value = "Тестовый запрос")
    Response echo();

    @GET
    @Path("/media")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "MediaEntity")
    List<MediaModel> getMedia();

}
