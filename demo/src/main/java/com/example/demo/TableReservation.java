package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class TableReservation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String guestName;
	@Column
	private String guestEmail;
	@Column
	private String guestAddress;
	@Column
	private String guestMobile;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getGuestEmail() {
		return guestEmail;
	}

	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}

	public String getGuestAddress() {
		return guestAddress;
	}

	public void setGuestAddress(String guestAddress) {
		this.guestAddress = guestAddress;
	}

	public String getGuestMobile() {
		return guestMobile;
	}

	public void setGuestMobile(String guestMobile) {
		this.guestMobile = guestMobile;
	}

	public String getNofPersons() {
		return nofPersons;
	}

	public void setNofPersons(String nofPersons) {
		this.nofPersons = nofPersons;
	}

	@Column
	private String nofPersons;
	
	 // Define the relationship with the restaurant
    @ManyToOne
    @JoinColumn(name = "restaurant_id")
	private Restaurent restaurant;

	public Restaurent getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurent restaurant) {
		this.restaurant = restaurant;
	}

	public TableReservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TableReservation(String guestName, String guestEmail, String guestAddress, String guestMobile,
			String nofPersons) {
		super();
		this.guestName = guestName;
		this.guestEmail = guestEmail;
		this.guestAddress = guestAddress;
		this.guestMobile = guestMobile;
		this.nofPersons = nofPersons;
		
	}

}
