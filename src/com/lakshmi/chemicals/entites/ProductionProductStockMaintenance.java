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
@Table(name = "production_product_stock_maintenance")
public class ProductionProductStockMaintenance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Date date;
	@Column(name = "opening_stock")
	private int openingStock;
	@Column(name = "production_stock")
	private int producedStock;
	@Column(name = "total")
	private int total;
	@Column(name = "despatched")
	private int despatched;
	@Column(name = "closing_stock")
	private int closingStock;
	@ManyToOne
	@JoinColumn(name = "product_id")
	private Product product;

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getOpeningStock() {
		return openingStock;
	}

	public void setOpeningStock(int openingStock) {
		this.openingStock = openingStock;
	}

	public int getProducedStock() {
		return producedStock;
	}

	public void setProducedStock(int producedStock) {
		this.producedStock = producedStock;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getDespatched() {
		return despatched;
	}

	public void setDespatched(int despatched) {
		this.despatched = despatched;
	}

	public int getClosingStock() {
		return closingStock;
	}

	public void setClosingStock(int closingStock) {
		this.closingStock = closingStock;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "ProductionProductStockMaintenance [id=" + id + ", date=" + date
				+ ", openingStock=" + openingStock + ", producedStock="
				+ producedStock + ", total=" + total + ", despatched="
				+ despatched + ", closingStock=" + closingStock + ", product="
				+ product + "]";
	}

	
	
}
