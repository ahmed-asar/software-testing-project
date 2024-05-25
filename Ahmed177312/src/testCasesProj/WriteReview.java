package testCasesProj;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

//TC21_WRITE_REVIEW_POSITIVE

public class WriteReview {  
  
    public static void main(String[] args) throws InterruptedException {  
        
    System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
    driver.manage().window().maximize();
    JavascriptExecutor js = (JavascriptExecutor)driver;
    
    driver.get("https://yashry.com/");
    
    //Navigating to item
    js.executeScript("window.scrollTo(0,1071)");
    driver.findElement(By.cssSelector("#sd-image-08e2a458-d2a8-40a2-9fde-ae43bfdc903c > img")).click();
    js.executeScript("window.scrollTo(0,2022)");
    js.executeScript("window.scrollTo(0,2476)");
    driver.findElement(By.cssSelector(".product:nth-child(10) .card-image:nth-child(1)")).click();
    js.executeScript("window.scrollTo(0,563)");
    js.executeScript("window.scrollTo(0,1346)");
    js.executeScript("window.scrollTo(0,2038)");
    Thread.sleep(2000);
    
    //Click on write a review button
    driver.findElement(By.linkText("Write a review")).click();
    Thread.sleep(2000);
    
    //Enter form fields
    driver.findElement(By.name("reviewer_name")).sendKeys("John Smith");
    Thread.sleep(2000);
    driver.findElement(By.name("reviewer_email")).sendKeys("johnsmith@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".jdgm-form__rating > .jdgm-star:nth-child(4)")).click();
    Thread.sleep(2000);
    driver.findElement(By.name("review_title")).sendKeys("Good Item");
    Thread.sleep(2000);
    driver.findElement(By.name("review_body")).sendKeys("I recommend this item");
    Thread.sleep(2000);
    driver.findElement(By.cssSelector(".jdgm-submit-rev")).click();
    Thread.sleep(5000);
    
    
    //Check result
    if(driver.findElement(By.className("jdgm-notification")).isDisplayed()) {
    	System.out.println("Review Submitted Successfully.");
    }
    else if(driver.findElement(By.className("jdgm-input-error")).isDisplayed()) {
    	System.out.println("There is a missing field.");
    }

    driver.close();
   
    

    
    }  
}
