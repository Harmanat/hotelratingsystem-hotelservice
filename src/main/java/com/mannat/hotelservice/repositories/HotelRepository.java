package com.mannat.hotelservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mannat.hotelservice.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}