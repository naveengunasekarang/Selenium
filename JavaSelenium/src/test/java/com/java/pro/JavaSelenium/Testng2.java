package com.java.pro.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng2 {

	WebDriver driver;

	@BeforeMethod
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

	}

	@Test
	public void amazonTestScrollAndClick() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Ele = driver.findElement(By.linkText("Careers"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", Ele);
		Thread.sleep(5000);
		Ele.click();
		driver.close();
	}

}
