package com.lakshmi.chemicals.entites;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "firewood")
@PrimaryKeyJoinColumn(name = "product_id", referencedColumnName = "product_id")
public class FireWood extends Product {

	@Override
	public String toString() {
		return "FireWood [productId=" + productId + ", productName="
				+ productName + ", tariffClassification="
				+ tariffClassification + ", productType=" + productType + "]";
	}

	
	
	
	

}
