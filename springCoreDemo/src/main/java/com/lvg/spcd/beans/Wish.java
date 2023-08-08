package com.lvg.spcd.beans;



public class Wish {
	private String message;
	public Wish() {
		System.out.println("Wish Bean/Object created");
	};
	public Wish(String message)
	{
		this.message=message;
	}
	public void setMessage(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
	public void wishInit()
	{
		System.out.println("Wish Bean is initialized");
	}
	public void wishDestroy()
	{
		System.out.println("wish bean is about to be destroyed");
	}
	
}
