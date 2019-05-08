package com.uca.capas.domain;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product {
	
	@NotNull
	@Size(message="La longitud debe ser máx de 30 caracteres",min=1,max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String name;
	
	@NotNull
	@Size(message="La longitud debe ser máx de 30 caracteres",min=1,max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String brand;
	
	@NotNull
	@Size(message="La longitud debe ser máx de 30 caracteres",min=1,max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String desc;
	
	@NotNull
	@Size(message="La longitud debe ser máx de 30 caracteres",min=1,max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String cat;
	
	@NotNull
	@Pattern(regexp="^\\d*\\.{0,1}\\d+$", message="El precio debe ser positivo")
	@Size(message="La longitud debe ser máx de 30 caracteres",min=1,max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String price;
	
	@NotNull
	@Pattern(regexp="^[0-9]{2}/[0-9]{2}/[0-9]{4}$", message="La fecha debe tener el formato dd/mm/yyyy")
	@Size(message="La longitud debe ser máx de 30 caracteres",min=1,max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String date;
	
	public Product(String name, String brand, String desc, String cat, String price, String date) {
		super();
		this.name = name;
		this.brand = brand;
		this.desc = desc;
		this.cat = cat;
		this.price = price;
		this.date = date;
	}

	public Product() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	
	
	
}
