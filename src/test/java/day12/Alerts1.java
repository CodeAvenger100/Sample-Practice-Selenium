package day12;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(5000);
		
//		driver.switchTo().alert().accept();         // Accept the alert
		
		Alert myAlert = driver.switchTo().alert();
		String msg = myAlert.getText();
		System.out.println(msg);
//		myAlert.accept();  //Accept
		myAlert.dismiss();
		
		Thread.sleep(5000);
		
		String Result=driver.findElement(By.id("//p[@id='result']")).getText();
		System.out.println(Result);
		
		
		driver.quit();

	}

}
