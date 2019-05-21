package com.springmvc.library.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springmvc.library.modal.Classification;

public class ClassificationDaoImpl implements ClassificationDao {
	
//	private HibernateTemplate hibernateTemplate;
//
//	public HibernateTemplate getHibernateTemplate() {
//		return hibernateTemplate;
//	}
//
//	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
//		this.hibernateTemplate = hibernateTemplate;
//	}
//
//	public Classification addClassification(Classification classification) {
//
//		hibernateTemplate.save(classification);
//		return null;
//	}
	
	@Autowired
	private HibernateTemplate hibernateTemplate;


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public Classification addClassification(Classification classification) {

		hibernateTemplate.save(classification);
		return null;
	}

	public List<Classification> listClassification() {
		List<Classification> list = new ArrayList<Classification>();
		list = hibernateTemplate.loadAll(Classification.class);
		return list;
	}
}
