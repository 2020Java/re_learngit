package org.xm1.spring190806;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.xm1.spring190806.service.AppManager;




@SpringBootApplication(scanBasePackages="org.xm1.spring190806")


public class App {
	
	
    public static void main( String[] args ){
    	
       SpringApplication.run(App.class, args);
    }
}
