package com.lakshmi.chemicals.service;

import java.util.List;

import com.lakshmi.chemicals.dao.ApplicationDAO;
import com.lakshmi.chemicals.entites.ProductType;

public class ApplicationService {

	private static ApplicationService instance = null;

	private ApplicationService() {
	}

	public static ApplicationService getInstance() {

		if (instance == null) {
			instance = new ApplicationService();
		}

		return instance;

	}

	/**
	 * @mahesh @description Fetching application scope product types
	 * 
	 */

	public List<ProductType> getAllProductTypes() {

		List<ProductType> productType = ApplicationDAO.getInstance()
				.getAllProductTypes();
		return productType;

	}

}
