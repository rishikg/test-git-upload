package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepository repository;
	
	public List<Restaurent> getAllRestaurents(){
		return repository.findAll();
	}
	
	public Restaurent saveRestaurent(Restaurent restaurent){
		return repository.save(restaurent);
	}
	
	public String deleteRestaurent( int id){
		repository.deleteById(id);
		return "Success";
	}
	
	public Restaurent getRestaurantById(int id){
		return repository.findById(id).orElse(null);
	}
	
	
	
	
	
}
