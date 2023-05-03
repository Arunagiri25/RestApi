package com.example.mysql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysql.Model.Answer;

public interface Arepo extends JpaRepository<Answer, Integer> {

}
