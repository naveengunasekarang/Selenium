package com.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		// implicitwait
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
//		driver.findElement(By.linkText("Mobiles")).click();
//		driver.close();

		// Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, 21);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Mobiles"))).click();
		driver.findElement(By.xpath("//div[@id='nav-subnav']/a[4]")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
