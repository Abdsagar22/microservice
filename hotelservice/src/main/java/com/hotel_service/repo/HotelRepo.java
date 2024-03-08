package com.hotel_service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel_service.entity.Hotel;

public interface HotelRepo  extends JpaRepository<Hotel, Integer>{

	

}
