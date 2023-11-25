package com.bezkoder.springjwt.models;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Comments")
public class Comments {
    public Comments() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="comment_id")
    private int id;

    @Column( length = 255, name = "user_id")
    private String user_id;

    @Column(length = 255, name = "Description")
    private String description;

    @Column(length = 255, name = "createDate")
    private Date createDate = new java.util.Date();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Comments(int id, String user_id, String description, Date createDate) {
        this.id = id;
        this.user_id = user_id;
        this.description = description;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Comments [id=" + id + ", user_id=" + user_id + ", description=" + description + ", createDate="
                + createDate + "]";
    }

    
}
