package com.R4P.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginlogout {
public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchbrowser();
		navigate();
		  login();	
		  logout();
	}
	public static void launchbrowser()
	{	 
		try 
		{  
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Libraries\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}
		catch(Exception e)
		{
		  e.printStackTrace();	
		}	
	}
	public static void navigate()
	{
		try 
		{
		
			
			oBrowser.get("https://reporter4public.herokuapp.com/");
			oBrowser.manage().window().maximize();
		    Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login()
	{
		try 
		{ 
			oBrowser.findElement(By.xpath("//a[@href='/users/sign_in']")).click();
			 Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[@id='user_email']")).sendKeys("user2@r4p.com");
			 Thread.sleep(2000);
			oBrowser.findElement(By.id("user_password")).sendKeys("password@R4p");
			 Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[@type='submit']")).click();
			 Thread.sleep(2000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void logout()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//button[@type='button']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[@href='/users/sign_out']")).click();
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
