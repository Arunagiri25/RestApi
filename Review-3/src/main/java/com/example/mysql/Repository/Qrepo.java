package com.example.mysql.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mysql.Model.Question;

public interface Qrepo extends JpaRepository<Question ,Integer> {

}
