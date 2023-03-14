package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Dishtype;

public interface DishTypeRepository extends JpaRepository<Dishtype, Long> {

}
