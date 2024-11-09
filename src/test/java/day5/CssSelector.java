package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CssSelector {

    public static void main(String args[]) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement username = driver.findElement(By.cssSelector("input#user-name"));
        username.sendKeys("standard_user");

        WebElement passWord= driver.findElement(By.cssSelector("input#password"));
        passWord.sendKeys("secret_sauce");

        Thread.sleep(2000);

        WebElement loginBtn = driver.findElement(By.cssSelector("input#login-button"));
        loginBtn.click();

        WebElement product = driver.findElement(By.className("inventory_item_description"));
        String text= product.getText();
        System.out.println(text);

        driver.quit();



    }



}
