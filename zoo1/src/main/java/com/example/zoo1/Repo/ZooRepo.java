package com.example.zoo1.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.zoo1.Model.ZooMod;

@Repository
public interface ZooRepo extends JpaRepository<ZooMod,Integer> { 

}
