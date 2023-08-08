package com.lvg.spcd.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.lvg.spcd.beans.Address;
import com.lvg.spcd.beans.Person;

@Configuration
@ComponentScan(basePackages="com.lvg.spcd.beans")
public class AppConfig {
	/*@Bean
	//@Scope("prototype")
	public Address address()
	{
		return new Address("7-8-9","vihar colony","sklm","AP");
	}
	//@Bean(initMethod = "initPerson",destroyMethod="destroyPerson")
	@Bean
	public Person person()
	{
		Person p=new Person();
		p.setSsn(101);
		p.setName("anana");
		p.setAge(7);
		return p;
	}*/
}
