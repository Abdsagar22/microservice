package com.user_service.serimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user_service.Repo.UserRepo;
import com.user_service.entity.Rating;
import com.user_service.entity.User;
import com.user_service.excepation.IdNotFoundException;
import com.user_service.service.Userser;
import com.user_service.util.ResponseStructure;

@Service
public class UserSerivceimpl implements Userser {
	
	@Autowired
	private UserRepo repo;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public ResponseEntity<ResponseStructure<User>> createData(User user) {
		ResponseStructure<User> res= new ResponseStructure<>();
		res.setData(repo.save(user));
		res.setMessage("Save Data ");
		res.setStatas(HttpStatus.CREATED.value());
		return new ResponseEntity<ResponseStructure<User>>(res , HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<ResponseStructure<User>> getById(int id) {
		System.out.println("hiiiiii");
		ResponseStructure<User> res= new ResponseStructure<>();
		User user= repo.findById(id).get();
		System.out.println("hiiiiii");
		Object ob=restTemplate.getForObject("http://localhost:8083/Ratings/1", ArrayList.class); 
		
		System.out.println(ob.getClass());
		if (user!=null) {
			
			res.setData(user);
			res.setMessage("the data is getting");
			res.setStatas(HttpStatus.OK.value());
			
			
			
			
			
			
			return new ResponseEntity<ResponseStructure<User>>(res,HttpStatus.OK);
		}
		else {
			throw new IdNotFoundException("Id Not found for Person");
		}
	}

	@Override
	public List<User> getAlldata() {
		List<User> user= repo.findAll();
		return user;
	}

	@Override
	public ResponseEntity<ResponseStructure<User>> deleteById(int id) {
		ResponseStructure<User> res= new ResponseStructure<>();
		User user= repo.findById(id).get();
		if (user!=null) {
			
			repo.deleteById(id);
			res.setData(user);
			res.setMessage("the data is Delete");
			res.setStatas(HttpStatus.OK.value());
			
			return new ResponseEntity<ResponseStructure<User>>(res,HttpStatus.OK);
		}
		else {
			throw new IdNotFoundException("Id Not found for Person");
		}
	}

	

	

	

}
