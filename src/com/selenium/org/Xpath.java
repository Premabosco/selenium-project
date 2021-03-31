package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement email  = driver.findElement(By.id("email"));
			email.sendKeys("prema@gmail.com");
			Thread.sleep(2000);
		
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("27");
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		login.click();
		
		
		
		
		
		
	}

}
