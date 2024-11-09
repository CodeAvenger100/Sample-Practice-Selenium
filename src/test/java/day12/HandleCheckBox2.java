package day12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.manage().window().maximize();
		
		List <WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for (int i=0; i<checkboxes.size(); i++) {
			WebElement checkBox= checkboxes.get(i);
			System.out.println("Intial Status: "+ checkBox.isSelected());
			Thread.sleep(5000);
			
			if(!checkBox.isSelected()) {
				checkBox.click();
				Thread.sleep(2000);
			}
		
			System.out.println("Final Status: "+ checkBox.isSelected());
			Thread.sleep(2000);
			
		}
		driver.quit();

	}

}
