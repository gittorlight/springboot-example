package com.github.torlight.sbex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


/**
 * Hello world!
 *
 */
@SpringBootApplication
public class Example1 {
	

	@Bean
	public UserAction userAction(){
		return new UserAction();
	}
	
	
    public static void main( String[] args ) {
       
     ApplicationContext context= SpringApplication.run(Example1.class, args);
     
     ((UserAction)context.getBean(UserAction.class)).sysOutUserInfo();  
       
    }
}
