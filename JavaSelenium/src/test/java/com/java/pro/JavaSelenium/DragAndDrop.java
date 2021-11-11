package com.java.pro.JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDrop {

	WebDriver driver;

	@BeforeMethod
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");

	}

	public void dragAndDrop() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(iframe);
//		WebElement sc_el =driver.findElement(By.xpath("//*[text()='All Books']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver ;
//		js.executeScript("arguments[0].scrollIntoView", sc_el);
		Thread.sleep(5000);
		Actions act = new Actions(driver);

		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));

		act.clickAndHold(src).moveToElement(dest).release().build().perform();
	}

	@Test
	public void frams() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		WebElement Scroll_Ele = driver.findElement(By.linkText("Buy"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView", Scroll_Ele);

		Thread.sleep(5000);
		Actions act = new Actions(driver);
		WebElement mainFrame = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/iframe"));
		driver.switchTo().frame(mainFrame);
		WebElement iframe = driver.findElement(By.xpath("//*[@id=\"root\"]/iframe"));
		driver.switchTo().frame(iframe);
//		WebElement ifm2 = driver.findElement(By.cssSelector("//*[@id=\"content\"]"));
//		driver.switchTo().frame(ifm2);
		WebElement src = driver.findElement(By.xpath("//*[@id=\"treeSource\"]/ul/li[1]/ul/li[1]/ul/li[5]/div/span"));
		WebElement dest = driver.findElement(By.xpath("//*[@id=\"treeTarget\"]/ul/li[2]"));
		act.clickAndHold(src).moveToElement(dest).release().build().perform();
	}

}
