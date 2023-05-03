package com.example.mysql.ZooService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mysql.ZooModel.LoginModel;
import com.example.mysql.ZooRepository.LoginRepo;


@Service
public class LoginService {

@Autowired
LoginRepo ur;
public String loginCheckData(String username,String password)
{

LoginModel user = ur.findByusername(username);
if(user == null)
{
return "No User Found!Please Try Again!!!!";
}
else
{
if(user.getPassword().equals(password))
{
return "Login Successful!";
}
else
{
return "Login Failed! Invalid password!";
}
}

}
public String loginCheckData1(String username, String password) {
	// TODO Auto-generated method stub
	return null;
}
}



