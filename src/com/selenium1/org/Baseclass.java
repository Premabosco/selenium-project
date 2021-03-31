package com.selenium1.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.org.Actions;

public class Baseclass {
	public static WebDriver driver;

	// BrowserLaunch

	public static WebDriver BrowserLaunch(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "//Driver//chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver",
						System.getProperty("user.dir") + "//Driver//geckodriver.exe");
				driver = new FirefoxDriver();

			}

			else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir") + "//Driver//IEDriverServer.exe");

				driver = new InternetExplorerDriver();

			} else {
				System.out.println("Invalid Browsername");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;

		// getURL
	}

	public static void geturl(String url) {
		driver.get(url);
	}

//DropDown
	public static void DropDown(WebElement element, String option, String value) {
		Select s = new Select(element);
		if (option.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		} else if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);

		}

		else if (option.equalsIgnoreCase("texts")) {
			s.selectByVisibleText(value);
		}
	}

	// send_keys
	public static void sendkeys(WebElement element, String string) {

	}

	// close
	public static void close() {
		driver.close();
	}

	// quit
	public static void quit() {
		driver.quit();

	}

	// navigate to
	public static void navigateTo(String input) {
		driver.navigate().to(input);
	}

	// navigate back
	public static void navigateback() {
		driver.navigate().back();

	}

	// navigate forward
	public static void navigateforward() {
		driver.navigate().back();
	}

	// refresh
	public static void refresh() {
		driver.navigate().back();
	}

	// simple alert
	public static void alert() {
		Alert alert = driver.switchTo().alert();

	}

	// confirm_alert
	public static void confirmAlert1(String option) {
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		if (option.equalsIgnoreCase("accept")) {
			alert.accept();
		} else if (option.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
		}
	}

	// prompt_alert
	public static void promptAlert1(String input, String option) {
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.sendKeys(input);
		if (option.equalsIgnoreCase("accept")) {
			alert.accept();
		} else if (option.equalsIgnoreCase("dismiss")) {
			alert.dismiss();
		}
	}

	// actions
	public static void actions(String option, WebElement element) {

	}

	// Actions_dranganddrop
	public static void actionDrogandDrop(WebElement src_element, WebElement dest_element) {
		org.openqa.selenium.interactions.Actions ac = new org.openqa.selenium.interactions.Actions(driver);
		ac.dragAndDrop(src_element, dest_element).build().perform();

	}

	// Inner_Frames
	public static void inner_frame(String parameter, String value) {
		if (parameter.equalsIgnoreCase("integer")) {
			driver.switchTo().frame(value);
		} else if (parameter.equalsIgnoreCase("webelement")) {
			driver.switchTo().frame(value);
		} else if (parameter.equalsIgnoreCase("id_or_name")) {
			driver.switchTo().frame(value);
		}
	}

	// Parent_Frames
	public static void Parent_Frame() {
		driver.switchTo().parentFrame();
	}

	// Default_frame
	public static void defaultFrame() {
		driver.switchTo().parentFrame();
	}

	// robot
	public static void robot(String option) throws AWTException {
		Robot r = new Robot();
		if (option.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if ((option.equalsIgnoreCase("enter"))) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if (option.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
	}

	// Actions
	public static void actions1(String option, WebElement element) {
		org.openqa.selenium.interactions.Actions ac = new org.openqa.selenium.interactions.Actions(driver);

		if (option.equalsIgnoreCase("rightclick")) {
			ac.contextClick(element).build().perform();

		} else if (option.equalsIgnoreCase("doubleclick")) {
			ac.doubleClick(element).build().perform();

		} else if (option.equalsIgnoreCase("move to element")) {
			ac.moveToElement(element).build().perform();

		}

	}

	// Actions_draganddrop
	public static void actionDragandDrop(WebElement src_element, WebElement dest_element) {
		org.openqa.selenium.interactions.Actions ac = new org.openqa.selenium.interactions.Actions(driver);
		ac.dragAndDrop(src_element, dest_element);
	}

	// inner_Frame
	public static void inner_Frame(String parameter, String value) {
		if (parameter.equalsIgnoreCase("integer")) {
			driver.switchTo().frame(value);
		} else if (parameter.equalsIgnoreCase("webelement")) {
			driver.switchTo().frame(value);
		} else if (parameter.equalsIgnoreCase("id_or_name")) {
			driver.switchTo().frame(value);
		}
	}

	// Parent_Frames
	public static void parent_Frame() {
		driver.switchTo().parentFrame();
	}

	// Default_frame
	public static void defaultFrame1() {
		driver.switchTo().parentFrame();
	}

	// robot
	public static void robot1(String option) throws AWTException {
		Robot r = new Robot();
		if (option.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if ((option.equalsIgnoreCase("enter"))) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		} else if (option.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
	}

	// Get_Attribute
	public static void getAttribute(WebElement element, String value) {
		element.getAttribute(value);
	}

	// Is_Multiple
	public static void getAttribute(WebElement element) {

		Select S = new Select(element);
		S.isMultiple();
	}

	// Get all selected option
	public static void getallselectedoption(WebElement element) {

		Select S = new Select(element);
		List<WebElement> allSelectedoptions = S.getAllSelectedOptions();
	}

	// Get first selected option
	public static void getfirstselectedoption(WebElement element) {

		Select S = new Select(element);
		WebElement firstselectedoption = S.getFirstSelectedOption();
	}

	// click
	public static void click(WebElement element) {
		element.click();
	}

	// TakeScreenShot
	public static void takeScreenshot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File DesFile = new File("//Screenshot//" + filename + "png");
		FileUtils.copyFile(srcFile, DesFile);
	}

	// scrollup_Down_Axis
	public static void ScrollupDownAxis(String option, String value) {
	}

	// Check box
	public static void CheckBox(WebElement element) {
		element.click();
	}

	// Is_Enable
	public static void isEnabled(WebElement element) {
		element.isEnabled();
	}

	// Is_Displayed
	public static void isDisplayed(WebElement element) {
		element.isDisplayed();
	}

	// Is_Selected
	public static void isSelected(WebElement element) {
		element.isSelected();
	}

	// Get_options
	public static void getOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (WebElement x : options) {
			System.out.println(x.getText());
		}
	}

	// Get_Title
	public static void getTitle() {
		driver.getTitle();
	}

	// Get_Current_Url
	public static void getCurrentUrl() {
		driver.getCurrentUrl();
	}

	// TakeScreenShot
	public static void takeScreenshot1(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;

		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File DesFile = new File("//Screenshot//" + filename + "png");
		FileUtils.copyFile(srcFile, DesFile);
	}

	// scrollup_Down_Axis
	public static void ScrollupDownAxis11(String option, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollby(0,value");
	}

	// Scrollup_down_element
	public static void ScrollupDownElement(String value, String element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(value);", element);

	}

	// Implicit Wait
	public static void Implicitwait(int timeouts) {
		driver.manage().timeouts().implicitlyWait(timeouts, TimeUnit.SECONDS);
	}

	// Explicit Wait
	public static void Explicitwait(int timeout, WebElement element1) {
		WebDriverWait Wait = new WebDriverWait(driver, timeout);
		// wait.until(visibility of (element));
	}

	// Fluent Wait
	public static void fluentwait(int time, int timeout) {
		Wait<WebDriver> Wait = new FluentWait<WebDriver>(driver);
		// .with timeout(time,SECONDS);
		// .poolingEvery(timeout,SECONDS);
		// .ignoring(Exception.class);

	}

}
