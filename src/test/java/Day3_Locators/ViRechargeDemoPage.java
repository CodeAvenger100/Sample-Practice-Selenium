package Day3_Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ViRechargeDemoPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myvi.in/prepaid/online-mobile-recharge");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement BuyBtn = driver.findElement(By.xpath("//*[text()='349']//parent::span/following-sibling::div/button"));
		BuyBtn.click();
		WebElement MblNum = driver.findElement(By.id("mobileNum"));
		MblNum.sendKeys("7980075425");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement errMsg = driver.findElement(By.id("errorMsg"));
		String validateErr =errMsg.getText();
		System.out.println(validateErr);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.xpath("//a[text()='Join Vi']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String joinVIText= driver.findElement(By.xpath("//p[@class='join-vi-text']")).getText();
		System.out.println(joinVIText);
		
		driver.quit();
	}

}
