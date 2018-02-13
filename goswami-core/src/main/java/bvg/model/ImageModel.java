package bvg.model;

import java.io.Serializable;

/**
 * @author lgalimova
 * @since 13.02.2018
 */
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
