package com.springmvc.library.dao;

import java.util.List;

import com.springmvc.library.modal.Classification;

public interface ClassificationDao {
	public abstract Classification addClassification(Classification classification);
	public abstract List<Classification> listClassification();
}
