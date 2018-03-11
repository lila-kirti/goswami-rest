package bvg.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @author lgalimova
 * @since 22.01.2018
 */
@Entity
@Table(name = "media")
public class MediaEntity implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String type;

    @Column
    private String title;

    @Column
    private String teaser;

    @Column
    private String body;

    @Column(name = "img_uri")
    private String imgUri;

    @Column(name = "file_uri")
    private String fileUri;

    @Column
    private String duration;

    @Column(name = "occurrence_date")
    private Date occurrenceDate;

    @ManyToOne
    @JoinColumn(name = "venue_id")
    private VenueEntity venue;

    @ManyToMany (targetEntity = AuthorEntity.class)
    @JoinTable (name = "media_authors", joinColumns = @JoinColumn (name = "media_id"),
            inverseJoinColumns = @JoinColumn (name = "author_id"))
    private Set<AuthorEntity> authors;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Date getOccurrenceDate() {
        return occurrenceDate;
    }

    public void setOccurrenceDate(Date occurrenceDate) {
        this.occurrenceDate = occurrenceDate;
    }

    public VenueEntity getVenue() {
        return venue;
    }

    public void setVenue(VenueEntity venue) {
        this.venue = venue;
    }

    public Set<AuthorEntity> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<AuthorEntity> authors) {
        this.authors = authors;
    }
}
