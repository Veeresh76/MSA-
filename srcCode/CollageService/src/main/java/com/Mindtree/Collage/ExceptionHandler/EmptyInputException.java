package com.Mindtree.Collage.ExceptionHandler;

import org.springframework.stereotype.Component;

@Component
public class EmptyInputException extends RuntimeException {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 4087517867137081884L;
	String m;

	public EmptyInputException(String m) {
		super();
		this.m = m;
	}
	
	@Override
	public String toString() {
		return "EmptyInputException [m=" + m + "]";
	}

	public EmptyInputException() {
		
	}

	public String getM() {
		return m;
	}

	public void setM(String m) {
		this.m = m;
	}
	
	
	
	
}
