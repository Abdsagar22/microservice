package com.hotel_service.ser;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hotel_service.entity.Hotel;
import com.hotel_service.repo.HotelRepo;
import com.hotel_service.service.HotelService;
import com.hotel_service.util.ResponseStructure;


@Service
public class HotelSerivceimpl implements HotelService {
	
	
	@Autowired
	private HotelRepo repo;

	@Override
	public ResponseEntity<ResponseStructure<Hotel>> createData(Hotel user) {
		ResponseStructure<Hotel> res= new ResponseStructure<>();
		res.setData(repo.save(user));
		res.setMessage("Save Data ");
		res.setStatas(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<Hotel>>(res , HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<ResponseStructure<Hotel>> getById(int id) {
		ResponseStructure<Hotel> res= new ResponseStructure<>();
		Hotel user= repo.findById(id).get();
		if (user!=null) {
			
			res.setData(user);
			res.setMessage("the data is getting");
			res.setStatas(HttpStatus.OK.value());
			
			return new ResponseEntity<ResponseStructure<Hotel>>(res,HttpStatus.OK);
		}
		return null;
		
	}

	@Override
	public List<Hotel> getAlldata() {
		List<Hotel> user= repo.findAll();
		return user;
	}

	@Override
	public ResponseEntity<ResponseStructure<Hotel>> deleteById(int id) {
		ResponseStructure<Hotel> res= new ResponseStructure<>();
	Hotel user= repo.findById(id).get();
		if (user!=null) {
			
			repo.deleteById(id);
			res.setData(user);
			res.setMessage("the data is Delete");
			res.setStatas(HttpStatus.OK.value());
			
			return new ResponseEntity<ResponseStructure<Hotel>>(res,HttpStatus.OK);
		}
		return null;
		
	}


}
