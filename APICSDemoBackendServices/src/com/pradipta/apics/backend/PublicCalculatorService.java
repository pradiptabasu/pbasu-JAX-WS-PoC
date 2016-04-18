package com.pradipta.apics.backend;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "PublicCalculatorService", targetNamespace = "http://com.pradipta.apics.backend/")
public interface PublicCalculatorService {

	@WebMethod(operationName = "hello")
	public String hello();
	
	@WebMethod(operationName = "add")
	@WebResult(name="AdditionResult", targetNamespace = "http://com.pradipta.apics.backend/")
	public int add(
			@WebParam(name="Number1",
			targetNamespace = "http://com.pradipta.apics.backend/") int num1, 
			@WebParam(name="Number2",
			targetNamespace = "http://com.pradipta.apics.backend/") int num2);
	
	@WebMethod(operationName = "subtract")
	@WebResult(name="SutractResult", targetNamespace = "http://com.pradipta.apics.backend/")
	public int subtract(
			@WebParam(name="Number1",
			targetNamespace = "http://com.pradipta.apics.backend/") int num1, 
			@WebParam(name="Number2",
			targetNamespace = "http://com.pradipta.apics.backend/") int num2);
	
	@WebMethod(operationName = "multiply")
	@WebResult(name="MultiplyResult", targetNamespace = "http://com.pradipta.apics.backend/")
	public int multiply(
			@WebParam(name="Number1",
			targetNamespace = "http://com.pradipta.apics.backend/") int num1, 
			@WebParam(name="Number2",
			targetNamespace = "http://com.pradipta.apics.backend/") int num2);
	
	@WebMethod(operationName = "divide")
	@WebResult(name="DivideResult", targetNamespace = "http://com.pradipta.apics.backend/")
	public int divide(
			@WebParam(name="Number1",
			targetNamespace = "http://com.pradipta.apics.backend/") int num1, 
			@WebParam(name="Number2",
			targetNamespace = "http://com.pradipta.apics.backend/") int num2) throws CalculatorException;
}