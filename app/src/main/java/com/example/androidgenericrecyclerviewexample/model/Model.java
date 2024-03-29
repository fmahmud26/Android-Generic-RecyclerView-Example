package com.example.androidgenericrecyclerviewexample.model;

import com.example.androidgenericrecyclerviewexample.adapter.ItemInnerListAdapter;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private int id;
    private String name;
    private String type;
    private boolean isExpended;
    private List<InnerListModel> innerListModels = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isExpended() {
        return isExpended;
    }

    public void setExpended(boolean expended) {
        isExpended = expended;
    }

    public List<InnerListModel> getInnerListModels() {
        return innerListModels;
    }

    public void setInnerListModels(List<InnerListModel> innerListModels) {
        this.innerListModels = innerListModels;
    }
}
