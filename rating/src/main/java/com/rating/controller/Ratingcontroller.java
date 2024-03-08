package com.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rating.entity.Ratings;
import com.rating.serimpl.RatingsSerivceimpl;
import com.rating.util.ResponseStructure;



   
@RestController
@RequestMapping("/Ratings")
public class Ratingcontroller {

	@Autowired
	private RatingsSerivceimpl ser;
	
	@PostMapping("/save")
	private ResponseEntity<ResponseStructure<Ratings>> createData(@RequestBody Ratings Ratings)
	{
		return ser.createData(Ratings);
		
	}
	
	@GetMapping("/{id}")
	private ResponseEntity<ResponseStructure<Ratings>> createData(@PathVariable int id)
	{
		return ser.getById(id);
		
	}
	
	@GetMapping("/getAll")
	private List<Ratings> getAlldata()
	{
		return ser.getAlldata();
		
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<ResponseStructure<Ratings>> deleteData(@PathVariable int id)
	{
		return ser.deleteById(id);
		
	}
}

