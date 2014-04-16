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
@Table(name = "raw_material_maintenance")
public class RawMaterialStockMaintanence {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "date")
	@Temporal(TemporalType.DATE)
	private Date date;
	@Column(name = "opening_stock")
	private int openingStock;
	@Column(name = "received")
	private int received;
	@Column(name = "total")
	private int total;
	@Column(name = "used_for_production")
	private int usedForProduction;
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

	public int getReceived() {
		return received;
	}

	public void setReceived(int received) {
		this.received = received;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getUsedForProduction() {
		return usedForProduction;
	}

	public void setUsedForProduction(int usedForProduction) {
		this.usedForProduction = usedForProduction;
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
		return "RawMaterialStockMaintanence [id=" + id + ", date=" + date
				+ ", openingStock=" + openingStock + ", received=" + received
				+ ", total=" + total + ", usedForProduction="
				+ usedForProduction + ", closingStock=" + closingStock
				+ ", product=" + product + "]";
	}
	
	

}
