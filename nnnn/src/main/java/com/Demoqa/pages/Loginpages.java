/**
 * 
 */
package com.Demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Savan
 *
 */
public class Loginpages {
WebDriver driver;
	
	By Email  = By.id("identifierId");
	By Next = By.linkText("Next");
	By password= By.name("password");
	By Next1 = By.partialLinkText("Next");
	
	public Loginpages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeemail()
	{
		driver.findElement(Email).sendKeys("amolv.chavan11@gmail.com");
	}
	public void clickonnextbutton()
	{
		driver.findElement(Next).click();
	}
	public void typepass()
	{
		driver.findElement(password).sendKeys("9511114050");
	}
	public void clicknextt ()
	{
		driver.findElement(Next).click();
	}
	
}


