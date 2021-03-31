package com.selenium.org;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement parentId = driver.findElement(By.xpath("q"));
		parentId.sendKeys("naukri login");
		
		String pId = driver.getWindowHandle();
		System.out.println(pId);
		
		Thread.sleep(3000);
		
		Robot r= new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Set<String> allIds = driver.getWindowHandles();
		
		for (String Ids : allIds) {
			System.out.println(Ids);
			
			
			String title = driver.switchTo().window(Ids).getTitle();
			System.out.println(title);
			
			if(driver.switchTo().window(Ids).getTitle().equals("naukri login - Google search"));
			
			break;
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
	}

}
