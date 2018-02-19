package bvg.model;

import bvg.entity.MediaEntity;
import bvg.util.JsonDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * @author lgalimova
 * @since 25.01.2018
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
@ApiModel("Данные медиа")
public class MediaModel implements Serializable {
    private Long id;
    private String title;
    private String teaser;
    private String body;
    private String type;
    private String imageUrl;
    private Date date;
    private String fileUrl;
    private String duration;

    @ApiModelProperty("Идентификатор")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ApiModelProperty("Заголовок")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTeaser() {
        return teaser;
    }

    public void setTeaser(String teaser) {
        this.teaser = teaser;
    }

    @ApiModelProperty("Содержимое")
    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @ApiModelProperty("Тип медиа (лекция, альбом, книга, статья)")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @ApiModelProperty("URL изображения")
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @ApiModelProperty("Дата")
    @JsonSerialize(using = JsonDateSerializer.class)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public MediaModel populateFrom(MediaEntity entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.teaser = entity.getTeaser();
        this.body = entity.getBody();
        this.type = entity.getType();
        this.imageUrl = entity.getImgUri();
        this.fileUrl = entity.getFileUri();
        this.duration = entity.getDuration();
        return this;
    }
}
