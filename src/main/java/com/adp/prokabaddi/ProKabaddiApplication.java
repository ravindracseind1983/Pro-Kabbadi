package com.adp.prokabaddi;

import java.util.Collections;

import org.dozer.DozerBeanMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.adp.prokabaddi.ProKabaddiApplication;

@SpringBootApplication
public class ProKabaddiApplication {

	public static void main ( String[] args )
	  {
	    SpringApplication.run(ProKabaddiApplication.class, args);
	  }
	  

		 @Bean public DozerBeanMapper dozerBean() { DozerBeanMapper dozerBean= new
		 DozerBeanMapper();
		 dozerBean.setMappingFiles(Collections.singletonList("dozerJdk8Converters.xml"
		 )); return dozerBean; }
		 
}
