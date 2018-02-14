package bvg.model;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author lgalimova
 * @since 25.01.2018
 */
public class MediaModel implements Serializable {
    private Long id;
    private String title;
    private String teaser;
    private String body;
    private String type;
    private String imgUri;
    private String fileUri;
    private String duration;

    @ApiModelProperty("Идентификатор")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getImgUri() {
        return imgUri;
    }

    public void setImgUri(String imgUri) {
        this.imgUri = imgUri;
    }

    public String getFileUri() {
        return fileUri;
    }

    public void setFileUri(String fileUri) {
        this.fileUri = fileUri;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
