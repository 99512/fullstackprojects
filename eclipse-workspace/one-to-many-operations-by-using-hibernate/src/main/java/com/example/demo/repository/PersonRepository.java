package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Persons;

public interface PersonRepository extends JpaRepository<Persons, Long>{

}
