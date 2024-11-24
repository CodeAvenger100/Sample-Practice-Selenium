package day16;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Printing the Book Table details:
		
//		List <WebElement> tables = driver.findElements(By.xpath("//table[@name='BookTable']"));
//		for(WebElement table: tables) {
//			System.out.println("Table Details: " + table.getText());
//		}
//		
		//Finding no of Rows
		int rowsSize =driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("No of Rows :" + rowsSize);
		
		//Finding no of Coloumns
		int columns =driver.findElements(By.xpath("//table[@name='BookTable']//tr/th")).size();
		System.out.println("No of coloumns :" + columns);
		
		//Retrieve data from specific row and Coloumn -> 4th Row 3rd Colmn
//		String Text= driver.findElement(By.xpath("//table[@name='BookTable']//tr[4]/td[3]")).getText();
//		System.out.println(Text);
//		
		//Print all the Element of Row and Colm
//		System.out.println("Table Details: " );
//		for (int row = 2; row <= rows; row++) { // Start from row 2 (excluding headers if any)
//		    for (int col = 1; col <= columns; col++) {
//		        String details = driver.findElement(By.xpath("//table[@name='BookTable']//tr[" + row + "]/td[" + col + "]")).getText();
//		        System.out.print(details + "\t"); // Print details with a tab for alignment
//		    }
//		    System.out.println(); // Move to the next line after completing a row
//		}
		
		
		//Extract Author Info
		
//		System.out.println("Author Details: " );
//		List<WebElement> Authors =driver.findElements(By.xpath("//table[@name='BookTable']//tr/td[2]"));
//		for(WebElement author: Authors) {
//			System.out.println(author.getText());
//		}
		
		
		
		//Extract Subject Info
		
//		System.out.println("Subject Details: " );
//		List<WebElement> subjects =driver.findElements(By.xpath("//table[@name='BookTable']//tr/td[3]"));
//		for(WebElement subject: subjects) {
//			System.out.println(subject.getText());
//		}
		
		//Extract Books based on Authors
		// Get all rows from the table, starting from the second row (to skip the header)
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr[position() > 1]"));

		System.out.println("BookName\t\tAuthor\tSubject\t\tPrice");

		for (WebElement row : rows) {
		    // Fetch the details for the current row
		    String authorName = row.findElement(By.xpath("./td[2]")).getText();

		    // Check if the author matches "Amit"
		    if (authorName.equals("Amit")) {
		        String bookName = row.findElement(By.xpath("./td[1]")).getText();
		        String subject = row.findElement(By.xpath("./td[3]")).getText();
		        String price = row.findElement(By.xpath("./td[4]")).getText();

		        // Print the details
		        System.out.println(bookName + "\t" + authorName + "\t" + subject + "\t" + price);
		    }
		}
		driver.quit();

	}

	}
