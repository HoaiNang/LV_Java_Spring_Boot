package com.bezkoder.springjwt.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "users", 
    uniqueConstraints = { 
      @UniqueConstraint(columnNames = "username"),
      @UniqueConstraint(columnNames = "email"),
      @UniqueConstraint(columnNames = "fullname"),
      @UniqueConstraint(columnNames = "sCCCD"),
      @UniqueConstraint(columnNames = "phone"),
      @UniqueConstraint(columnNames = "password"),
      @UniqueConstraint(columnNames = "repassword"),
      @UniqueConstraint(columnNames = "isActive")
    })
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Size(max = 100)
  private String fullname;

  @Size(max = 12)
  private String phone;

  @Size(max = 20)
  private String sCCCD;

  @Size(max = 20)
  private String username;

  @Size(max = 50)
  @Email
  private String email;

  @Size(max = 120)
  private String password;

  @Size(max = 20)
  private String repassword;

  private boolean isActive;

  @ManyToMany(fetch = FetchType.LAZY)
  @JoinTable(  name = "user_roles", 
        joinColumns = @JoinColumn(name = "user_id"), 
        inverseJoinColumns = @JoinColumn(name = "role_id"))
  private Set<Role> roles = new HashSet<>();

  public User() {
  }

  public User(String username, String email, String password, String fullname, String phone, String sCCCD, String repassword, boolean isActive) {
    this.username = username;
    this.email = email;
    this.password = password;
    this.fullname = fullname;
    this.phone = phone;
    this.sCCCD = sCCCD;
    this.repassword = repassword;
    this.isActive = isActive;
  }

  public Long getId() {
    return id;
  }

  public String getFullname() {
    return fullname;
  }

  public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getCCCD() {
    return sCCCD;
  }

  public void setCCCD(String sCCCD) {
    this.sCCCD = sCCCD;
  }

  public String getRepassword() {
    return repassword;
  }

  public void setRepassword(String repassword) {
    this.repassword = repassword;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean isActive) {
    this.isActive = isActive;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }
}
