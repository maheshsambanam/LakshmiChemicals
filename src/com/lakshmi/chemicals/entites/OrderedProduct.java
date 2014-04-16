package com.lakshmi.chemicals.entites;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class OrderedProduct {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "price_of_product")
	private Double priceOfProduct;

	// Getters and setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPriceOfProduct() {
		return priceOfProduct;
	}

	public void setPriceOfProduct(Double priceOfProduct) {
		this.priceOfProduct = priceOfProduct;
	}

	@Override
	public String toString() {
		return "OrderedProduct [id=" + id + ", product=" + product
				+ ", quantity=" + quantity + ", priceOfProduct="
				+ priceOfProduct + "]";
	}

	
}
