package com.example.administrator.myapplication.entity;

/**
 * Created by Administrator on 2016/9/21.
 */
public class User {
    private int userId;
    private String name;
    private int sex;
    private String photo;//图片路径
    private int age;
    private String password;
    private String number;

    public User() {
    }

    public User(String name, int sex, String photo, int age, String password, String number) {
        this.name = name;
        this.sex = sex;
        this.photo = photo;
        this.age = age;
        this.password = password;
        this.number = number;
    }

    public User(int userId, String name, int sex, String photo, int age, String password, String number) {
        this.userId = userId;
        this.name = name;
        this.sex = sex;
        this.photo = photo;
        this.age = age;
        this.password = password;
        this.number = number;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", photo='" + photo + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", number='" + number + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
