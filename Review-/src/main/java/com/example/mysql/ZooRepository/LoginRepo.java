package com.example.mysql.ZooRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mysql.ZooModel.LoginModel;


@Repository
public interface LoginRepo extends JpaRepository<LoginModel,Integer>{

      LoginModel findByusername(String username);

}