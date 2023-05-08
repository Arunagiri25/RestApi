package com.example.mysql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mysql.Model.Question;
import com.example.mysql.Repository.Qrepo;

@RequestMapping("/question")
@RestController

public class QCon {
	@Autowired
	Qrepo qrepo;
	
	@PostMapping("/post")
	public String javaDetails(@RequestBody Question q)
	{
		qrepo.save(q);
		return "Data is saved";
	}
	@GetMapping("/get")
	public List<Question>showQuAns()
	{
		return qrepo.findAll();
	}

	
	

}
