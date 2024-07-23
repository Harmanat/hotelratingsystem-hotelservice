package com.mannat.hotelservice.services;

import java.util.List;

import com.mannat.hotelservice.entities.Hotel;

public interface HotelService {
	
	// create
	public Hotel createHotel(Hotel hotel);
	
	// getAll
	public List<Hotel> getAllHotels();

	// getById
	public Hotel getHotelById(String id);

}
