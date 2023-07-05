package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<TableReservation, Integer>{
	 List<TableReservation> findReservationsByRestaurantId(int restaurantId);

}
