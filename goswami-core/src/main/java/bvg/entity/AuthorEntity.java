package bvg.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author lgalimova
 * @since 11.03.2018
 */
@Entity
@Table(name = "authors")
public class AuthorEntity implements Serializable{
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
