package com.lvg.springCoreDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lvg.spcd.beans.Country;
import com.lvg.spcd.beans.Person;
import com.lvg.spcd.beans.Wish;
import com.lvg.spcd.config.AppConfig;

import java.util.Map.Entry;
public class App 
{
    public static void main( String[] args )
    {
       AnnotationConfigApplicationContext container=new AnnotationConfigApplicationContext(AppConfig.class);

       Person p=container.getBean(Person.class);
       System.out.println(p.getSsn()+" "+p.getName()+" "+p.getAge());
       System.out.println(p.getAddress().getHno()+" "+p.getAddress().getStreetName());
       System.out.println(p.getAddress().getCity()+" "+p.getAddress().getState());

       container.close();
    }
}
