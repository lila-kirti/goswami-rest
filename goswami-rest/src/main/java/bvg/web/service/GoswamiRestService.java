package bvg.web.service;

import bvg.api.CatalogueService;
import bvg.model.MediaModel;
import bvg.web.GoswamiRestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Response;
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

    @Override
    public Response echo() {
        return Response.ok(new Date().getTime()).build();
    }

    @Override
    public List<MediaModel> getMedia() {
        return catalogueService.getMedia();
    }
}
