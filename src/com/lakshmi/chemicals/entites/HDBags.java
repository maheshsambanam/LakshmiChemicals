package com.lakshmi.chemicals.entites;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "hd_bags")
@PrimaryKeyJoinColumn(name = "hd_bag_id", referencedColumnName = "product_id")
public class HDBags extends Product {

	@Override
	public String toString() {
		return "HDBags [productId=" + productId + ", productName="
				+ productName + ", tariffClassification="
				+ tariffClassification + ", productType=" + productType + "]";
	}
	
	
	

}
