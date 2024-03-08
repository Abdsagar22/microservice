package com.user_service.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user_service.entity.User;

public interface UserRepo  extends JpaRepository<User, Integer>{

}
