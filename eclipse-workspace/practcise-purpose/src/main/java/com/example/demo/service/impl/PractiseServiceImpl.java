package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Practise;
import com.example.demo.repository.PractiseRepository;
import com.example.demo.service.PaccitiseService;
@Service
public class PractiseServiceImpl implements PaccitiseService{

	
	@Autowired
	private PractiseRepository practiseRepository;
	
	@Override
	public List<Practise> getAllPracises() {
		
		return practiseRepository.findAll();
	}

	@Override
	public Practise saveAllparctise(Practise practise) {
		
		return practiseRepository.save(practise);
	}

	@Override
	public Practise getAllPraciisebyid(Long id) {
		
		return practiseRepository.getById(id);
	}

	@Override
	public Practise updateParctise(Practise practise) {
		
		return practiseRepository.save(practise);
	}

	@Override
	public void deletePractsebyid(Long id) {
		
		practiseRepository.deleteById(id);
		
	}

}
