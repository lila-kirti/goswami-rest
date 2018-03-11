package bvg.model;

import java.io.Serializable;

/**
 * @author lgalimova
 * @since 11.03.2018
 */
public class SimpleDirectory implements Serializable {
    private Integer id;
    private String name;

    public SimpleDirectory() {
    }

    public SimpleDirectory(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

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
