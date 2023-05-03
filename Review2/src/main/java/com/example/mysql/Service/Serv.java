package com.example.mysql.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.example.mysql.Repository.Repo;

@Service
public class Serv<UserRepository> {
	@Autowired
	Repo userRepo;
public User saveUser(User u)
{
	return userRepo.save(u);
}
public String validateUser(String username,String password)
{
	String result="";
	User u=userRepo.findByusername(username);
	if(u==null)
	{
		result="Invalid user";
	}
		else
		{
			if(u.getPassword().equals(password))
			{
				result="Login success";
			}
			else
			{
				result="Login failed";
			}
		}
	

	return result;
	}
	
	
	}

