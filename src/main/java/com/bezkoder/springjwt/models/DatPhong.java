package com.bezkoder.springjwt.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DatPhong")
public class DatPhong {
    public DatPhong() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="datphong_id")
    private int id;

    @Column( length = 255, name = "fullname")
    private String fullname;

    @Column( length = 255, name = "email")
    private String email;

    @Column( length = 255, name = "CCCD")
    private String CCCD;

    @Column(length = 255, name = "phone")
    private String phone;

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

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String cCCD) {
        CCCD = cCCD;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    
}