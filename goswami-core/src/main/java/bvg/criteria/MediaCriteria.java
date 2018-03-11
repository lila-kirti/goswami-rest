package bvg.criteria;

import bvg.MediaTypeEnum;

import java.util.Date;

/**
 * @author lgalimova
 * @since 11.03.2018
 */
public class MediaCriteria extends Criteria {
    private MediaTypeEnum mediaType;
    private Integer categoryId;
    private Integer scriptureId;
    private String verse;
    private Date dateBegin;
    private Date dateEnd;
    private Integer tag;
    private Integer venueId;
    private Integer authorId;
    private String searchText;

    public MediaCriteria() {
    }

    public MediaCriteria(MediaTypeEnum mediaType, Integer page, Integer size, String sortingField,
                         String sortingDirection, Integer categoryId, Integer scriptureId, String verse,
                         Date dateBegin, Date dateEnd, Integer tag, Integer venueId, Integer authorId, String searchText) {
        this.mediaType = mediaType;
        setPage(page);
        setSize(size);
        setSortingField(sortingField);
        setSortingDirection(sortingDirection);
        this.categoryId = categoryId;
        this.scriptureId = scriptureId;
        this.verse = verse;
        this.dateBegin = dateBegin;
        this.dateEnd = dateEnd;
        this.tag = tag;
        this.venueId = venueId;
        this.authorId = authorId;
        this.searchText = searchText;
    }

    public MediaTypeEnum getMediaType() {
        return mediaType;
    }

    public void setMediaType(MediaTypeEnum mediaType) {
        this.mediaType = mediaType;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getScriptureId() {
        return scriptureId;
    }

    public void setScriptureId(Integer scriptureId) {
        this.scriptureId = scriptureId;
    }

    public String getVerse() {
        return verse;
    }

    public void setVerse(String verse) {
        this.verse = verse;
    }

    public Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public Integer getVenueId() {
        return venueId;
    }

    public void setVenueId(Integer venueId) {
        this.venueId = venueId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

}
