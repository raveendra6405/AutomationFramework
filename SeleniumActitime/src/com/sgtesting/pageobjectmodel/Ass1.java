package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass1
{
    public static WebDriver oBrowser=null;
    public static ActiTimePage oPage=null;
	public static void main(String[] args) 
	{
		  launchBrowser();
		  navigate();
		  login();
		  minimizeFlyOutWindow();
		  createuser();
		  deleteuser();
	/*	  logout();
		  closebrowser();*/
	}
	public static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Libraries\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			
			oBrowser.manage().window().maximize();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
  public static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	} 
   public static void createuser()
  {
	
	try 
	{
		oPage.getuser().click();
		Thread.sleep(2000);
		oPage.getuseradd().click();
		Thread.sleep(2000);
		oPage.getFirstName().sendKeys("user");
		oPage.getLastName().sendKeys("1");
		oPage.getEmail().sendKeys("123@gmail.com");
		oPage.getAddUserName().sendKeys("rocky");
		Thread.sleep(2000);
		oPage.getPasswordUser().sendKeys("rock");
		oPage.getconfirmPasswordUser().sendKeys("rock");
		Thread.sleep(2000);
		oPage.getcreateuserbutton().click(); 
		Thread.sleep(2000);
	} catch (InterruptedException e) 
	{
			e.printStackTrace();
	}
  }
   static void deleteuser()
	{
		try
		{
			oPage.getClickOnTextBox().sendKeys("user");
			Thread.sleep(2000);
			oPage.getClickOnUser().click();
			Thread.sleep(2000);
			oPage.getClickOnDeleteButton().click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			oPage.getUserCloseButton().click();
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
			oPage.getLogout().click();
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
			oBrowser.close();
		}
		catch (Exception e) 
		{
		   e.printStackTrace();	
		}
	}

}
