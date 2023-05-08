package com.example.mysql.ZooRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.mysql.ZooModel.ZooModel;

public interface ZooRepo extends JpaRepository<ZooModel,Integer> {

	List<ZooModel> afood = null;

	@Query(value="select * from Zoomodel where aid=:id",nativeQuery=true)
   

	

	public List<ZooModel> afood(@Param("id")int  aid);

}
