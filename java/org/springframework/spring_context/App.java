package org.springframework.spring_context;

import org.springframework.beans.Citizen;
import org.springframework.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	       //ClassPathXmlApplicationContext container = new ClassPathXmlApplicationContext("beans.xml");
    	AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class);
    	 Citizen ct=container.getBean(Citizen.class);
    	    // Citizen ct=container.getBean("citi3",Citizen.class);
    	     System.out.println(ct.getCountry()+" "+ct.getCitizenName()+" "+ct.getAge());
    	     System.out.println(ct.getAadhar().getAadharNo()+" "+ct.getAadhar().getName() );
    	     System.out.println(ct.getAadhar().getDob()+" "+ct.getAadhar().getCity());
    	       container.close();
    	    }
    	

    }

