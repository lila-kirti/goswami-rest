package bvg.criteria;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * @author lgalimova
 * @since 14.02.2017
 */
public class Criteria implements Serializable {
    private int page = 1;
    private int size = 10;
    private int count;
    private String sortingField;
    private String sortingDirection;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getSortingField() {
        return sortingField;
    }

    public void setSortingField(String sortingField) {
        this.sortingField = sortingField;
    }

    public String getSortingDirection() {
        return sortingDirection;
    }

    public void setSortingDirection(String sortingDirection) {
        this.sortingDirection = sortingDirection;
    }
}
