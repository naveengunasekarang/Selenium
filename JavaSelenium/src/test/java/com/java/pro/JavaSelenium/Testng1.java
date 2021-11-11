package com.java.pro.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng1 {

	static WebDriver driver;

	@BeforeMethod
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

	}

	@Test(priority = 0)
	public void testScrollAndClick() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/default.asp");
		driver.manage().window().maximize();
		WebElement Ele = driver.findElement(By.linkText("Python Tutorial"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", Ele);
//		Thread.sleep(5000);
		Ele.click();
		driver.close();
	}

	@Test(priority = 1)
	public void logoTest() throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/default.asp");
		driver.manage().window().maximize();
//		Thread.sleep(5000);
		boolean Login_link = driver.findElement(By.linkText("Python Tutorial")).isDisplayed();
		Assert.assertTrue(Login_link);
		driver.close();
	}

	@AfterTest
	public void termination() {
		driver = new ChromeDriver();
		driver.quit();
	}

}
