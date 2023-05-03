package com.example.mysqlController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mysql.Service.Serv;

@RestController
public class Cont<UserService> {
@Autowired
	public Serv usrService;
@PostMapping("/checkLogin")
	public String validateUser(@RequestBody User u)
	{
	System.out.println(u.getName());
		return usrService.validateUser(u.getName(),u.getPassword());
	}
@PostMapping("/addUser")
public Object User(@RequestBody User u)
{
return usrService.saveUser(u);
}
}
