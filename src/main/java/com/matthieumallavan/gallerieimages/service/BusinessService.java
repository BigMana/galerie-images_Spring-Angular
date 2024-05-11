package com.matthieumallavan.gallerieimages.service;

import org.springframework.stereotype.Component;
import com.matthieumallavan.gallerieimages.model.HelloWorld;

@Component
public class BusinessService {
	public HelloWorld getHelloWorld() {
		HelloWorld hw = new HelloWorld();
		return hw;
	}
}
