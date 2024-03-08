package com.user_service.util;

import java.util.List;

import com.user_service.entity.User;

public class ResponseStructure<T> {
	
	private String message ;
	private int statas;
	private T data;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatas() {
		return statas;
	}
	public void setStatas(int statas) {
		this.statas = statas;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
	

}
