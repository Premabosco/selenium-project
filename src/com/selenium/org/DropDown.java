package com.selenium.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        
		driver.get("https://www.facebook.com/r.php");
		WebElement email_address = driver.findElement(By.xpath("//input[@id='email']"));
		email_address.sendKeys("prema@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("(//input[@class'inputtext_55rl_61uy'])[2]"));
		password.sendKeys("spvj");
		
		WebElement create_button = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create_button.click();
		
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.xpath("//Select[@id='day']"));
		Select s = new Select(day);
		s.selectByValue("20");
		System.out.println(s.isMultiple());
		
		List<WebElement> options = s.getOptions();
	for (WebElement x : options) {
		System.out.println(x.getText());
	}
	Thread.sleep(7000);
	driver.quit();
		
	} {
			
		}
		
		
		
	
	
	
	
	}
	
	
	
	
