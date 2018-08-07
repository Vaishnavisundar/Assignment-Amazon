package com.cg.amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	
public static void main(String[] args) throws InterruptedException {
	

	System.setProperty("webdriver.chrome.driver",
			"D:\\Users\\vaishnav\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();	

	
	// to enter first product 
	WebElement type = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
	type.sendKeys("one plus 6 phone");
	
	WebElement search = driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
    search.click();
  
    WebElement mobile = driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div/div/div[2]/div[1]/div[1]/a/h2"));
    mobile.click();
    
    String withhandle=driver.getWindowHandle();
    for(String with : driver.getWindowHandles()) {
    	
    	driver.switchTo().window(with);
    }
    
    WebElement addtocart = driver.findElement(By.id("add-to-cart-button"));
    addtocart.click();
    
    
    
    WebElement amazon = driver.findElement(By.id("nav-logo"));
    amazon.click();

    WebElement item2 = driver.findElement(By.xpath("//*[@id=\"1bf73d3a\"]/span/div/div[1]/a/img"));
    item2.click();
    
    WebElement item2se = driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[2]/div/div/a/img"));
    item2se.click();
    
    String withhandle2=driver.getWindowHandle();
    for(String with : driver.getWindowHandles()) {
    	
    	driver.switchTo().window(with);
    }
  
    WebElement addtocart2 = driver.findElement(By.id("add-to-cart-button"));
    addtocart2.click();
    
    
    
    WebElement amazon3 = driver.findElement(By.id("nav-logo"));
    amazon3.click();

    WebElement item3 = driver.findElement(By.xpath("//*[@id=\"1bf73d3a\"]/span/div/div[1]/a/img"));
    item3.click();
    
    WebElement item3se = driver.findElement(By.xpath("//*[@id=\"result_1\"]/div/div[2]/div/div/a/img"));
    item3se.click();

    String withhandle3=driver.getWindowHandle();
    for(String with : driver.getWindowHandles()) {
    	
    	driver.switchTo().window(with);
    }
    
    WebElement addtocart3 = driver.findElement(By.id("add-to-cart-button"));
    addtocart3.click();
    
    
    
    WebElement amazon4 = driver.findElement(By.id("nav-logo"));
    amazon4.click();

    WebElement item4 = driver.findElement(By.xpath("//*[@id=\"1bf73d3a\"]/span/div/div[1]/a/img"));
    item4.click();
    
    WebElement item4se = driver.findElement(By.xpath("//*[@id=\"result_2\"]/div/div[2]/div/div/a/img"));
    item4se.click();

    String withhandle4=driver.getWindowHandle();
    for(String with : driver.getWindowHandles()) {
    	
    	driver.switchTo().window(with);
    }
    
    WebElement addtocart4 = driver.findElement(By.id("add-to-cart-button"));
    addtocart4.click();
    
   
    
    WebElement amazon5 = driver.findElement(By.id("nav-logo"));
    amazon5.click();

    WebElement item5 = driver.findElement(By.xpath("//*[@id=\"1bf73d3a\"]/span/div/div[1]/a/img"));
    item5.click();
    
    WebElement item5se = driver.findElement(By.xpath("//*[@id=\"result_4\"]/div/div[2]/div/div/a/img"));
    item5se.click();

    String withhandle5=driver.getWindowHandle();
    for(String with : driver.getWindowHandles()) {
    	
    	driver.switchTo().window(with);
    }
    
    WebElement addtocart5 = driver.findElement(By.id("add-to-cart-button"));
    addtocart5.click();
    
    driver.quit();
    
    
 }
}
