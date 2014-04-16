package com.lakshmi.chemicals.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.lakshmi.chemicals.entites.ProductType;
import com.lakshmi.chemicals.entitymanager.EntityUtil;

public class ApplicationDAO extends HibernateBean {

	private static final String GET_ALL_PRODUCT_TYPES = "APPLICATIONDAO.GET_ALL_PRODUCT_TYPES";

	private static ApplicationDAO instance = null;

	private ApplicationDAO() {
	}

	public static ApplicationDAO getInstance() {

		if (instance == null) {
			instance = new ApplicationDAO();
		}

		return instance;

	}

	// @Mahesh @description : Fetching product types for application scope
	public List<ProductType> getAllProductTypes() {
		EntityManager entity = getEntityManager();
		entity.getTransaction().begin();
		Query query = entity.createQuery(EntityUtil.getInstance().getHQLQuery(
				GET_ALL_PRODUCT_TYPES));
		@SuppressWarnings("unchecked")
		List<ProductType> productType = (List<ProductType>) query
				.getResultList();
		entity.getTransaction().commit();
		return productType;
	}
}
