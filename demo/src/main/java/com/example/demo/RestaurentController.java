package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurentController {
	
	@Autowired
	private RestaurantService service;
	
	@Autowired
	private ReservationService reservationService;
	
	public final String localCrossURL = "http://localhost:4200";
	public final String localCrossURL2 = "http://localhost:4201";
	public final String awsCrossURL = "http://restaurantapp2.s3-website.ap-south-1.amazonaws.com/";
	

	@CrossOrigin({localCrossURL,localCrossURL2,awsCrossURL})
	@GetMapping("/getAllRestaurents")
	public List<Restaurent> getAllRestaurents() {
		return  service.getAllRestaurents();
	}
	
	@CrossOrigin({localCrossURL,localCrossURL2,awsCrossURL})
	@PostMapping("/saveRestaurent")
	public Restaurent saveRestaurent(@RequestBody Restaurent restaurent) {
		return service.saveRestaurent(restaurent);
	}
	
	@CrossOrigin({localCrossURL,localCrossURL2,awsCrossURL})
	@DeleteMapping("/deleteRestaurent/{id}")
	public String deleteRestaurent(@PathVariable int id) {
		List<TableReservation> list =  reservationService.getAllReservationsForRestaurant(id);
		if(list.size() > 0) {
			for (TableReservation ele : list) {
				reservationService.deleteReservation(ele.getId());
			}
		}
		return service.deleteRestaurent(id);
	}
	
	@CrossOrigin({localCrossURL,localCrossURL2,awsCrossURL})
	@GetMapping("/getAllReservationsForRestaurant/{id}")
	public List<TableReservation> getAllReservationsForRestaurant(@PathVariable int id) {
		List<TableReservation> list =  reservationService.getAllReservationsForRestaurant(id);
		return list;
	}
	
	
	@CrossOrigin({localCrossURL,localCrossURL2,awsCrossURL})
	@PostMapping("/saveTableReservation/{id}")
	public TableReservation saveRestaurent(@RequestBody TableReservation reservation,@PathVariable int id) {
		Restaurent restaurant = service.getRestaurantById(id);
		reservation.setRestaurant(restaurant);
		return  reservationService.saveReservation(reservation);
	}
	
	
	

}
