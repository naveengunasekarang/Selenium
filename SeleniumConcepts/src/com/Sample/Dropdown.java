package com.Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
//		WebElement dropdown=driver.findElement(By.xpath("//*[@id='oldSelectMenu']"));
		WebElement MultiDP=driver.findElement(By.xpath("//*[@id='cars']"));
		Select sel = new Select(MultiDP);
		if(sel.isMultiple()) {
			sel.selectByIndex(1);
			sel.selectByVisibleText("opel");
			sel.selectByValue("saab");
		}
		//sel.selectByIndex(4);
//		sel.selectByValue("7");
//		sel.selectByVisibleText("Magenta");
		Thread.sleep(2000);
		driver.close();
	

	}

}
