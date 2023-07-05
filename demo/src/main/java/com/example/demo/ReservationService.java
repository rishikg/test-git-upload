package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
	
	@Autowired
	private ReservationRepository repository;
	
	public TableReservation saveReservation(TableReservation reservation) {
		return repository.save(reservation);
	}
	
	public List<TableReservation> getAllReservationsForRestaurant(int id) {
		return repository.findReservationsByRestaurantId(id);
	}
	
	public TableReservation getReservationById(int id){
		return repository.findById(id).orElse(null);
	}
	
	public String deleteReservation( int id){
		repository.deleteById(id);
		return "Success";
	}
	

}
