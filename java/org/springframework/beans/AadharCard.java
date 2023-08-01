package org.springframework.beans;

import org.springframework.stereotype.Component;

@Component
public class AadharCard {
private int aadharNo;
private String  name;
private String dob;
private String city;
public AadharCard()
{

}
public AadharCard(int aadharNo, String name, String dob, String city) {
	super();
	this.aadharNo = aadharNo;
	this.name = name;
	this.dob = dob;
	this.city = city;
}
public int getAadharNo() {
	return aadharNo;
}
public void setAadharNo(int aadharNo) {
	this.aadharNo = aadharNo;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
