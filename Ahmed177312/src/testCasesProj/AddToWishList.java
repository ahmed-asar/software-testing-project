package testCasesProj;

import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;



//TC24_ADD_ITEM_TO_WISH_LIST_POSITIVE


public class AddToWishList {  
  
    public static void main(String[] args) throws InterruptedException {  
        
     
    System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
    driver.manage().window().maximize();
    
    driver.get("https://yashry.com/");
    
    //Sign in is required to add item to wish list
    driver.findElement(By.linkText("Sign In")).click();
    driver.findElement(By.id("login_email")).click();
    driver.findElement(By.id("login_email")).sendKeys("testing@email.com");
    driver.findElement(By.id("login_pass")).sendKeys("Testing12");
    driver.findElement(By.cssSelector(".form-actions > .button")).click();
    
   
    
    //Head back to home page after login
    driver.findElement(By.className("header-logo-image")).click();
    
    //Navigate to items collection
    driver.findElement(By.xpath("//img[contains(@src,\'https://cdn11.bigcommerce.com/s-y2uyjca306/product_images/uploaded_images/wcc-.jpg\')]")).click();
    
    //Navigate to an item
    driver.findElement(By.xpath("//img[@alt=\'One Color\']")).click();
    
    //String item = driver.findElement(By.className("productView-title")).getText();
    Thread.sleep(2000);
    
    //Click on "heart" icon to add to wish list
    driver.findElement(By.cssSelector(".dropdown-menu-button svg")).click();
    Thread.sleep(2000);
    
    //Click add to wish list from the drop-down list
    driver.findElement(By.xpath("//input[@value=\'Add to My Wish List\']")).click();
    
    
    }
    
}