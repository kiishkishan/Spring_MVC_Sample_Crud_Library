package com.springmvc.library.service;

import java.util.List;

import com.springmvc.library.modal.Classification;

public interface ClassificationService {
	public abstract Classification addClassification(Classification classification);
	public abstract List<Classification> listClassification();
}
