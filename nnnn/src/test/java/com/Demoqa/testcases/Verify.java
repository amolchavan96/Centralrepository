package com.Demoqa.testcases;

import org.testng.annotations.Test;

import com.Demoqa.pages.Homepage;
import com.Demoqa.pages.LinkedIn;
import com.Demoqa.pages.ReadPropertyFile;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;


public class Verify 
{
  @Test
  public void Test() 
  {
	  ReadPropertyFile obja= new ReadPropertyFile();
	  obja.getClass();
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	 WebDriver  driver = new FirefoxDriver();
	  
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	     driver.get("http://www.store.demoqa.com");
	     
	     Homepage pp= new Homepage(driver);
		 pp.lnk_MyAccount(driver);
		 pp.UserName("aviva");
		 pp.Password("capgemnii");
		 pp.LogIn_button(driver);
		 driver.close();
		 
  }

  @AfterMethod
  public void afterMethod()
  
  {
	  WebDriver  driver = new FirefoxDriver();
	  
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	     driver.get("https://www.facebook.com/");
	     
	   
	     LinkedIn ss = new LinkedIn(driver);
	     ss.Entered_username("amolv.chavan11@gmail.com");
	 ss.Entered_Password("9511114050");
	 ss.click();
	  System.out.println(" Login Successfully, now it is the time to Log Off buddy.");
  }

}
