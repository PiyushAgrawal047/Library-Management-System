package com.example.lms.database;

public class SignUpForm {
    public String email;
    public String fname;
    public String lname;
    public String mobile;
    public String address;
    public String password;

    public SignUpForm(String email, String fname, String lname, String mobile, String address, String password) {
        this.email = email;
        this.fname = fname;
        this.lname = lname;
        this.mobile = mobile;
        this.address = address;
        this.password = password;
    }
    public SignUpForm()
    {

    }

    public String getEmail() {
        return email;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
