package com.csa.samplefullstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin("*")
public class SamplefullstackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamplefullstackApplication.class, args);
	}

}
