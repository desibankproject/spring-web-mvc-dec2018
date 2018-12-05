
package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Dog;

public class DogSpringMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating spring container =??????>>>>new ClassPathXmlApplicationContext("profiles.xml");
				//ApplicationContext an interface to access spring container
				ApplicationContext applicationContext=new ClassPathXmlApplicationContext("dogs.xml");
				Dog dog1=(Dog)applicationContext.getBean("dd");
				dog1.bark();
				dog1.show();
				
				Dog dog2=(Dog)applicationContext.getBean("dog");
				dog2.bark();
				dog2.show();
	}

}
