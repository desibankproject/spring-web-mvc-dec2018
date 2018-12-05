package com.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.model.Vendor;

//@Component , @Respository , @Service , @Controller
//if your class contains database logic , then we should use @Respository
//<bean id="VendorDao" class="com.spring.dao.VendorDao"/>
@Repository("PVendorDao")
@Scope("singleton")
@Lazy(false)
public class VendorDao {
	
	@Autowired
	
	private JdbcTemplate jdbcTemplate;
	
	public void save(Vendor vendor){
		System.out.println("saving vendor!!!!  = "+vendor);
		System.out.println("saving vendor!!!!  = "+vendor);
		System.out.println("saving vendor!!!!  = "+vendor);
		System.out.println("saving vendor!!!!  = "+vendor);
	}

}
