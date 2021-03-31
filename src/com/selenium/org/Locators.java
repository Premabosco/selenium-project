package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        
		driver.get("https://www.facebook.com/");
		WebElement email_address = driver.findElement(By.xpath("//input[@id='email']"));
		email_address.sendKeys("prema@gmail.com");
		Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("1234");
		
		WebElement button = driver.findElement(By.xpath("//button[@name='login']"));
		button.click();
		
		Thread.sleep(7000);
		
		//driver.quit();
		
	}

}
