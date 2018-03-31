package com.Demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedIn {

	static WebDriver driver;
	 

	public LinkedIn( WebDriver driver)
	{
		this.driver=driver;
	}
	
	public static void Entered_username(String uid)
	{
		driver.findElement(By.id("email")).sendKeys(uid);
	}
	public static void Entered_Password(String pass)
	{
		driver.findElement(By.id("pass")).sendKeys(pass);
	}
	
	public static void click()
	{
		driver.findElement(By.partialLinkText("Log In")).click();
	}
}
