package com.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		WebElement options1 =driver.findElement(By.id("tree-node"));
		if(options1.isSelected()) {
			System.out.println("Already Checked");
		}
		else {
			options1.click();
		}
		driver.close();

	}

}
