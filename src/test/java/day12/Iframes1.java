package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();

		// Switch to First Frame-> Frame 1
		WebElement Frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']")); // 1st Frame locator
		driver.switchTo().frame(Frame1); // Switching to Frame1
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Arpan"); // Value provided to TextBox
		Thread.sleep(5000);
		driver.switchTo().defaultContent(); // Come outside of the First Frame / Control comes back to main page

		// Switch to Second Frame-> Frame 2
		WebElement Frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']")); // 2nd Frame locator
		driver.switchTo().frame(Frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Bhattacharyya");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();

		// Switch to Third Frame-> Frame 3
		WebElement Frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']")); // 2nd Frame locator
		driver.switchTo().frame(Frame3);

		WebElement iFrame = driver.findElement(By.tagName("iframe"));
		Thread.sleep(5000);
//				driver.switchTo().defaultContent();

		driver.quit();

	}

}
