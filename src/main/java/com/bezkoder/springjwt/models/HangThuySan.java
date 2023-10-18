package com.bezkoder.springjwt.models;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "cgca_dm_hangthuysan")
public class HangThuySan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID_Loai")
    private int id;
    @Column(nullable = false, length = 255, name = "TenLoai")
    private String tenLoai;
    @Column(length = 255, name = "ToaDo")
    private String coords;
    

    @Column(name = "is_active")
    private Boolean isActive;
    @Column(name = "is_delete")
    private Boolean isDelete;
    @Column(length = 255, name = "create_user")
    private String createUser;
    @Column(length = 255, name = "create_username")
    private String createUsername;
    @Column(name = "create_date")
    private Date createDate = new java.util.Date();
    @Column(name = "update_date")
    private Date updateDate;
    @Column(length = 255, name = "update_user")
    private String updateUser;
    @Column(length = 255, name = "update_username")
    private String updateUsername;
    @Column(name = "delete_date")
    private Date deleteDate;
    @Column(length = 255, name = "delete_user")
    private String deleteUser;
    @Column(length = 255, name = "delete_username")
    private String deleteUsername;
    @Column(name = "ID_NV")
    private int idNV;

    public HangThuySan() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }
    public String getCoords() {
        return coords;
    }

    public void setCoords(String coords) {
        this.coords = coords;
    }
    public boolean getIsActive() {
        return isActive;
    }
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getCreateUsername() {
        return createUsername;
    }

    public void setCreateUsername(String createUsername) {
        this.createUsername = createUsername;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public HangThuySan(int id, String tenLoai, String coords, boolean isActive, boolean isDelete, String createUser,
            String createUsername, Date createDate, Date updateDate, String updateUser, String updateUsername,
            Date deleteDate, String deleteUser, String deleteUsername, int idNV) {
        this.id = id;
        this.tenLoai = tenLoai;
        this.coords = coords;
        this.isActive = isActive;
        this.isDelete = isDelete;
        this.createUser = createUser;
        this.createUsername = createUsername;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.updateUser = updateUser;
        this.updateUsername = updateUsername;
        this.deleteDate = deleteDate;
        this.deleteUser = deleteUser;
        this.deleteUsername = deleteUsername;
        this.idNV = idNV;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getUpdateUsername() {
        return updateUsername;
    }

    public void setUpdateUsername(String updateUsername) {
        this.updateUsername = updateUsername;
    }

    public Date getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(Date deleteDate) {
        this.deleteDate = deleteDate;
    }

    public String getDeleteUser() {
        return deleteUser;
    }

    public void setDeleteUser(String deleteUser) {
        this.deleteUser = deleteUser;
    }

    public String getDeleteUsername() {
        return deleteUsername;
    }

    public void setDeleteUsername(String deleteUsername) {
        this.deleteUsername = deleteUsername;
    }

    public int getIdNV() {
        return idNV;
    }

    public void setIdNV(int idNV) {
        this.idNV = idNV;
    }

    @Override
    public String toString() {
        return "HangThuySan{" +
                "id=" + id +
                ", tenLoai='" + tenLoai + '\'' +
                ", coords='" + coords + '\'' +
                ", isActive=" + isActive +
                ", isDelete=" + isDelete +
                ", createUser='" + createUser + '\'' +
                ", createUsername='" + createUsername + '\'' +
                ", createDate='" + createDate + '\'' +
                ", updateDate=" + updateDate +
                ", updateUser='" + updateUser + '\'' +
                ", updateUsername='" + updateUsername + '\'' +
                ", deleteDate=" + deleteDate +
                ", deleteUser='" + deleteUser + '\'' +
                ", deleteUsername='" + deleteUsername + '\'' +
                ", idNV=" + idNV +
                '}';
    }
}

