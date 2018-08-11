package com.github.torlight.sbex;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Example3Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx=SpringApplication.run(Example3Main.class, args);
		
		System.out.println("Example3Main running...");
		
		List<TEntityDO> tEntityDOList=new ArrayList<TEntityDO>(10);
		tEntityDOList.add(new TEntityDO("1"));
		tEntityDOList.add(new TEntityDO("2"));
		tEntityDOList.add(new TEntityDO("3"));
		tEntityDOList.add(new TEntityDO("4"));
		tEntityDOList.add(new TEntityDO("5"));
		tEntityDOList.add(new TEntityDO("6"));
		tEntityDOList.add(new TEntityDO("7"));
		tEntityDOList.add(new TEntityDO("8"));
		tEntityDOList.add(new TEntityDO("9"));
		tEntityDOList.add(new TEntityDO("10"));
		
		TEntityDAO tEntityDAO=ctx.getBean(TEntityDAO.class);
		tEntityDAO.insertList(tEntityDOList);
			
	}

}
