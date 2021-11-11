package com.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("promtButton"));
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", ele);
		Thread.sleep(2000);
        org.openqa.selenium.Alert pbox = driver.switchTo().alert();
        String s =pbox.getText();
        System.out.println(s);
		pbox.sendKeys("naveen");
		Thread.sleep(2000);
		pbox.accept();
		Thread.sleep(2000);
		driver.close();

	}

}
