package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
////@Component , @Respository , @Service , @Controller

import com.spring.dao.VendorDao;
import com.spring.model.Vendor;

@Service("VendorService")
public class VendorService {
	
	//<property name="vendorDao" ref="PVendorDao"/>
	@Autowired
	@Qualifier("PVendorDao")
	private VendorDao vendorDao;
	
	public void saveVendor(Vendor vendor){
		System.out.println("Before saving vendor!!!!!!!!!!!!!");
		vendorDao.save(vendor);
		System.out.println("Vendor is saved into the database!");
	}
	
	

}
