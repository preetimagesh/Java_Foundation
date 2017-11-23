package org.grocery.stock;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ITEM_TABLE")
public class Item {

	@GeneratedValue
	@Column(name = "ITEM_ID")
	@Id
	private int id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "QUANTITY")
	private int quantity;
	@Column(name = "PRICE")
	private double price;
	private static int totalNoOfProducts; 

	static{
		Item.totalNoOfProducts=0;
	}	
	public static int getTotalNoOfProducts() {
		return totalNoOfProducts;
	}

	public Item() {
		super();
		Item.totalNoOfProducts++;
		// TODO Auto-generated constructor stub
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
