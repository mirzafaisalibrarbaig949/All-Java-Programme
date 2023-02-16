package com.web.model;


public class User
{
	
	public Integer getUserId()
	{
		return UserId;
	}
	public void setUserId(Integer userId)
	{
		UserId = userId;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	private Integer UserId;
	private String name;
	private String password;
	public User(Integer userId, String name, String password)
	{
		UserId = userId;
		this.name = name;
		this.password = password;
	}
	public User()
	{
	}
	
	
}
