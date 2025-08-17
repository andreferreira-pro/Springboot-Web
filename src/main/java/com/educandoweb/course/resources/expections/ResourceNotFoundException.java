package com.educandoweb.course.resources.expections;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ResourceNotFoundException(Object id) {
		super ("Resource not found. Id " + id);
		
	}

}
