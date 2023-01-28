package com.todo.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class ToDo {

    private String id;
    private String description;
    private Date created;
    private Date modified;
    private boolean completed;

    public ToDo(){
        Date date = new Date();
        this.id = UUID.randomUUID().toString();
        this.created = date;
        this.modified = date;
    }

    public ToDo (String description){
        this();
        this.description = description;
    }

}
