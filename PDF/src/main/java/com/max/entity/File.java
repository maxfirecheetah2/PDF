package com.max.entity;

import com.sun.istack.internal.NotNull;

import javax.persistence.*;

/**
 * Created by mtsylko on 12/3/2014.
 */
@Entity
@Table(name = "file")
public class File {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private int id;

    @Column(name = "path")
    @NotNull
    private String path;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }




}
