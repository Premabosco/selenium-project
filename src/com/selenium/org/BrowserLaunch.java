package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.navigate().to("\"https://www.facebook.com/\"");
driver.navigate().back();
driver.navigate().refresh();
driver.navigate().forward();
Thread.sleep(2000);
driver.close();



		
	}

}
