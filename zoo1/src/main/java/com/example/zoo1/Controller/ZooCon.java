package com.example.zoo1.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.zoo1.Service.ZooServ;
@RestController
public class ZooCon {
	@Autowired
	public ZooServ zser;
}
