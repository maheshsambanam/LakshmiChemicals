package com.lakshmi.chemicals.entites;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "raw_material")
@PrimaryKeyJoinColumn(name = "product_id", referencedColumnName = "product_id")
public class RawMaterialForProduct extends Product {

	@Override
	public String toString() {
		return "RawMaterialForProduct [productId=" + productId
				+ ", productName=" + productName + ", tariffClassification="
				+ tariffClassification + "]";
	}

}
