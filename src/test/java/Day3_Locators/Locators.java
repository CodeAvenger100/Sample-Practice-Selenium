package Day3_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		
		String Backpack= driver.findElement(By.className("inventory_item_name")).getText();
		System.out.println(Backpack);
		
		String itemPrice= driver.findElement(By.className("inventory_item_price")).getText();
		System.out.println(itemPrice);
		
		Thread.sleep(1000);
		
		driver.close();
	}

}
