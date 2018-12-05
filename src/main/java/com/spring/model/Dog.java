package com.spring.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//<bean id="dd" class="com.spring.model.Dog" lazy="true" scope="singleton"/>

@Component("dd")
@Lazy(true)
@Scope("singleton")
public class Dog {

	private String name="Tommy!";
	private String color="white";
	
	
	public Dog(){
		System.out.println("This is Dog DC constructor .......");
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void bark(){
		System.out.println("Dog barks at night!!!!!!!!!!!!!!!!!!!!");
	}
	
	public void show(){
		System.out.println("Hey my name is  = "+this.name);
		System.out.println("Hey my color is  = "+this.color);
	}
}
