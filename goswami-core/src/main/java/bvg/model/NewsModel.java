package bvg.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lgalimova
 * @since 13.02.2018
 */
public class NewsModel implements Serializable{
    private Integer id;
    private String imageUrl;
    private String title;
    private String annotation;
    private Date date;
    private String targetUrl;
    private String type;

    public NewsModel() {
    }

    public NewsModel(Integer id, String imageUrl, String title, String annotation, Date date, String targetUrl, String type) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.title = title;
        this.annotation = annotation;
        this.date = date;
        this.targetUrl = targetUrl;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
