package com.example.mysql.Repository;



import org.springframework.data.jpa.repository.JpaRepository;



import com.example.mysql.Model.*;



public interface LoginRepo extends JpaRepository<LoginMod,Integer> {

	LoginMod findByname(String name); 



}