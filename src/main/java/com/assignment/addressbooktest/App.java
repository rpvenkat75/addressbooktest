package com.assignment.addressbooktest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        
        System.setProperty("webdriver.chrome.driver","/C://venkat//chromedriver-win64//chromedriver.exe");
        ChromeOptions chromeOptions=new ChromeOptions();
        WebDriver driver=new ChromeDriver(chromeOptions);
        
        System.out.println("start");
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
        driver.findElement(By.id("email")).sendKeys("7323976401");
	   
        Thread.sleep(1000);
         
        driver.findElement(By.id("pass")).sendKeys("Sidd1rth");
        Thread.sleep(1000);
        
       // driver.findElement(By.id("u_0_5_FM")).click();
        driver.findElement(By.name("login")).click();
      
		/*
		 * driver.get("http://52.91.200.243:8080/addressbook-2.0/");
		 * 
		 * driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 * 
		 * driver.findElement(By.className("v-button")).click(); Thread.sleep(1000);
		 * 
		 * driver.findElement(By.id("gwt-uid-5")).sendKeys("Siddarth Reddy");
		 * Thread.sleep(1000);
		 * 
		 * driver.findElement(By.id("gwt-uid-7")).sendKeys("peddi"); Thread.sleep(1000);
		 * 
		 * driver.findElement(By.id("gwt-uid-9")).sendKeys("6666666666");
		 * Thread.sleep(1000);
		 * 
		 * driver.findElement(By.id("gwt-uid-11")).sendKeys("test@test.com");
		 * Thread.sleep(1000);
		 * 
		 * driver.findElement(By.id("gwt-uid-13")).sendKeys("23/02/2004,");
		 * Thread.sleep(1000);
		 * 
		 * driver.findElement(By.className("v-button-primary")).click();
		 * Thread.sleep(1000);
		 */
        driver.quit();
        System.out.println("done");
        
    }
}
