package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecAss2 
{
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		CreateUser123Logout();
		Login123Logout();
		AdminLoginModifyPasswordforUser123();
		LoginUser123WithNewPasscode();
		AdminLoginDeleteUser123();
		CloseBrowser();
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
	
	public static void CreateUser123Logout()
	{
		try 
		{
			//user1
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.getuseradd().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("ravi");
			oPage.getLastName().sendKeys("prasad");
			oPage.getEmail().sendKeys("123@gmail.com");
			oPage.getAddUserName().sendKeys("user1");
			Thread.sleep(2000);
			oPage.getPasswordUser().sendKeys("rauser1");
			oPage.getconfirmPasswordUser().sendKeys("rauser1");
			Thread.sleep(2000);
			oPage.getcreateuserbutton().click(); 
			Thread.sleep(2000);
			
			//user2
			oPage.getuseradd().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("pritam");
			oPage.getLastName().sendKeys("chang");
			oPage.getEmail().sendKeys("2@gmail.com");
			oPage.getAddUserName().sendKeys("user2");
			Thread.sleep(2000);
			oPage.getPasswordUser().sendKeys("rock");
			oPage.getconfirmPasswordUser().sendKeys("rock");
			Thread.sleep(2000);
			oPage.getcreateuserbutton().click(); 
			Thread.sleep(2000);
			
			//user3 creation
			oPage.getuseradd().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("user3");
			oPage.getLastName().sendKeys("passcode3");
			oPage.getEmail().sendKeys("user3@gmail.com");
			oPage.getAddUserName().sendKeys("user3");
			Thread.sleep(2000);
			oPage.getPasswordUser().sendKeys("pavanduke");
			oPage.getconfirmPasswordUser().sendKeys("pavanduke");
			Thread.sleep(2000);
			oPage.getcreateuserbutton().click(); 
			Thread.sleep(2000);
			
			//logout
			oPage.getLogout().click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public static void Login123Logout()
	{
		try 
		{   //loginuser1logout
			oPage.getUserName().sendKeys("user1");
			oPage.getPassword().sendKeys("rauser1");
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getSEActitimeButton().click();
			Thread.sleep(2000);
			oPage.getLogout().click();
			Thread.sleep(2000);
			
			//loginuser2logout
			oPage.getUserName().sendKeys("user2");
			oPage.getPassword().sendKeys("rock");
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getSEActitimeButton().click();
			Thread.sleep(2000);
			oPage.getLogout().click();
			Thread.sleep(2000);
			
			//loginuser3logout
			oPage.getUserName().sendKeys("user3");
			oPage.getPassword().sendKeys("pavanduke");
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getSEActitimeButton().click();
			Thread.sleep(2000);
			oPage.getLogout().click();
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void AdminLoginModifyPasswordforUser123()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(2000);
			
			//modifypassworduser1
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.getClickOnTextBox().sendKeys("ravi");
			Thread.sleep(2000);
			oPage.getClickOnUser().click();
			Thread.sleep(2000);
			oPage.getPasswordUser().sendKeys("user1");
			oPage.getconfirmPasswordUser().sendKeys("user1");
			oPage.getcreateuserbutton().click(); 
			Thread.sleep(2000);
			oPage.getUserCloseButton().click();
			Thread.sleep(2000);
			
			//modifypasswordforuser2
			oPage.getClickOnTextBox().sendKeys("pritam");
			Thread.sleep(2000);
			oPage.getClickOnUser().click();
			Thread.sleep(2000);
			oPage.getPasswordUser().sendKeys("user2");
			oPage.getconfirmPasswordUser().sendKeys("user2");
			Thread.sleep(2000);
			oPage.getcreateuserbutton().click(); 
			Thread.sleep(2000);
			oPage.getUserCloseButton().click();
			Thread.sleep(2000);			
			
			//modifypasswordforuser3
			/*oPage.getuser().click();
			Thread.sleep(2000);*/
			oPage.getClickOnTextBox().sendKeys("user3");
			Thread.sleep(2000);
			oPage.getClickOnUser().click();
			Thread.sleep(2000);
			oPage.getPasswordUser().sendKeys("user3");
			oPage.getconfirmPasswordUser().sendKeys("user3");
			Thread.sleep(2000);
			oPage.getcreateuserbutton().click(); 
			Thread.sleep(2000);
			oPage.getUserCloseButton().click();
			Thread.sleep(2000);
			
			oPage.getLogout().click();
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void LoginUser123WithNewPasscode()
	{
		try
		{
			//user1
			
			oPage.getUserName().sendKeys("user1");
			oPage.getPassword().sendKeys("user1");
			oPage.getLogin().click();
			Thread.sleep(2000);
		/*	oPage.getSEActitimeButton().click();
			Thread.sleep(2000); */
			oPage.getLogout().click();
			Thread.sleep(2000);
			
			//user2
			oPage.getUserName().sendKeys("user2");
			oPage.getPassword().sendKeys("user2");
			oPage.getLogin().click();
			Thread.sleep(2000);
			/*oPage.getSEActitimeButton().click();
			Thread.sleep(2000); */
			oPage.getLogout().click();
			Thread.sleep(2000);
			
			//user3
			oPage.getUserName().sendKeys("user3");
			oPage.getPassword().sendKeys("user3");
			oPage.getLogin().click();
			Thread.sleep(2000);
		/*	oPage.getSEActitimeButton().click();
			Thread.sleep(2000); */
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public static void AdminLoginDeleteUser123()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(2000);
			
			//deleteuser1
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.getClickOnTextBox().sendKeys("ravi");
			Thread.sleep(2000);
			oPage.getClickOnUser().click();
			Thread.sleep(2000);
			oPage.getClickOnDeleteButton().click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			oPage.getUserCloseButton().click();
			Thread.sleep(2000);
		
			//deleteuser2
			/*oPage.getuser().click();
			Thread.sleep(2000);*/
			oPage.getClickOnTextBox().sendKeys("pritam");
			Thread.sleep(2000);
			oPage.getClickOnUser().click();
			Thread.sleep(2000);
			oPage.getClickOnDeleteButton().click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			oPage.getUserCloseButton().click();
			Thread.sleep(2000);
			
			//deleteuser3
			/*oPage.getuser().click();
			Thread.sleep(2000);*/
			oPage.getClickOnTextBox().sendKeys("user3");
			Thread.sleep(2000);
			oPage.getClickOnUser().click();
			Thread.sleep(2000);
			oPage.getClickOnDeleteButton().click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			oPage.getUserCloseButton().click();
			Thread.sleep(2000);
			oPage.getLogout().click();
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void CloseBrowser()
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
