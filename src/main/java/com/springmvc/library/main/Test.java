package com.springmvc.library.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springmvc.library.modal.Classification;
import com.springmvc.library.service.ClassificationService;
import com.springmvc.library.service.ClassificationServiceImpl;

public class Test {
	public static void main (String args[]) {
	AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");
	ClassificationService classificationService = ctx.getBean("classificationService", ClassificationServiceImpl.class);
	Classification classification = new Classification();

	classification.setClassificationName("Spring");
	classificationService.addClassification(classification);
	}
}
