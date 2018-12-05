
package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.model.Dog;
import com.spring.model.Vendor;
import com.spring.service.VendorService;

public class SaveVendorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating spring container =??????>>>>new ClassPathXmlApplicationContext("profiles.xml");
				//ApplicationContext an interface to access spring container
				ApplicationContext applicationContext=new ClassPathXmlApplicationContext("vendor-service-dao.xml");
				VendorService vendorService=(VendorService)applicationContext.getBean("VendorService");
				Vendor vendor=new Vendor();
				vendor.setAddress("Fremont!");
				vendor.setEmail("vebdir@gmail.com");
				vendor.setName("Ametttt");
				vendor.setSsn("12-32822");
				vendorService.saveVendor(vendor);
				System.out.println("@)@)@DONE!(@(@(");
	}

}
