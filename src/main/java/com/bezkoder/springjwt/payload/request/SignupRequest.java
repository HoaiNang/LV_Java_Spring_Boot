package com.bezkoder.springjwt.payload.request;

import java.util.Set;

import jakarta.validation.constraints.*;

public class SignupRequest {
  @Size(min = 3, max = 20)
  private String username;

  @Size(max = 50)
  @Email
  private String email;

  @Size(max = 50)
  private String fullname;

  @Size(max = 50)
  private String sCCCD;

  @Size(max = 50)
  private String phone;

  @Size(max = 50)
  private String repassword;

  private Set<String> role;

  @Size(min = 6, max = 40)
  private String password;

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

  public Set<String> getRole() {
    return this.role;
  }

  public void setRole(Set<String> role) {
    this.role = role;
  }

public void setFullname(String fullname) {
    this.fullname = fullname;
  }

  public void setCCCD(String cCCD) {
    this.sCCCD = cCCD;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void setRepassword(String repassword) {
    this.repassword = repassword;
  }

public String getFullname() {
    return fullname;
}

public String getPhone() {
    return phone;
}

public String getCCCD() {
    return sCCCD;
}

public String getRepassword() {
    return repassword;
}

public boolean isActive() {
    return false;
}
}
