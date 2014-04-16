package com.lakshmi.chemicals.entites;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "daily_production_maintenance")
public class DailyProductionMaintenance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@ManyToOne
	@JoinColumn(name = "raw_product_id_one")
	private Product rawMaterialOne;
	@Column(name = "quantity_of_product_one")
	private int quantityOfTheProductOne;
	@ManyToOne
	@JoinColumn(name = "raw_product_id_two")
	private Product rawMaterialTwo;
	@Column(name = "quantity_of_product_two")
	private int quantityOftheProductTwo;
	@ManyToOne
	@JoinColumn(name = "firewood_product_id")
	private Product fireWood;
	@Column(name = "quantity_of_product_three")
	private int quantityOfTheProductThree;
	@ManyToOne
	@JoinColumn(name = "production_product_id")
	private Product productionProduct;
	@Column(name = "quantity_production_product")
	private int quantityOfTheProductionProduct;
	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Date date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getRawMaterialOne() {
		return rawMaterialOne;
	}

	public void setRawMaterialOne(Product rawMaterialOne) {
		this.rawMaterialOne = rawMaterialOne;
	}

	public int getQuantityOfTheProductOne() {
		return quantityOfTheProductOne;
	}

	public void setQuantityOfTheProductOne(int quantityOfTheProductOne) {
		this.quantityOfTheProductOne = quantityOfTheProductOne;
	}

	public Product getRawMaterialTwo() {
		return rawMaterialTwo;
	}

	public void setRawMaterialTwo(Product rawMaterialTwo) {
		this.rawMaterialTwo = rawMaterialTwo;
	}

	public int getQuantityOftheProductTwo() {
		return quantityOftheProductTwo;
	}

	public void setQuantityOftheProductTwo(int quantityOftheProductTwo) {
		this.quantityOftheProductTwo = quantityOftheProductTwo;
	}

	public Product getFireWood() {
		return fireWood;
	}

	public void setFireWood(Product fireWood) {
		this.fireWood = fireWood;
	}

	public int getQuantityOfTheProductThree() {
		return quantityOfTheProductThree;
	}

	public void setQuantityOfTheProductThree(int quantityOfTheProductThree) {
		this.quantityOfTheProductThree = quantityOfTheProductThree;
	}

	public Product getProductionProduct() {
		return productionProduct;
	}

	public void setProductionProduct(Product productionProduct) {
		this.productionProduct = productionProduct;
	}

	public int getQuantityOfTheProductionProduct() {
		return quantityOfTheProductionProduct;
	}

	public void setQuantityOfTheProductionProduct(
			int quantityOfTheProductionProduct) {
		this.quantityOfTheProductionProduct = quantityOfTheProductionProduct;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "DailyProductionMaintenance [id=" + id + ", rawMaterialOne="
				+ rawMaterialOne + ", quantityOfTheProductOne="
				+ quantityOfTheProductOne + ", rawMaterialTwo="
				+ rawMaterialTwo + ", quantityOftheProductTwo="
				+ quantityOftheProductTwo + ", fireWood=" + fireWood
				+ ", quantityOfTheProductThree=" + quantityOfTheProductThree
				+ ", productionProduct=" + productionProduct
				+ ", quantityOfTheProductionProduct="
				+ quantityOfTheProductionProduct + ", date=" + date + "]";
	}

}
