package com.nt.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configurable
class AppConfig {
	@Bean
	public ResourceBundleMessageSource messageSource() {
		ResourceBundleMessageSource rbms = new ResourceBundleMessageSource();
		rbms.setBasename("com/nt/resources/properties/messages");
		rbms.setDefaultEncoding("UTF-8");
		return rbms;
	}
	
  
	
}



