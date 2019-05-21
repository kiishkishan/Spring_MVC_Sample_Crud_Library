package com.springmvc.library.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.springmvc.library.dao.ClassificationDao;
import com.springmvc.library.modal.Classification;

public class ClassificationServiceImpl implements ClassificationService {

//	private ClassificationDao classificationDao;
//
//	public ClassificationDao getClassificationDao() {
//		return classificationDao;
//	}
//
//	public void setClassificationDao(ClassificationDao classificationDao) {
//		this.classificationDao = classificationDao;
//	}
//	
//	public Classification addClassification(Classification classification) {
//		return classificationDao.addClassification(classification);
//	}
//	
	@Autowired
	private ClassificationDao classificationDao;


	public void setClassificationDao(ClassificationDao classificationDao) {
		this.classificationDao = classificationDao;
	}
	
	public Classification addClassification(Classification classification) {
		return classificationDao.addClassification(classification);
	}

	public List<Classification> listClassification() {
		classificationDao.listClassification();
		return null;
	}
}
