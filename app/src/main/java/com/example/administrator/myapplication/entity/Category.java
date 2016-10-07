package com.example.administrator.myapplication.entity;

import java.util.List;

/**
 * Created by Administrator on 2016/9/21.
 */
public class Category {
	private int categoryId;
	private String name;
	private String profile;// 简介
	private String slogan;// 标语
	private String type;
	private String photo;
	private String prompt;
	private List<Price> prices;

	public Category(int categoryId, String name, String profile, String slogan,
			String type, String photo, String prompt, List<Price> prices) {
		super();
		this.categoryId = categoryId;
		this.name = name;
		this.profile = profile;
		this.slogan = slogan;
		this.type = type;
		this.photo = photo;
		this.prompt = prompt;
		this.prices = prices;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}

	public List<Price> getPrices() {
		return prices;
	}

	public void setPrices(List<Price> prices) {
		this.prices = prices;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", name=" + name
				+ ", profile=" + profile + ", slogan=" + slogan + ", type="
				+ type + ", photo=" + photo + ", prompt=" + prompt
				+ ", prices=" + prices + "]";
	}

}
