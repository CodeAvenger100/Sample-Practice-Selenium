package day13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentFrameDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();

		WebElement Frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']")); // switch to Third Frame
		driver.switchTo().frame(Frame3);

		WebElement iFrame = driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(0);

		String Text= driver.findElement(By.xpath("//div[@id='i1']")).getText();
		System.out.println(Text);

		driver.findElement(By.id("i21")).click();

		driver.switchTo().parentFrame(); // Switching to Parent
		Thread.sleep(5000);

		WebElement frame3TxtBox =driver.findElement(By.xpath("//input[@name='mytext3']"));
		frame3TxtBox.sendKeys("Test");

		Thread.sleep(5000);

	}

}
