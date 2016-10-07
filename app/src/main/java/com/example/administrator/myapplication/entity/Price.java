package com.example.administrator.myapplication.entity;

public class Price {
	private int priceId;
	private int categoryId;
	private float price;
	private String unit;
	private float min;// 起步价

	public Price() {
		super();
	}

	public Price(int priceId, int categoryId, float price, String unit,
			float min) {
		super();
		this.priceId = priceId;
		this.categoryId = categoryId;
		this.price = price;
		this.unit = unit;
		this.min = min;
	}

	public int getPriceId() {
		return priceId;
	}

	public void setPriceId(int priceId) {
		this.priceId = priceId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public float getMin() {
		return min;
	}

	public void setMin(float min) {
		this.min = min;
	}

	@Override
	public String toString() {
		return "Price [priceId=" + priceId + ", categoryId=" + categoryId
				+ ", price=" + price + ", unit=" + unit + ", min=" + min + "]";
	}

}
