package com.lakshmi.chemicals.dao;

import javax.persistence.EntityManager;

import com.lakshmi.chemicals.entitymanager.EntityUtil;

public class HibernateBean {

	protected EntityManager getEntityManager() {
		return EntityUtil.getEntityManager();
	}

}
