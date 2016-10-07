package com.example.administrator.myapplication.entity;

/**
 * Created by Administrator on 2016/9/21.
 */
public class Manager {
    private int managerId;
    private String name;
    private String password;
    private int sex;
    private int age;
    private String position;//职位

    public Manager() {
    }

    public Manager(String name, String password, int sex, int age, String position) {
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.position = position;
    }

    public Manager(int managerId, String name, String password, int sex, int age, String position) {
        this.managerId = managerId;
        this.name = name;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.position = position;
    }

    @Override

    public String toString() {
        return "Manager{" +
                "managerId=" + managerId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
