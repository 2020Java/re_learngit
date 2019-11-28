package org.xm1.spring190806;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.xm1.spring190806.pojo.Car;

import org.xm1.spring190806.service.AppManager;

@Configuration
public class Appconfigerration {


	
	@Bean
	
	public Car car(){

		return new Car();
	}
	
	
}
