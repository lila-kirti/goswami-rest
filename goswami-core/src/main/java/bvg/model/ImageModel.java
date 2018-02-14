package bvg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author lgalimova
 * @since 13.02.2018
 */
@ApiModel("Данные изображения")
public class ImageModel implements Serializable {
    private String imageUrl;
    private String targetUrl;
    private Integer order;

    public ImageModel() {
    }

    public ImageModel(String imageUrl, String targetUrl, Integer order) {
        this.imageUrl = imageUrl;
        this.targetUrl = targetUrl;
        this.order = order;
    }

    @ApiModelProperty("URL изображения")
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @ApiModelProperty("URL, на который осуществляется переход при клике на изображении")
    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    @ApiModelProperty("Порядок в списке")
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
