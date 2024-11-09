package Day3_Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo4 extends Locators{

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		
		List<WebElement> itemNames= driver.findElements(By.className("inventory_item_name"));
		System.out.println("Items are: ");
		for (WebElement x: itemNames) {
			
			System.out.println(x.getText());
		}
		
		
		List<WebElement> itemPrice= driver.findElements(By.className("inventory_item_price"));
		System.out.println("Items are: ");
		for (WebElement x: itemPrice) {
			
			System.out.println(x.getText());
		}
		
		driver.quit();
	}

}
