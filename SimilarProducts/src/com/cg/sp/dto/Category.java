package com.cg.sp.dto;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Category")
public class Category {
	
	public Category() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private int categoryId;
	private String catName;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	
	@Override
	public String toString() {
		return "Category [productId=" + productId + ", categoryId="
				+ categoryId + ", catName=" + catName + "]";
	}
	
}
