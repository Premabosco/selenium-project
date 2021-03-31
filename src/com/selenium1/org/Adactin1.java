package com.selenium1.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Adactin1 extends Baseclass {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = Baseclass.BrowserLaunch("chrome");
		Implicitwait(40);
		
		geturl("https://adactinhotelapp.com/");
		
		Thread.sleep(4000);
		
		
		
		WebElement us = driver.findElement(By.xpath("//input[@name='username']"));
		us.sendKeys("BossPremaSuba");
		
		WebElement pw = driver.findElement(By.xpath("//input[@name='password']"));
		pw.sendKeys("subaprem27");
		
		WebElement ln = driver.findElement(By.xpath("//input[@name='login']"));
		ln.click();
		Thread.sleep(4000);
		
		WebElement lo = driver.findElement(By.xpath("//select[@name='location']"));
		DropDown(lo, "value", "New York");
		
		WebElement htl = driver.findElement(By.xpath("//select[@name='hotels']"));
	Select s = new Select(htl);
s.selectByValue("Hotel Hervey");
		
		WebElement rt = driver.findElement(By.xpath("//select[@name='room_type']"));
		DropDown(rt, "value", "Super Deluxe");
		
		WebElement rno = driver.findElement(By.xpath("//select[@name='room_nos']"));
		DropDown(rno, "value", "1");
		
		WebElement checkin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		checkin.clear();
		checkin.sendKeys("16/03/2021");
		
		WebElement checkout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		checkout.clear();
		checkout.sendKeys("17/03/2021");
		Thread.sleep(4000);
		
		WebElement adroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		adroom.sendKeys("1");
		
		WebElement chldroom = driver.findElement(By.xpath("//select[@name='child_room']"));
		chldroom.sendKeys("1");
		
		WebElement submit = driver.findElement(By.xpath("//input[@name='Submit']"));
	submit.click();
	
	WebElement radiobtn = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	radiobtn.click();
	
	WebElement conti = driver.findElement(By.xpath("//input[@id='continue']"));
	conti.click();
	
	WebElement frstname = driver.findElement(By.xpath("//input[@name='first_name']"));
	frstname.sendKeys("Prema");
	
	WebElement lstname = driver.findElement(By.xpath("//input[@name='last_name']"));
	lstname.sendKeys("Bosco");
	
	WebElement addrs = driver.findElement(By.xpath("//textarea[@name='address']"));
	addrs.sendKeys("st.Donbosco(street)Ayandur villupuram(dt)605755");
	
	WebElement cc_num = driver.findElement(By.xpath("//input[@name='cc_num']"));
	cc_num.sendKeys("1234567890098765");
	
	WebElement cc_type = driver.findElement(By.xpath("//select[@id='cc_type']"));
	DropDown(cc_type, "value", "VISA");
	
	
	WebElement cem = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
	//DropDown(cem, "value", "May");
	DropDown(cem, "value", "2");
	WebElement cey = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	DropDown(cey, "value", "2021");
	
	WebElement cc_cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
	cc_cvv.sendKeys("0227");
	
	WebElement bknow = driver.findElement(By.xpath("//input[@id='book_now']"));
	bknow.click();
	
	
	WebElement lgout = driver.findElement(By.xpath("//input[@id='logout']"));
	lgout.click();
	
	
	
	
	
	
	
	
	
	}
	
	

}
