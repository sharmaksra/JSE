package JSETEST;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class addlanguages {
	
	 WebDriver driver;
	
  @Test
  public void add_languages() throws Exception {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/"); 	
  }
  @Test
		public void login()  throws Exception{
					
			JavascriptExecutor js =(JavascriptExecutor)driver;
			
			WebElement Username=driver.findElement(By.id("txtUsername"));	
	    js.executeScript("arguments[0].setAttribute('value','Admin')", Username);
	    WebElement Password=driver.findElement(By.id("txtPassword"));
		js.executeScript("arguments[0].setAttribute('value','admin123')", Password);
		WebElement Button=driver.findElement(By.id("btnLogin"));
		js.executeScript("arguments[0].click();",Button);
		
			  
	    WebElement admin1=findElement(By.id("menu_admin_viewAdminModule"));
		js.executeScript("arguments[0].click();",admin1);
		WebElement Qualifications=findElement(By.id("menu_admin_Qualifications"));
		js.executeScript("arguments[0].click();",Qualifications);	
		WebElement viewlanguages=findElement(By.id("menu_admin_viewLanguages"));
		js.executeScript("arguments[0].click();",viewlanguages);
		WebElement addlang=findElement(By.id("btnAdd"));
		js.executeScript("arguments[0].click();",addlang);	
		WebElement addlangjse=findElement(By.name("language[name]"));
		js.executeScript("arguments[0].setAttribute('value','Teluguasd')", addlangjse);	
		WebElement addlangsave=findElement(By.id("btnSave"));
		js.executeScript("arguments[0].click();",addlangsave);	
  }
		  
		  public   WebElement findElement(By by) throws Exception 
			{
						
				 WebElement elem = driver.findElement(by);    	    
				
				 
				if (driver instanceof JavascriptExecutor) 
				{
				 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
			 
				}
				
				return elem;
			}
			  
}
