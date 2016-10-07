package com.example.administrator.myapplication.entity;

import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by Administrator on 2016/9/21.
 */
public class Order {
    private int orderId;
    private User user;
    private Address address;
    private Timestamp time;//    可以把 yyyy-MM-dd hh:mm:ss 字符串转化为此类型
    private int state;//状态 1.提交未付款， 2.已付款服务时间未到 3.过了服务时间未评价 4.已评价订单完成 5、申诉
    private float price;
    private Timestamp begdate;
    private int workerTime;
    private Housekeeper housekeeper;
    private Category category;
    private Time arriveTime;

    public Order() {
    }

    public Order(User user, Address address, Timestamp time, int state, float price, Timestamp begdate, int workerTime, Housekeeper housekeeper, Category category, Time arriveTime) {
        this.user = user;
        this.address = address;
        this.time = time;
        this.state = state;
        this.price = price;
        this.begdate = begdate;
        this.workerTime = workerTime;
        this.housekeeper = housekeeper;
        this.category = category;
        this.arriveTime = arriveTime;
    }

    public Order(int orderId, User user, Address address, Timestamp time, int state, float price, Timestamp begdate, int workerTime, Category category, Housekeeper housekeeper, Time arriveTime) {
        this.orderId = orderId;
        this.user = user;
        this.address = address;
        this.time = time;
        this.state = state;
        this.price = price;
        this.begdate = begdate;
        this.workerTime = workerTime;
        this.category = category;
        this.housekeeper = housekeeper;
        this.arriveTime = arriveTime;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Timestamp getBegdate() {
        return begdate;
    }

    public void setBegdate(Timestamp begdate) {
        this.begdate = begdate;
    }

    public int getWorkerTime() {
        return workerTime;
    }

    public void setWorkerTime(int workerTime) {
        this.workerTime = workerTime;
    }

    public Housekeeper getHousekeeper() {
        return housekeeper;
    }

    public void setHousekeeper(Housekeeper housekeeper) {
        this.housekeeper = housekeeper;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Time getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Time arriveTime) {
        this.arriveTime = arriveTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", user=" + user +
                ", address=" + address +
                ", time=" + time +
                ", state=" + state +
                ", price=" + price +
                ", begdate=" + begdate +
                ", workerTime=" + workerTime +
                ", housekeeper=" + housekeeper +
                ", category=" + category +
                ", arriveTime=" + arriveTime +
                '}';
    }
}
