package com.selenium.org;

import java.util.List;//

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[3]/td"));
			//for (WebElement id : rows) {
			//System.out.println(id.getText());
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[3]/td[2]"));
		for (WebElement id : rows) {
		System.out.println(id.getText());
		
		}
			
		}
	}


