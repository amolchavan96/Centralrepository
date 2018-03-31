package com.Demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	static WebDriver driver;
	 static //page Object
	 By account = By.xpath(".//*[@id='account']/a");
	

	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public static void lnk_MyAccount(WebDriver driver)
	{
		   driver.findElement(account).click();
	}

	public static void UserName (String uid)
	{
		driver.findElement(By.id("log")).sendKeys(uid);
	}
	public static void Password(String upass)
	{
		 driver.findElement(By.id("pwd")).sendKeys(upass);
	}
	
	public static void LogIn_button(WebDriver driver)
	{
		try {
		  driver.findElement(By.id("login")).click();
	}
	catch (Exception e)
	{
	}
	}
	
}
