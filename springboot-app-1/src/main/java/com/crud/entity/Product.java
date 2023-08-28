package com.crud.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "PRODUCT_TBL")
public class Product {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int quantity;
	private double price;
	
	
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}


	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}


	public void setName(Object name2) {
		// TODO Auto-generated method stub
		
	}


	public Object getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}


	public void setQuantity(Object quantity2) {
		// TODO Auto-generated method stub
		
	}


	public Object getPrice() {
		// TODO Auto-generated method stub
		return price;
	}


	public void setPrice(Object price2) {
		// TODO Auto-generated method stub
		
	}
	
}
	
	
	