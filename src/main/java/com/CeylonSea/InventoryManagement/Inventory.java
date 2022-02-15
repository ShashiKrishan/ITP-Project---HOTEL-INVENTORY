package com.CeylonSea.InventoryManagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Inventory {

	private long id;
	private String name;
	private String type;
	private Integer quantity;
	private float price;
	private String description;
	private String dateaccept;
	private String dateissue;
	
	
	protected Inventory() {
		
	
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDateaccept() {
		return dateaccept;
	}
	public void setDateaccept(String dateaccept) {
		this.dateaccept = dateaccept;
	}
	public String getDateissue() {
		return dateissue;
	}
	public void setDateissue(String dateissue) {
		this.dateissue = dateissue;
	}
	
	
}
