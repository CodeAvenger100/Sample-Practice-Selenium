package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractise {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver= new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/"); //Open Facebook
		
		driver.manage().window().maximize();
		
		String BrowserTitle = driver.getTitle();
		System.out.println(BrowserTitle);
		

		//driver.close(); //Close the current Window
		driver.quit();  //Quit all the browser windows

	}

}
