package com.lakshmi.chemicals.entites;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
@Inheritance(strategy = InheritanceType.JOINED)
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	protected int productId;
	@Column(name = "product_name")
	protected String productName;
	@Column(name = "tariff_classfication")
	protected String tariffClassification;
	@ManyToOne
	@JoinColumn(name = "product_type")
	protected ProductType productType;

	// getters and setters

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getTariffClassification() {
		return tariffClassification;
	}

	public void setTariffClassification(String tariffClassification) {
		this.tariffClassification = tariffClassification;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

}
