package com.rating.ser;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.rating.entity.Ratings;
import com.rating.util.ResponseStructure;

public interface Ratingser {

	ResponseEntity<ResponseStructure<Ratings>> createData(Ratings user);

	ResponseEntity<ResponseStructure<Ratings>> getById(int id);

	List<Ratings> getAlldata();

	ResponseEntity<ResponseStructure<Ratings>> deleteById(int id);

}
