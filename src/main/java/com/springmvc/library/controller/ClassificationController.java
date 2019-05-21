package com.springmvc.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.library.modal.Classification;
import com.springmvc.library.service.ClassificationService;

@Controller
public class ClassificationController {

	@Autowired
	private ClassificationService classificationService;

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(Model model) {
		model.addAttribute("classification", new Classification());
		return "addclassification";
	}
	
	@RequestMapping(value ="/save", method =RequestMethod.POST)
    public String save(@ModelAttribute("classification") Classification classification) {
		System.out.println(classification.getClassificationName());
		classificationService.addClassification(classification);
		return "redirect:/listclassification";
	}
	
	@RequestMapping(value="/listclassification", method=RequestMethod.GET)
	public ModelAndView save(ModelAndView modelAndView) {
		modelAndView.setViewName("ClassificationList");
		List<Classification> classificationList = classificationService.listClassification();
		modelAndView.addObject("ClassificationList", classificationList);
		return modelAndView;
	}
	

}