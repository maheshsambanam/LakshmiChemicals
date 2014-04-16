package com.lakshmi.chemicals.entitymanager;

import java.util.ResourceBundle;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityUtil {

	private static EntityUtil instance = null;

	private EntityUtil() {
	}

	public static EntityUtil getInstance() {

		if (instance == null) {
			instance = new EntityUtil();
		}

		return instance;

	}

	private static final String PERSISTANCE = "chemicalJPA";

	public static EntityManager getEntityManager() {

		EntityManagerFactory entityFactory = Persistence
				.createEntityManagerFactory(PERSISTANCE);
		EntityManager entity = entityFactory.createEntityManager();

		return entity;

	}

	public String getHQLQuery(String key) {

		ResourceBundle resourceBundle = ResourceBundle
				.getBundle("com/lakshmi/chemicals/queries/HQLQuery");
		return resourceBundle.getString(key);

	}

}
