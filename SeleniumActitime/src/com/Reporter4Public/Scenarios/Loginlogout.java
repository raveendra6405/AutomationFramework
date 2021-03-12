package com.Reporter4Public.Scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginlogout
{ 
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchBrowser(); 
		navigate();
		Login();
	//	Logout();
	}
	public static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Libraries\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void navigate()
	{
		try
		{   oBrowser.manage().window().maximize();
		Thread.sleep(2000);
		oBrowser.get("https://reporter4public.herokuapp.com");
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void Login()
	{ 
		try {
			oBrowser.findElement(By.xpath("//a[text()='Login']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[@id='user_email']")).sendKeys("user12@r4p.com");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[@id='user_password']")).sendKeys("R4pUser@123");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[@value='sign in']")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void Logout()
	{
		
		try 
		{
			oBrowser.findElement(By.xpath("//div[@class='hdr-initial pull-left']/..//span[text()='RM']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[text()='Logout']")).click();
			Thread.sleep(2000);
		}
		
		catch (InterruptedException e)
		{
			
			e.printStackTrace();
		}
		
	}
}
