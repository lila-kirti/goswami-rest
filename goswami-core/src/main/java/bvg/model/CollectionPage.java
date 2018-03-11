package bvg.model;


import bvg.criteria.Criteria;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import springfox.documentation.annotations.ApiIgnore;

import java.io.Serializable;
import java.util.List;

/**
 * @author lgalimova
 * @since 12.02.2017
 */
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class CollectionPage<T> implements Serializable {
    private Integer total;
    private List<T> list;
    private Criteria criteria;

    public CollectionPage(int count, List<T> collection, Criteria criteria) {
        this.criteria = criteria;
        this.total = count;
        this.list = collection;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void setCount(Integer count) {
        this.total = count;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @ApiIgnore
    public Criteria getCriteria() {
        return criteria;
    }

    public void setCriteria(Criteria criteria) {
        this.criteria = criteria;
    }
}
