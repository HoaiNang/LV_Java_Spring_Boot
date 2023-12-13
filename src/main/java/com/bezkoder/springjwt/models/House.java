package com.bezkoder.springjwt.models;
import com.bezkoder.springjwt.entity.LuuAnh;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "house")
public class House {
    public House() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="house_id")
    private int id;

    @Column( length = 255, name = "Title")
    private String titles;

    @Column(length = 255, name = "Description")
    private String desc;

    @Column(length = 255, name = "Address")
    private String addr;

    @Column(length = 255, name = "Phone")
    private String phone;

    @Column(length = 255, name = "Rent_price")
    private float rent_price;

    @Column(length = 255, name = "Number_room")
    private int nroom;

    @Column(length = 255, name = "Number_blank_room")
    private int nbroom;

    @Column(name = "user_id")
    private int user_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return titles;
    }

    public void setTitle(String titles) {
        this.titles = titles;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getRent_price() {
        return rent_price;
    }

    public void setRent_price(float rent_price) {
        this.rent_price = rent_price;
    }

    public int getNroom() {
        return nroom;
    }

    public void setNroom(int nroom) {
        this.nroom = nroom;
    }

    public int getNbroom() {
        return nbroom;
    }

    public void setNbroom(int nbroom) {
        this.nbroom = nbroom;
    }


    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


    public House(int id, String titles, String desc, String addr, String phone, float rent_price, int nroom, int nbroom,
              int user_id) {
        this.id = id;
        this.titles = titles;
        this.desc = desc;
        this.addr = addr;
        this.phone = phone;
        this.rent_price = rent_price;
        this.nroom = nroom;
        this.nbroom = nbroom;
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "House [id=" + id + ", title=" + titles + ", desc=" + desc + ", addr=" + addr + ", phone=" + phone
                + ", rent_price=" + rent_price + ", nroom=" + nroom + ", nbroom=" + nbroom + ", user_id=" + user_id + "]";
    }

    
}
