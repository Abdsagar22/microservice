package com.rating.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rating.entity.Ratings;

public interface RatingsRepo extends JpaRepository<Ratings, Integer> {

}
