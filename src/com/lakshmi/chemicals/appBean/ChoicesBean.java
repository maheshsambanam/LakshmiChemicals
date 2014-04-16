package com.lakshmi.chemicals.appBean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.lakshmi.chemicals.entites.ProductType;
import com.lakshmi.chemicals.service.ApplicationService;

@ApplicationScoped
@ManagedBean
public class ChoicesBean implements Serializable {

	/**
	 * Application Bean Created by Mahesh
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<ProductType> productTypes = null;

	@PostConstruct
	public void init() {

		productTypes = ApplicationService.getInstance().getAllProductTypes();

		System.out.println(productTypes);

	}

	/**
	 * Getters and setters
	 */

	public List<ProductType> getProductTypes() {
		return productTypes;
	}

	public void setProductTypes(List<ProductType> productTypes) {
		this.productTypes = productTypes;
	}

}
