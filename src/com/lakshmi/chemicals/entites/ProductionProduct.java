package com.lakshmi.chemicals.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "production_product")
@PrimaryKeyJoinColumn(name = "product_id", referencedColumnName = "product_id")
public class ProductionProduct extends Product {

	@Column(name = "quantity_kg")
	private int quantityPerKg;
	@Column(name = "rate_kg")
	private int ratePerKg;
	@Column(name = "per")
	private String per;

	public int getQuantityPerKg() {
		return quantityPerKg;
	}

	// getters and setters
	public void setQuantityPerKg(int quantityPerKg) {
		this.quantityPerKg = quantityPerKg;
	}

	public int getRatePerKg() {
		return ratePerKg;
	}

	public void setRatePerKg(int ratePerKg) {
		this.ratePerKg = ratePerKg;
	}

	public String getPer() {
		return per;
	}

	public void setPer(String per) {
		this.per = per;
	}

	@Override
	public String toString() {
		return "ProductionProduct [quantityPerKg=" + quantityPerKg
				+ ", ratePerKg=" + ratePerKg + ", per=" + per + ", productId="
				+ productId + ", productName=" + productName
				+ ", tariffClassification=" + tariffClassification + "]";
	}

}
