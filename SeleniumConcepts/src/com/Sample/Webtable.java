package com.Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("scroll(0,2500)");
		Thread.sleep(2000);
//		*[@id="customers"]/tbody/tr[2]/td[1] 
//		*[@id="customers"]/tbody/tr[3]/td[1] 
//		*[@id="customers"]/tbody/tr[4]/td[1]
//		*[@id="customers"]/tbody/tr[5]/td[1]
//		*[@id="customers"]/tbody/tr[6]/td[1]
//		*[@id="customers"]/tbody/tr[7]/td[1]

//		String beforexpath = "//*[@id=\"customers\"]/tbody/tr[";
//		String aferxpath = "]/td[1]";
//
//		List<WebElement> le = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
//		int tab_row = le.size();
//		System.out.println("table row" + tab_row);
//
//		for (int i = 2; i <= tab_row; i++) {
//			String actualxpath = beforexpath + i + aferxpath; //
//			WebElement ele = driver.findElement(By.xpath(actualxpath));
//			System.out.println(ele.getText()); // print
//			// to find the element and position in the table
//			if (ele.getText().equals("Centro comercial Moctezuma")) {
//				System.out.println("company name : " + ele.getText() + "is found" + "position" + i);
//				break;
//			}
//		}
//
//		// 2nd colum
//		String afterxpath2 = "]/td[2]";
//		for (int i = 2; i <= tab_row; i++) {
//			String xpath = beforexpath + i + afterxpath2;
//			WebElement el = driver.findElement(By.xpath(xpath));
//			System.out.println(el.getText());
//		}
//
//		System.out.println("******************");
//
//		// company name
//		String afterxpath3 = "]/td[3]";
//		for (int i = 2; i <= tab_row; i++) {
//			String xpath = beforexpath + i + afterxpath3;
//			WebElement el = driver.findElement(By.xpath(xpath));
//			System.out.println(el.getText());
//		}
//
//		// *[@id="customers"]/tbody/tr/th
//
//		// *[@id='customers']/tbody/tr/th[1]
//		// *[@id='customers']/tbody/tr/th[2]
//		// *[@id='customers']/tbody/tr/th[3]
//
//		String colbeforexpath = "// *[@id='customers']/tbody/tr/th[";
//		String afterxpath = "]";
//		List<WebElement> lc = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
//		int cou_size = lc.size();
//		for (int i = 1; i <= cou_size; i++) {
//			String actualxpathC = colbeforexpath + i + afterxpath;
//			WebElement eleC=driver.findElement(By.xpath(actualxpathC));
//			System.out.println("Columns are "+eleC.getText());
//		}

		driver.close();
	}

}
