package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class complexXpath1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/men-tshirts");
		driver.manage().window().maximize();
		
		//Select any Brand using Sibling X-path Method
		
		driver.findElement(By.xpath("(//span[text()='Brand'] /following-sibling::ul/li)[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Brand'] /following-sibling::ul/li)[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Brand'] /following-sibling::ul/li)[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Brand'] /following-sibling::ul/li)[4]")).click();
		Thread.sleep(2000);
		
		driver.quit();
		
		

	}

}
