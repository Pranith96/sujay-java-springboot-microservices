package com.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class EmployeeExceptionHandler {

	private String EMPLOYEE_RECORDS_NOT_EXISTS_EXCEPTION = "Employee Records not Exists";
	private String METHOD_NOT_ALLOWED = "Please change to Get Method Instead of Post";

	@ExceptionHandler(value = EmployeeNotFoundException2.class)
	public ResponseEntity<ExceptionMessage> handleEmployeeNotFoundException(EmployeeNotFoundException2 ex,
			WebRequest request) {
		ExceptionMessage exceptionMessage = new ExceptionMessage(ex.getMessage(),
				EMPLOYEE_RECORDS_NOT_EXISTS_EXCEPTION);
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptionMessage);
	}
	
	@ExceptionHandler(value = HttpMediaTypeNotAcceptableException.class)
	public ResponseEntity<ExceptionMessage> handleHttpRequestMethodNotSupportedException(HttpMediaTypeNotAcceptableException ex,
			WebRequest request) {
		ExceptionMessage exceptionMessage = new ExceptionMessage(ex.getMessage(),
				METHOD_NOT_ALLOWED);
		return ResponseEntity.status(HttpStatus.METHOD_NOT_ALLOWED).body(exceptionMessage);
	}
}
