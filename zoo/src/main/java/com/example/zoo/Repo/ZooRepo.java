package com.example.zoo.Repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.zoo.Model.ZooMod;

public interface ZooRepo extends JpaRepository<ZooMod,Integer> { 

}
