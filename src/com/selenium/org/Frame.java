package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.nutanix.com/products/frame/demo");
		Thread.sleep(2000);
		
		driver.switchTo().frame("SingleFrame");
		
		WebElement SingleFrame = driver.findElement(By.xpath("//input[@type='text'][1]"));
		SingleFrame.sendKeys("Frame");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath(""));
		
		
		
		
		
		
	}

}
