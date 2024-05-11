package com.matthieumallavan.gallerieimages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.matthieumallavan.gallerieimages.model.HelloWorld;
import com.matthieumallavan.gallerieimages.service.BusinessService;

@SpringBootApplication
public class GallerieImagesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(GallerieImagesApplication.class, args);
	}
	
	@Autowired
	private BusinessService bs;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello World!");
		
		HelloWorld hw = bs.getHelloWorld();
		System.out.println(hw);
		
	}

}
