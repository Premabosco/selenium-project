package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {
	private static final WebDriver driver = null;


	public Actions(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//WebElement element = driver.findElement(By.name("q"));
		
		//org.openqa.selenium.interactions.Actions ac = new org.openqa.selenium.interactions.Actions(driver);
		//ac.contextClick(element).build().perform();
	
		WebElement doubleelement = driver.findElement(By.name("q"));
		org.openqa.selenium.interactions.Actions ac = new org.openqa.selenium.interactions.Actions(driver);
		ac.doubleClick(doubleelement).build().perform();
		
		
		
		WebElement target_element = driver.findElement(By.linkText("Gmail"));
		org.openqa.selenium.interactions.Actions ac1 = new org.openqa.selenium.interactions.Actions(driver);
		ac.moveToElement(target_element).build().perform();
		ac.moveToElement(target_element).build().perform();
	}

	
		
		
	}

		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		

		
	
