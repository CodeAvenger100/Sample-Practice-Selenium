package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Join now")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		WebElement rememberMe= driver.findElement(By.id("remember-me-checkbox"));
		if(rememberMe.isSelected()==true) {
			rememberMe.click();
			System.out.println("CheckBox is unselected!!");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		}
		
		
		driver.quit();

	}

}
