package com.cg.spring.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table
public class ScheduledSessions {
	@Id
	@Column(name = "id")
	@NotNull(message = "Id field will not be empty")
	int id;
	@Column(name = "name")
	@NotNull(message = "Name should not empty")
	String name;
	@Column(name = "price")
	int price;
    @Column(name = "discount")
	int discount;
	@Column(name = "discount_price")
	float discount_price;
	public ScheduledSessions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ScheduledSessions(int id, String name, int price, int discount, float discount_price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.discount = discount;
		this.discount_price = discount_price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public float getDiscount_price() {
		return discount_price;
	}
	public void setDiscount_price(float discount_price) {
		this.discount_price = discount_price;
	}
	@Override
	public String toString() {
		return "ScheduledSessions [id=" + id + ", name=" + name + ", price=" + price + ", discount=" + discount
				+ ", discount_price=" + discount_price + "]";
	}
	
}
