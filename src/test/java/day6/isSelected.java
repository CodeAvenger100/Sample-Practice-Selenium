package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Locate Radio Button 
		WebElement Radio1 = driver.findElement(By.xpath("//*[contains(@value, 'radio1')]"));
		Radio1.click();
		Thread.sleep(2000);
		System.out.println(Radio1.isSelected());
		
		//Check all the Options
		WebElement Option1 = driver.findElement(By.xpath("//*[contains(@id,'checkBoxOption1')]"));
		WebElement Option2 = driver.findElement(By.xpath("//*[contains(@id,'checkBoxOption2')]"));
		WebElement Option3 = driver.findElement(By.xpath("//*[contains(@id,'checkBoxOption3')]"));
		
		
		Option1.click();
		Option2.click();
		Option3.click();
		
		Thread.sleep(2000);
		System.out.println(Option1.isSelected());
		System.out.println(Option2.isSelected());
		System.out.println(Option3.isSelected());
		
		Thread.sleep(2000);
		
		driver.quit();
		

	}

}
