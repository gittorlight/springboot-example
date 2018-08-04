package com.github.torlight.sbex;

import java.util.Enumeration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.util.Assert;


@EnableConfigurationProperties(C3P0Properties.class)
@SpringBootApplication
public class Example2 {
	private static final Logger logger = LoggerFactory.getLogger(Example2.class);
	
    public static void main( String[] args ) {
    	
        SpringApplication sa = new SpringApplication(Example2.class);
        ApplicationContext appctx = sa.run(args);

        C3P0Properties props = (C3P0Properties) appctx.getBean("c3p0-com.github.torlight.sbex.C3P0Properties");
        Assert.notNull(props, "C3P0Properties bean should not be null");

        if (logger.isInfoEnabled()) {
            logger.info("the c3p0 properties size={}", props.size());
        }

        //==================================
            //在控制台上输出配置项和配置值
        //==================================
        Object key = null;
        Enumeration<Object> en = props.keys();
        while (en.hasMoreElements()) {
            key = en.nextElement();
            if (logger.isInfoEnabled()) {
                logger.info("c3p0 properties key={} value={}", key, String.valueOf(props.get(key)));
            }
        }       
    }
}
