package com.example.test.exception;

import lombok.Data;

@Data
public class ErrorObject {
	public Integer statusCode;
	
	public String message;
	
	public long timestamp;

}
