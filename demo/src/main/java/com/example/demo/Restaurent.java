package com.example.demo;

import java.util.ArrayList;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;


@Entity
@Table
public class Restaurent {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String name;
	
	public Restaurent(String name, String email, String address, String mobile, String services) {
		super();
		this.name = name;
		this.email = email;
		this.address = address;
		this.mobile = mobile;
		this.services = services;
	}
	
	

	public Restaurent() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getServices() {
		return services;
	}

	public void setServices(String services) {
		this.services = services;
	}

	@Column
	private String email;
	
	@Column
	private String address;
	
	@Column
	private String mobile;
	
	@Column
	private String services;
	
//	 @OneToMany(mappedBy = "restaurant", cascade = CascadeType.ALL, orphanRemoval = true)
//	    private List<TableReservation> reservations = new ArrayList<>();
//
//	    // Getters and setters...
//
//	    public List<TableReservation> getReservations() {
//	        return reservations;
//	    }
//
//	    public void addReservation(TableReservation reservation) {
//	        reservations.add(reservation);
//	        reservation.setRestaurant(this);
//	    }
//
//	    public void removeReservation(TableReservation reservation) {
//	        reservations.remove(reservation);
//	        reservation.setRestaurant(null);
//	    }
	
}
