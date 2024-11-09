package day4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorDemoOpenCart {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize(); //maximize the window
		Thread.sleep(2000);
		
		WebElement searchBox= driver.findElement(By.name("search"));
		searchBox.sendKeys("phone");
		searchBox.sendKeys(Keys.ENTER);
		
//		WebElement searchIcon= driver.findElement(By.className("fa-solid fa-magnifying-glass"));
//		searchIcon.click();
		
		WebElement phoneDescription = driver.findElement(By.className("product-thumb"));
		String Details= phoneDescription.getText();
		System.out.println(Details);
		
		driver.quit();
		
	}

}
