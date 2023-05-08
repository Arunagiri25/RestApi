package com.example.mysql.ZooController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mysql.ZooModel.LoginModel;
import com.example.mysql.ZooModel.ZooModel;
import com.example.mysql.ZooService.LoginService;

import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
public class LoginController {

@Autowired
LoginService us;

@Tag(name = "Login Method",description = "User Validation")
@PostMapping("/login")
public String login(@RequestBody Map<String,String> loginDataMap)
{
String username = loginDataMap.get("username");
String password = loginDataMap.get("password");
String result = us.loginCheckData(username, password);
return result;
}

@Tag(name = "post details",description = "adding user")
@PostMapping("/adduser")
public LoginModel AddUserx(@RequestBody LoginModel hos)
{
return us.addUserx(hos);
}



}
