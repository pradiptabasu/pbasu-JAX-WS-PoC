package com.pradipta.apics.backend;

import javax.xml.ws.WebFault;

@WebFault(name = "CalculatorException", targetNamespace = "http://com.pradipta.apics.backend/", faultBean = "CalculatorExceptionBean")
public class CalculatorException extends Exception 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5471082152996086708L;

	private SOAPFaultBean CalculatorExceptionBean;
	/**
	 * 
	 */
	public CalculatorException() 
	{
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param fault
	 */
	protected CalculatorException(SOAPFaultBean CalculatorExceptionBean) 
	{
        super(CalculatorExceptionBean.getFaultString()); 
        this.CalculatorExceptionBean = CalculatorExceptionBean;
     }
	/**
	 * 
	 * @param message
	 * @param faultInfo
	 */
	public CalculatorException(String message, SOAPFaultBean CalculatorExceptionBean)
	{
		super(message);
        this.CalculatorExceptionBean = CalculatorExceptionBean;
	}
	/**
	 * 
	 * @param message
	 * @param faultInfo
	 * @param cause
	 */
	public CalculatorException(String message, SOAPFaultBean CalculatorExceptionBean, Throwable cause){
		super(message,cause);
        this.CalculatorExceptionBean = CalculatorExceptionBean;
	}
	/**
	 * 
	 * @return
	 */
	public SOAPFaultBean getFaultInfo(){
		return CalculatorExceptionBean;
	}
	
	/**
	 * @param message
	 */
	public CalculatorException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param message
	 */
	public CalculatorException(String code, String message) {
		super(message);
		this.CalculatorExceptionBean = new SOAPFaultBean();
	    this.CalculatorExceptionBean.setFaultString(message);
	    this.CalculatorExceptionBean.setFaultCode(code);
	}

	/**
	 * @param cause
	 */
	public CalculatorException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public CalculatorException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
}
