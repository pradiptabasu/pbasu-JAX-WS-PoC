package com.pradipta.apics.backend;

import javax.jws.*;

@WebService(portName = "PublicCalculatorServicePort", serviceName = "PublicCalculatorService", targetNamespace = "http://com.pradipta.apics.backend/", endpointInterface = "com.pradipta.apics.backend.PublicCalculatorService")
public class PublicCalculatorServiceImpl implements PublicCalculatorService {

	public String hello() {
		// replace with your impl here
		return ("Operations are : 1. add \n 2. subtract \n 3. multiply \n 4. divide");

	}

	@Override
	public int add(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 - num2;
	}

	@Override
	public int multiply(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) throws CalculatorException {
		// TODO Auto-generated method stub
		
		if(num2 == 0)
		{
			throw new CalculatorException("101","Cannot divide by Zero");
		}
		else
		{
			return num1 / num2;
		}
	}
}
