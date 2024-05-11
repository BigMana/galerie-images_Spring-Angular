package com.matthieumallavan.gallerieimages.model;

public class HelloWorld {
	
	private String value = "Hello World! From model and service ;)";

	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value;
		
	}
}
