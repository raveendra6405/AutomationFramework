package com.Actitime.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimeass2 
{
	public static WebDriver c1=null;
	public static void main(String[] args) 
	{
	  launchbrowser();
	  navigate();
	  login();
	  minimizewindow();
	  createuser();
	  modifyuser();
     deleteuser();
     logout();
	 closebrowser();
	}
	static void launchbrowser()
	{
		String path=null;
		try 
		{  path=System.getProperty("user.dir");
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
			c1.findElement(By.name("pwd")).sendKeys("manager");
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
	static void createuser()
	{
		try 
		{
			c1.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			c1.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("maddali");
			c1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("prasad");
			c1.findElement(By.id("userDataLightBox_emailField")).sendKeys("123@gmail.com");
			c1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("rocky");
			c1.findElement(By.id("userDataLightBox_passwordField")).sendKeys("rock");
			c1.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("rock");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]")).click(); 
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
		    e.printStackTrace();
		}
	}
	static void modifyuser()
	{
		try 
		{   c1.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
	     	Thread.sleep(2000);
			c1.findElement(By.xpath("//*[@id=\"userListTableHeader\"]/tr[2]/th[1]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/input")).sendKeys("maddali");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr/td[1]")).click();
			//Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_firstNameField")).clear();
			Thread.sleep(1000);
			c1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("sg");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			
		}
	}
	static void deleteuser()
	{
		try
		{   c1.findElement(By.xpath("//*[@id=\"userListTableHeader\"]/tr[2]/th[1]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/input")).clear();
		    Thread.sleep(2000);
			c1.findElement(By.xpath("//*[@id=\"userListTableHeader\"]/tr[2]/th[1]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/input")).sendKeys("sg");
			Thread.sleep(3000);
			c1.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/table")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_deleteBtn")).click();
			c1.switchTo().alert().accept();
			Thread.sleep(2000);
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
