package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Practise;

@Service
public interface PaccitiseService {
 
	List<Practise> getAllPracises();
	
	Practise saveAllparctise(Practise practise);
	
	Practise getAllPraciisebyid(Long id);
	Practise updateParctise(Practise practise);
	
	
	void deletePractsebyid(Long id);
}
