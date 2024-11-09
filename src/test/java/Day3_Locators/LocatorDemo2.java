package Day3_Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//Extract all the usernames 
		String usernames = driver.findElement(By.id("login_credentials")).getText();
		System.out.println("Username values: "+ usernames);
		
		//Extract password
		String password = driver.findElement(By.className("login_password")).getText();
		System.out.println("Password value: "+ password);
		
		
		driver.quit();

	}

}
