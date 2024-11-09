package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Validate Logo of Rahul Shetty Page
		WebElement logo = driver.findElement(By.xpath("//*[@class='logoClass']"));
		Boolean status = logo.isDisplayed();
		System.out.println(status);
		
		//Validate 'Practise page txt'
		WebElement textLabel = driver.findElement(By.xpath("//h1[text()='Practice Page']"));
		String textLabelmsg = textLabel.getText();
		System.out.println(textLabelmsg);
		Boolean textLabelStatus = logo.isDisplayed();
		System.out.println(textLabelStatus);
		
		driver.quit();

	}

}
