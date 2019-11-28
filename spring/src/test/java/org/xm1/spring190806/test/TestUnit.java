package org.xm1.spring190806.test;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.xm1.spring190806.pojo.Car;

import org.xm1.spring190806.service.AppManager;

@SpringBootApplication(scanBasePackages="org.xm1.spring190806")

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestUnit {


	
	@Autowired
	private Car car;
	
	@Test
	public void Test1(){
		System.out.println(car);
	}
}
