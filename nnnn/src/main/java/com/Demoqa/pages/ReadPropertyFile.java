package com.Demoqa.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropertyFile {
	public static void main (String [] args) {
		
		
	File file = new File("C:\\Users\\Savan\\eclipse-workspace\\nnnn\\src\\main\\resources\\pack1\\data.properties");
	
		  
			FileInputStream fileInput = null;
			try {
				fileInput = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			Properties prop = new Properties();
			
			//load properties file
			try {
				prop.load(fileInput);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//WebDriver driver = new FirefoxDriver();

//			driver.get(prop.getProperty("URL"));
//			driver.findElement(By.id("Email")).sendKeys(prop.getProperty("username"));
//			driver.findElement(By.id("Passwd")).sendKeys(prop.getProperty("password"));
//			driver.findElement(By.id("SignIn")).click();
//			
			
			System.out.println("URL ::" + prop.getProperty("URL"));
			System.out.println("User name::" +prop.getProperty("username"));
		    System.out.println("Password::" +prop.getProperty("password"));
	  }
	}