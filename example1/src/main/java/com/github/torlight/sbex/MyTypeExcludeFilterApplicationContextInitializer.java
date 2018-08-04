package com.github.torlight.sbex;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;

public class MyTypeExcludeFilterApplicationContextInitializer 
			implements ApplicationContextInitializer<ConfigurableApplicationContext> {

	
	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		applicationContext.addBeanFactoryPostProcessor(new MyTypeExcludeFilterPostProcessor());
		
	}
	
	private static class MyTypeExcludeFilterPostProcessor
			implements PriorityOrdered, BeanDefinitionRegistryPostProcessor {

		public static final String BEAN_NAME = "com.github.torlight.sbex."
				+ "myTypeExcludeFilter";
		
		@Override
		public int getOrder() {
			return Ordered.HIGHEST_PRECEDENCE;
		}
		
		@Override
		public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
			RootBeanDefinition definition = new RootBeanDefinition(
					MyTypeExcludeFilter.class);
			registry.registerBeanDefinition(BEAN_NAME, definition);
		}	
	}	
	
}