package com.example.mysql.ZooRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysql.ZooModel.ZooModel;

public interface ZooRepo extends JpaRepository<ZooModel,Integer> {

}
