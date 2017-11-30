package org.grocery.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Item_Table")

public class Item {
	@GeneratedValue
	@Id
	@Column(name = "Item_Id")
	private int id;
	@Column(name = "Name")
	private String name;
	@Column(name = "Quantity")
	private int quantity;
	@Column(name = "Item_Price")
	private double price;
	static private int totalNoOfProducts;
	
	static{
		Item.totalNoOfProducts=0;
	}
	
	public static int getTotalNoOfProducts() {
		return totalNoOfProducts;
	}
	
	public Item() {
		super();
		Item.totalNoOfProducts++; 
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}