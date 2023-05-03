package com.example.zoo.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.zoo.Model.AnimalMod;
import com.example.zoo.Service.AnimalServ;



@RestController

public class AnimalCon
{
	@Autowired

	public AnimalServ ser;

	

	@PostMapping("/arungiri")

	public List<AnimalMod> savedetails(@RequestBody AnimalMod zo)

	{
		return ser.sortDetails(zo);
	}

	@GetMapping("/arungiri")

	public List<AnimalMod>getall()

	{

		return ser.getall();

	}

	@DeleteMapping("/arungiri/{id}")

	public String deletebyid(@PathVariable("id")int id)

	{

		ser.deletebyid(id);

		return "the Deletion was successful";

	}

	@DeleteMapping("/arungiribyreqparam")

	public String deleteidusingreqparam(@RequestParam("id")int id)

	{

		ser.deletebyid(id);

		return "the Deletion was successful";

	}

	@PutMapping("/update")

	public Object updatedetails(@RequestBody Zooinfo zo)

	{

		return ser.savedetails(zo);

	}

	@GetMapping("/anu/{name}")

	public List<AnimalMod> sortDetails(@PathVariable("name") AnimalMod name)

	{

		return ser.sortDetails(name);

	}

	

	

	@GetMapping("/arungiri/{pnu}/{psize}")

	public List<AnimalMod> page(@PathVariable("pnu")int num,@PathVariable("psize")int size)

	{

		return ser.page(num,size);

	}

	

	@GetMapping("/arungiri/{pnu}/{psize}/{name}")

	public List<Zooinfo> sortpage(@PathVariable("pnu")int num,@PathVariable("psize")int size,@PathVariable("name") String name)

	{

		return ser.sortpage(num,size,name);

	}

	



	

}	
	
	

