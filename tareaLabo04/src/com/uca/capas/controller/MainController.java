package com.uca.capas.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Product;

@Controller
public class MainController {

	//Controlador por defecto
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		Product product = new Product();
		mav.addObject("message", "A�adir producto");
		mav.addObject("product",product);
		mav.setViewName("main");
		return mav;
	}
	
	@RequestMapping("/formData")
	public ModelAndView form(@Valid @ModelAttribute Product product,BindingResult result) {
		ModelAndView mav= new ModelAndView();
		if(result.hasErrors()) {
			mav.addObject("message","Errores al enviar formulario");
			mav.setViewName("main");
		}
		else {
			mav.addObject("message","Producto agregado");
			mav.setViewName("form");
		}
		
		return mav;
	}

}