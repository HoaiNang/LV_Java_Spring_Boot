package com.bezkoder.springjwt.models;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Contacts")
public class Contacts {
    public Contacts() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="contact_id")
    private int id;

    @Column( length = 255, name = "fullname")
    private String fullname;

    @Column( length = 255, name = "email")
    private String email;

    @Column( length = 255, name = "user_id")
    private String user_id;

    @Column(length = 255, name = "Description")
    private String des;

    public Contacts(int id, String fullname, String email, String user_id, String des, Date createDate) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.user_id = user_id;
        this.des = des;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Contacts [id=" + id + ", fullname=" + fullname + ", email=" + email + ", user_id=" + user_id + ", des="
                + des + ", createDate=" + createDate + "]";
    }

    @Column(length = 255, name = "createDate")
    private Date createDate = new java.util.Date();
}