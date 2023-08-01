package org.springframework.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Citizen {
	private String country;
	private String citizenName;
	private String age;
	 //@Autowired
	private AadharCard aadhar;
	public Citizen() {}
	public Citizen( AadharCard aadhar)
	{
		this.aadhar=aadhar;
	}
	public Citizen(String country, String citizenName, String age, AadharCard aadhar) {
	
		this.country = country;
		this.citizenName = citizenName;
		this.age = age;
		this.aadhar = aadhar;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCitizenName() {
		return citizenName;
	}
	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public AadharCard getAadhar() {
		return aadhar;
	}
	public void setAadhar(AadharCard aadhar) {
		this.aadhar = aadhar;
	}
	
	
}
