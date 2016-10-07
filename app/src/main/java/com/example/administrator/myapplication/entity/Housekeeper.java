package com.example.administrator.myapplication.entity;

/**
 * Created by Administrator on 2016/9/21.
 */
public class Housekeeper {
    private  int housekeeperId;
    private  int sex;
    private  int age;
    private  String name;
    private int  serviceplevel;

    public Housekeeper() {
    }

    public Housekeeper(int sex, int age, String name, int serviceplevel) {
        this.sex = sex;
        this.age = age;
        this.name = name;
        this.serviceplevel = serviceplevel;
    }

    public Housekeeper(int housekeeperId, int sex, int age, String name, int serviceplevel) {
        this.housekeeperId = housekeeperId;
        this.sex = sex;
        this.age = age;
        this.name = name;
        this.serviceplevel = serviceplevel;
    }

    @Override
    public String toString() {
        return "Housekeeper{" +
                "housekeeperId=" + housekeeperId +
                ", sex=" + sex +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", serviceplevel=" + serviceplevel +
                '}';
    }

    public int getHousekeeperId() {
        return housekeeperId;
    }

    public void setHousekeeperId(int housekeeperId) {
        this.housekeeperId = housekeeperId;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getServiceplevel() {
        return serviceplevel;
    }

    public void setServiceplevel(int serviceplevel) {
        this.serviceplevel = serviceplevel;
    }
}
