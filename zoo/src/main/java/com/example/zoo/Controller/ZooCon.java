
package com.example.zoo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.zoo.Model.ZooMod;
import com.example.zoo.Service.ZooServ;
@RestController
public class ZooCon {
	@Autowired
public ZooServ zser;
	
	
	@PostMapping("/arungiri")
	public ZooMod adddetails(@RequestBody ZooMod zr)
	{
		return zser.saveinfo(zr);
	}
	
	@DeleteMapping("/arungiri/{id}")
	public String deletedetails(@PathVariable("id")int id)
	{
		zser.deletedetails(id);
		return "Delete successfully!!!!";
	}
}
