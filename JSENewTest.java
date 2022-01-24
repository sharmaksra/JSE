package JSETEST;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class JSENewTest {
	
	WebDriver driver;
  @Test
  public void Javase()throws Exception {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement Username=findElement(By.id("txtUsername"));
		WebElement Password=findElement(By.name("txtPassword"));
		WebElement button=findElement(By.id("btnLogin"));
		 
		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','Admin')", Username);
		js.executeScript("arguments[0].setAttribute('value','admin123')", Password);
		 js.executeScript("arguments[0].click();",button);
		 
		 WebElement pim1 =findElement(By.id("menu_pim_viewPimModule"));
		 js.executeScript("arguments[0].click();",pim1);
		 WebElement config =findElement(By.id("menu_pim_Configuration"));
		 js.executeScript("arguments[0].click();",config);
		 WebElement customf =findElement(By.id("menu_pim_listCustomFields"));
		 js.executeScript("arguments[0].click();",customf);
		 WebElement add =findElement(By.id("buttonAdd"));
		 js.executeScript("arguments[0].click();",add);
		 WebElement field =findElement(By.id("customField_name"));
		 js.executeScript("arguments[0].setAttribute('value','ram')", field);
		 
		   
		 Select dropdown1= new Select(driver.findElement(By.id("customField_screen")));
		 
		 dropdown1.selectByIndex(2);
		 
         Select dropdown2= new Select(driver.findElement(By.id("customField_type")));
		 
		 dropdown2.selectByIndex(1);
		 
		 WebElement save =findElement(By.id("btnSave"));
		 js.executeScript("arguments[0].click();",save);	 
		 
  }
  
  
  public  WebElement findElement(By by) throws Exception 
 	{
 				
 		 WebElement elem = driver.findElement(by);    	    
 		
 		 
 		if (driver instanceof JavascriptExecutor) 
 		{
 		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
 	 
 		}
 		
 		return elem;
 	}
}
