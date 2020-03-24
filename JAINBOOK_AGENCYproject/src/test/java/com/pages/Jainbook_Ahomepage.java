package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jainbook_Ahomepage {
	WebDriver driver;
	 By login=By.linkText("Login");
	    By Email=By.xpath("/html/body/form/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[1]/input");
	    By password=By.xpath("/html/body/form/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[2]/input");
	    By loginsubmit=By.xpath("/html/body/form/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div[3]/input");
	    By advancesearch=By.xpath("//*[@id=\"navigation\"]/ul/li[1]/a");
	    By home=By.xpath("//*[@id=\"form1\"]/div[3]/header/div[2]/div/div[1]/a[1]");
		By moredetails=By.linkText("More Details");
		By wclick=By.xpath("//*[@id=\"myModal\"]/div/div/button/span");
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
		public void login() throws IOException
	    {
			driver.findElement(login).click();
			driver.findElement(Email).sendKeys("trivenivspd@gmail.com"); // passing the vaild mail
			driver.findElement(password).sendKeys("Triveni@17"); // passing the vaild password
			driver.findElement(loginsubmit).click();
	    }
	    public void jhome() 
	    {
	    	//driver.findElement(advancesearch).click();
	    	 driver.findElement(home).click();
	     	//Thread.sleep(3000);
	     	driver.findElement(moredetails).click();
	     	driver.findElement(wclick).click();
	    	
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
