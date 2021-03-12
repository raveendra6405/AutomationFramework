package com.Actitime.project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actiass3customer 
{
	public static WebDriver c1=null;
	public static void main(String[] args) 
	{
	  launchbrowser();
	  navigate();
	  login();
	  minimizewindow();
	  createcoustomer();
	  deletecustomer();
	  logoutandquit();
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
	static void createcoustomer()
	{
		try 
		{
			c1.findElement(By.xpath("//a[@href='/tasks/tasklist.do']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[@class='downIcon']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[@class='item createNewCustomer ellipsis']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("customerLightBox_nameField")).sendKeys("raveendra");
			Thread.sleep(2000);
			c1.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void deletecustomer()
	{
		try 
		{
			c1.findElement(By.xpath("//div[@class='editButton available']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[@class='actionButton']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
		   e.printStackTrace();
		}
	}
	static void logoutandquit()
	{
		try 
		{  
			c1.findElement(By.xpath("//a[@href='/logout.do']")).click();
			c1.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
