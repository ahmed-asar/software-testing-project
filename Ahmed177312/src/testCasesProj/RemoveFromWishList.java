package testCasesProj;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

//TC25_REMOVE_ITEM_FROM_WISH_LIST_POSITIVE

public class RemoveFromWishList {

	public static void main(String[] args) throws InterruptedException { 
		
	 	System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
	    driver.manage().window().maximize();
	 
	    
	    driver.get("https://yashry.com/");
	    driver.manage().window().maximize();
	    
	    //Sign in is required
	    driver.findElement(By.linkText("Sign In")).click();
	    driver.findElement(By.id("login_email")).click();
	    driver.findElement(By.id("login_email")).sendKeys("testing@email.com");
	    driver.findElement(By.id("login_pass")).sendKeys("Testing12");
	    driver.findElement(By.cssSelector(".form-actions > .button")).click();
	    
	    //Navigating to wish list
	    driver.findElement(By.linkText("Account")).click();
	    driver.findElement(By.xpath("//a[contains(text(),\'Wish Lists (1)\')]")).click();
	    driver.findElement(By.linkText("My Wish List")).click();
	    
	    //Remove item from wish list
	    driver.findElement(By.cssSelector(".form > .button")).click();
	    driver.close();
	
	}
}
