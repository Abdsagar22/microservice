package com.hotel_service.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.hotel_service.entity.Hotel;
import com.hotel_service.util.ResponseStructure;

public interface HotelService {

	ResponseEntity<ResponseStructure<Hotel>> createData(Hotel user);

	ResponseEntity<ResponseStructure<Hotel>> getById(int id);

	List<Hotel> getAlldata();

	ResponseEntity<ResponseStructure<Hotel>> deleteById(int id);

}
