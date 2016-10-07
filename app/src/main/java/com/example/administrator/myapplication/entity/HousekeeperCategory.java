package com.example.administrator.myapplication.entity;

/**
 * Created by Administrator on 2016/9/21.
 */
public class HousekeeperCategory {
    private int housekeeperCategoryId;
    private Housekeeper housekeeper;
    private Category category;
    private float price;

    public HousekeeperCategory() {
    }

    public HousekeeperCategory(Housekeeper housekeeper, Category category, float price) {
        this.housekeeper = housekeeper;
        this.category = category;
        this.price = price;
    }

    public HousekeeperCategory(Housekeeper housekeeper, int housekeeperCategoryId, Category category, float price) {
        this.housekeeper = housekeeper;
        this.housekeeperCategoryId = housekeeperCategoryId;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString() {
        return "HousekeeperCategory{" +
                "housekeeperCategoryId=" + housekeeperCategoryId +
                ", housekeeper=" + housekeeper +
                ", category=" + category +
                ", price=" + price +
                '}';
    }

    public int getHousekeeperCategoryId() {
        return housekeeperCategoryId;
    }

    public void setHousekeeperCategoryId(int housekeeperCategoryId) {
        this.housekeeperCategoryId = housekeeperCategoryId;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
