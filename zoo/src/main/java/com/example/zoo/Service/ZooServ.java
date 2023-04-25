package com.example.zoo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.zoo.Model.ZooMod;
import com.example.zoo.Repo.ZooRepo;
@Service
public class ZooServ {
	@Autowired
	public ZooRepo zrep;
	public Object deletedetails;

	public ZooMod saveinfo(ZooMod zr) {
		// TODO Auto-generated method stub
		return zrep.save(zr);
	}
	public void deletedetails(int id) {
		// TODO Auto-generated method stub
		zrep.deleteById(id);
	}


	

	
}
