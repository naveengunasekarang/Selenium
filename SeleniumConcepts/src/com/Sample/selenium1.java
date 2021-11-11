package com.Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// selenium
		String url = "https://www.flipkart.com/";
		driver.get(url); // launch the flipkart site
//		String title = driver.getTitle();
//		int len = driver.getTitle().length();
//		System.out.println(title + " " + len);
//		Thread.sleep(2000);
//		driver.quit();

		driver.navigate().to(
				"https://www.flipkart.com/fashion-big-diwali-sale-trendy-2021-store?param=19867736376343&fm=neo%2Fmerchandising&iid=M_0237b1a1-672e-4101-929b-1bb55af44a5c_1_792OEL9WB5K2_MC.NYEMHX57LP8R&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion_NYEMHX57LP8R&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L0_view-all&cid=NYEMHX57LP8R");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.quit();

	}
}
