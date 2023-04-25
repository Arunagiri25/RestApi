package com.example.zoo1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.zoo1.Repo.ZooRepo;
@Service
public class ZooServ {
	@Autowired
	public ZooRepo zrep;

}
