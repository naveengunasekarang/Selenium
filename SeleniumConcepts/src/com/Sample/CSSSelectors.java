package com.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CSSSelectors {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, 23);
		wait.until(ExpectedConditions.presenceOfElementLocated
				(By.cssSelector("input[placeholder='First Name']"))).
		sendKeys("naveen");
		driver.findElement(By.cssSelector("textarea[id='currentAddress']")).isEnabled();
		driver.close();

	}

}
