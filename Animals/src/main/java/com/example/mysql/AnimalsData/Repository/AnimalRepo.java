package com.example.mysql.AnimalsData.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.mysql.AnimalsData.AnimalsData;
@Repository

public interface AnimalRepo extends JpaRepository<AnimalsData, Integer> {

}
