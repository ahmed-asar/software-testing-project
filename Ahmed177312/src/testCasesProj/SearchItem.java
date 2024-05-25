package testCasesProj;


import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;  
import org.openqa.selenium.By;

//TC19_SEARCH_ITEM_POSITIVE

public class SearchItem {  
  
    public static void main(String[] args) {  
        
    
    System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");  
    WebDriver driver=new ChromeDriver();  
    driver.manage().window().maximize();
    
    driver.navigate().to("https://yashry.com/");  
    String brandName = "SHEIN";        
    
    //Click on "lens" icon to open search box
    driver.findElement(By.className("navUser-item-icon")).click();
    
    //Enter brand name in the search box
    driver.findElement(By.id("search_query")).sendKeys(brandName);
    
    //Press enter key to submit search 
    driver.findElement(By.id("search_query")).submit();
    

      
    }  
  
}  