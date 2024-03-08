package com.user_service.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.user_service.entity.User;
import com.user_service.util.ResponseStructure;

public interface Userser {

	ResponseEntity<ResponseStructure<User>> createData(User user);



	ResponseEntity<ResponseStructure<User>> getById(int id);



	List<User> getAlldata();



	ResponseEntity<ResponseStructure<User>> deleteById(int id);

}
