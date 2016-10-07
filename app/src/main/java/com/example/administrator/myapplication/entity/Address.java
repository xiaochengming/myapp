package com.example.administrator.myapplication.entity;

/**
 * Created by Administrator on 2016/9/21.
 */
public class Address {
    private int addressId;
    private String address;
    private String userName;//订单的联系人
    private String phone;//订单联系电话
    private User user;

    public Address() {
    }

    public Address(String address, String userName, String phone, User user) {
        this.address = address;
        this.userName = userName;
        this.phone = phone;
        this.user = user;
    }

    public Address(int addressId, String address, String userName, String phone, User user) {
        this.addressId = addressId;
        this.address = address;
        this.userName = userName;
        this.phone = phone;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", address='" + address + '\'' +
                ", userName='" + userName + '\'' +
                ", phone='" + phone + '\'' +
                ", user=" + user +
                '}';
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
