package com.Actitime.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actiass8 
{
	public static WebDriver c1=null;
	public static void main(String[] args) 
	{
		launchbrowser();
		navigate();
		login();
		minimizewindow();
		
	}
	static void launchbrowser()
	{
		String path=null;
		try 
		{  path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\drivers\\chromedriver.exe");
			c1=new ChromeDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	static void navigate()
	{
		try 
		{
			c1.get("http://localhost:81/login.do");
			c1.manage().window().maximize();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			c1.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			c1.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			c1.findElement(By.id("loginButtonContainer")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void minimizewindow()
	{
		try 
		{
			c1.findElement(By.id("gettingStartedShortcutsMenuCloseId")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void importtasks()
	{
		try 
		{
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
