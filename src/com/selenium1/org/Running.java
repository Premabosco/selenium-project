package com.selenium1.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Running extends Baseclass {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = Baseclass.BrowserLaunch("Chrome");
		Implicitwait(40);

		geturl("http://adactinhotelapp.com/");
		Thread.sleep(4000);
		WebElement un = driver.findElement(By.id("username"));
		un.sendKeys("premabos");

		WebElement pw = driver.findElement(By.id("password"));
		pw.sendKeys("12345678");

		WebElement login = driver.findElement(By.id("login"));
		login.click();
         Thread.sleep(5000);
		WebElement loctn = driver.findElement(By.id("location"));
	    DropDown(loctn, "value", "London");

		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s=new Select(hotel);
		s.selectByValue("Hotel Sunshine");
		//DropDown(hotel, "value", "hotel sunshine");

		WebElement roomtp = driver.findElement(By.id("room_type"));
		DropDown(roomtp, "value", "Deluxe");

		WebElement roomno = driver.findElement(By.id("room_nos"));
		DropDown(roomno, "value", "3");

		WebElement checkin = driver.findElement(By.className("date_pick"));
	    checkin.clear();
	    checkin.sendKeys("05/03/2021");

		WebElement checkout = driver.findElement(By.id("date_pick"));
		  checkin.clear();
		checkout.sendKeys("06/03/2021");
        Thread.sleep(1000);
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();

		WebElement rb = driver.findElement(By.id("radiobutton_2"));
		rb.click();

		WebElement conti = driver.findElement(By.id("continue"));
		conti.click();

		WebElement firstname = driver.findElement(By.id("first_name"));
		DropDown(firstname, "value", "tom");

		WebElement lastname = driver.findElement(By.name("last_name"));
		lastname.sendKeys("jerry");

		WebElement addrs = driver.findElement(By.id("address"));
		DropDown(addrs, "value", "adyar1st badbanabastreet");

		WebElement crcard = driver.findElement(By.id("cc_num"));
		DropDown(crcard, "value", "0987654321234567");

		WebElement ctype = driver.findElement(By.id("cc_type"));
		DropDown(ctype, "value", "VISA");

		WebElement emonth = driver.findElement(By.id("cc_exp_month"));
		DropDown(emonth, "value", "8");

		WebElement eyear = driver.findElement(By.id("cc_exp_year"));
		DropDown(eyear, "value", "2015");

		WebElement cvv = driver.findElement(By.name("cc_cvv"));
		DropDown(cvv, "value", "VISA ");

		WebElement book_now = driver.findElement(By.id("book_now"));
		DropDown(book_now, "value", "Deluxe");

		WebElement logout = driver.findElement(By.xpath("Logout"));
		logout.click();

	}
}
