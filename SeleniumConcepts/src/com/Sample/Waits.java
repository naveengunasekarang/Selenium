package com.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	/*
	 * When the element is not loaded properly that we will get ElementNotFound
	 * exception
	 */

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// selenium
		driver.get("https://www.amazon.in/");
		// implicitwait
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
//		driver.findElement(By.linkText("Mobiles")).click();
//		driver.close();

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Mobiles"))).click();
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//*[@id=\"s-refinements\"]/div[1]/ul/li[3]/span/a/span"))).click();
		driver.close();

	}

}
