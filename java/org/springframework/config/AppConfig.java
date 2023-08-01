package org.springframework.config;


import org.springframework.beans.AadharCard;
import org.springframework.beans.Citizen;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
;
@Configuration
@ComponentScan(basePackages="org.springframework.beans")
public class AppConfig {
	@Bean
	public AadharCard aadhar()
	{
		return new AadharCard(345,"Deepika karanam","29/01/2002","vzm");
	}
	@Bean
	public Citizen citizen()
	{
		return new Citizen("India","vanika","9",aadhar());
	}
}
