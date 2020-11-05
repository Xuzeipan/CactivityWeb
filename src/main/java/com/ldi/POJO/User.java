package com.ldi.POJO;

public class User {
    private int id;//id
    private String stuNumber;  //学号
    private String username;    //姓名
    private String password;    //密码
    private String userClass;   //班级
    private String college;     //学院
    private String phoneNumber;     //手机号码

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", stuNumber='" + stuNumber + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userClass='" + userClass + '\'' +
                ", college='" + college + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserClass() {
        return userClass;
    }

    public void setUserClass(String userClass) {
        this.userClass = userClass;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
