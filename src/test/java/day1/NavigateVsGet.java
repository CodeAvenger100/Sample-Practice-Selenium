package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateVsGet {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		// driver.get("https://www.google.co.in/");
		
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.navigate().to("https://academy.swaroopnadella.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.close();
	}

}
