package com.Actitime.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actiassproject 
{
	public static WebDriver c1=null;
	public static void main(String[] args) 
	{
	  launchbrowser();
	  navigate();
	  login();
	  minimizewindow();
	  createproject();
	  logout();
	 closebrowser();
	}
	static void launchbrowser()
	{
		String path=null;
		try 
		{   path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Libraries\\drivers\\chromedriver.exe");
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
	static void createproject()
	{
		try 
		{
			c1.findElement(By.xpath("//a[@href='/tasks/tasklist.do']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[@class='downIcon']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[@class='item createNewProject ellipsis']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("projectPopup_projectNameField")).sendKeys("testing");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//button[text()='-- Please Select Customer to Add Project for  --']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//*[@id=\'ext-gen187\']")).click();
		}
		catch (Exception e) 
		{
			e.printStackTrace(); 
		}
	}
	static void logout()
	{
		try 
		{
			c1.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	static void closebrowser()
	{
		try 
		{
			c1.close();
		}
		catch (Exception e) 
		{
		   e.printStackTrace();	
		}
	}
}
