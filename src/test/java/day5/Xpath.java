package day5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.saucedemo.com/");
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        
	        WebElement username = driver.findElement(By.xpath("//input[@name='user-name']"));
	        username.sendKeys("standard_user");

	        WebElement passWord= driver.findElement(By.xpath("//input[@name='password']"));
	        passWord.sendKeys("secret_sauce");

	        Thread.sleep(2000);

	        WebElement loginBtn = driver.findElement(By.xpath("//input[@name='login-button']"));
	        loginBtn.click();
	        
	        List<WebElement> products = driver.findElements(By.className("inventory_item_description"));
	        System.out.println("Product List : ");
	        for(WebElement x: products) {
	        	
	        	System.out.println(x.getText());
	        }
	        

	        driver.quit();


	}

}
