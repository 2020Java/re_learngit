package org.xm1.spring190806.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component

@ConfigurationProperties(prefix="car")
public class Car {

	@Value("${type}")
	private String type;
	@Value("${price}")
	private int price;

	public void car1(){
		System.out.println("价格："+this.price+"类型："+this.type);
	}
	
	
}
