package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		WebElement simple_alert = driver.findElement(By.xpath("//button[contains(text(),'    click the button to')]"));
		simple_alert.click();
		Thread.sleep(3000);
		
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();
		
		WebElement confirm_alert = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		
		confirm_alert.click();
		Thread.sleep(2000);
		
		WebElement ca = driver.findElement(By.xpath("(//button[contains(text(),'click the button to')])[2]"));
		ca.click();
		org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
		alert.accept();
		//alert.dismiss();
		Thread.sleep(2000);
		
		WebElement prompt_alert = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		prompt_alert.click();
		Thread.sleep(2000);
		
		WebElement pa = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		pa.click();
		
		
		Thread.sleep(2000);
		org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
		alert.sendKeys("gfhfhfs");
		alert.accept();
		//alert.dismiss();
		//Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
