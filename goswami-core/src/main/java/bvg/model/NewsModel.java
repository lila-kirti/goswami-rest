package bvg.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lgalimova
 * @since 13.02.2018
 */

@ApiModel("Данные карточки главной страницы")
public class NewsModel implements Serializable {
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

    @ApiModelProperty("Идентификатор")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ApiModelProperty("URL изображения")
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @ApiModelProperty("Заголовок")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @ApiModelProperty("Аннотация")
    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    @ApiModelProperty("Дата")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @ApiModelProperty("URL, на который ссылается карточка")
    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    @ApiModelProperty("Тип карточки (audio, collection, book, article)")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
