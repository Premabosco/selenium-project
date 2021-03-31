package com.selenium1.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser_Launch extends  Baseclass  {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver=Baseclass.BrowserLaunch("Chrome");
		geturl("https://www.amason.in/");
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.quit();
	}
	public static  WebDriver browserLaunch(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.driver.chromedriver", System.getProperty("user.dir")+ "//Driver//chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("Webdriver.gecko.driver", System.getProperty("user.dir")+"//Driver//geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+ "//Driver//InternetExplorer.exe");
				driver = new InternetExplorerDriver();
			}
			else {
				System.out.println("Invalid browsername");
			}
		}
			catch (Exception e) {
				
				e.printStackTrace();
			}
		driver.manage().window().maximize();
		return driver;
			
				// TODO: handle exception
			}
				
				
				
				
				
			
				
						
				
				
			
				
				
			
		
			
		
		
		
		
	}
	


