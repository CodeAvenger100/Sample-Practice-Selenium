package day8;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeBrowserTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.setBrowserVersion("beta");
		
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://academy.swaroopnadella.com/");
		
		driver.manage().window().maximize();
		Thread.sleep(5);
		String PageTitle= driver.getTitle();
		System.out.println(PageTitle);
		
		driver.quit();
		
		//Feature File Testing

	}

}
