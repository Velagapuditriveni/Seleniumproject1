package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.excelutility.Excelutility;

public class Jainbook_Advancesearchpage {
	WebDriver driver;
	 By login=By.linkText("Login");
	    By Email=By.xpath("/html/body/form/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[1]/input");
	    By password=By.xpath("/html/body/form/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[2]/input");
	    By loginsubmit=By.xpath("/html/body/form/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[3]/input");
	    By advancesearch=By.xpath("//*[@id=\"navigation\"]/ul/li[1]/a");
	    By Myaccount=By.xpath("//span[@class='uname']");
		By logout=By.xpath("//*[@id=\"logout\"]");
	   
	    public void launch() { // url for launch the chrome
			System.setProperty("webdriver.chrome.driver",  "C:\\Users\\triveni\\Desktop\\Selenium jars\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
		}
		public void LoginPage() //using webdriver get visting the testing website
		{
			driver.get("https://www.jainbookagency.com/india-largest-online-book-store.aspx");
			System.out.println(driver.getTitle());
		}
		
	    
	    public void logine() throws IOException
	    {
	    	Excelutility a =new Excelutility();
			driver.findElement(login).click();
			driver.findElement(Email).sendKeys(a.excel_username(1)); // passing the vaild mail
			driver.findElement(password).sendKeys(a.excel_password(1)); // passing the vaild password
			driver.findElement(loginsubmit).click();
	    }
	    public void search()
	    {
	    	driver.findElement(advancesearch).click();
	    }
	    public void close() throws InterruptedException
	    {
	    	Thread.sleep(3000);
			driver.findElement(Myaccount).click();
			WebElement a=driver.findElement(logout);
			Actions act=new Actions(driver);
			act.moveToElement(a).click();
			Thread.sleep(300);	
	    	driver.close();
	    }
}
