package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Restaurantregistration;

@Repository
public interface RestaurentRepository extends JpaRepository<Restaurantregistration, Long> {

}
