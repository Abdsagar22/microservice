package com.user_service.cotroller;

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

import com.user_service.entity.User;
import com.user_service.serimpl.UserSerivceimpl;
import com.user_service.util.ResponseStructure;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserSerivceimpl ser;
	
	@PostMapping("/save")
	private ResponseEntity<ResponseStructure<User>> createData(@RequestBody User user)
	{
		return ser.createData(user);
		
	}
	
	@GetMapping("/{id}")
	private ResponseEntity<ResponseStructure<User>> createData(@PathVariable int id)
	{
		return ser.getById(id);
		
	}
	
	@GetMapping("/getAll")
	  private List<User> getAlldata()
	{
		return ser.getAlldata();
		
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<ResponseStructure<User>> deleteData(@PathVariable int id)
	{
		return ser.deleteById(id);
		
	}

}
