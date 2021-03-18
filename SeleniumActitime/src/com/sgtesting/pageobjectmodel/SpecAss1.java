package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpecAss1
{
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createuser1andlogoutUser1();
		LoginUser1CreateModifyforUser2Logout();
		LoginUser2CreateUser3Logout();
		LoginAdminModifyUser1LogoutLoginasUser1();
		User2LoginDeleteUser3();
		User1LoginDeleteUser2();
		AdminLoginDeleteUser1LogOut();
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
	public static void createuser1andlogoutUser1()
	{

		try 
		{
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
			oPage.getLogout().click();
			Thread.sleep(2000);

		} catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}

	public static void LoginUser1CreateModifyforUser2Logout()
	{
		try 
		{
			oPage.getUserName().sendKeys("user1");
			oPage.getPassword().sendKeys("rauser1");
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getSEActitimeButton().click();
			Thread.sleep(2000);
		
			oPage.getuser().click();
			Thread.sleep(2000);
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

			//modify user2
			oPage.getClickOnTextBox().sendKeys("pritam");
			Thread.sleep(2000);
			oPage.getClickOnUser().click();
			Thread.sleep(2000);
			oPage.getPasswordUser().sendKeys("change");
			oPage.getconfirmPasswordUser().sendKeys("change");
			Thread.sleep(2000);
			oPage.getcreateuserbutton().click(); 
			Thread.sleep(2000);
			oPage.getClickOnTextBox().clear();
			Thread.sleep(2000);
			oPage.getLogout().click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static void LoginUser2CreateUser3Logout()
	{
		try 
		{
			oPage.getUserName().sendKeys("user1");
			oPage.getPassword().sendKeys("rauser1");
			oPage.getLogin().click();
			Thread.sleep(2000);
			/*	oPage.getSEActitimeButton().click();
			Thread.sleep(2000);*/

			//user3 creation
			oPage.getuser().click();
			Thread.sleep(2000);
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

	public  static void LoginAdminModifyUser1LogoutLoginasUser1()
	{
		try 
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(2000);
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
			oPage.getLogout().click();
			Thread.sleep(2000);
			oPage.getUserName().sendKeys("user1");
			oPage.getPassword().sendKeys("user1");
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getLogout().click();
			Thread.sleep(2000);
			/*	oPage.getSEActitimeButton().click();
			Thread.sleep(2000);*/
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public static void  User2LoginDeleteUser3()
	{
		try
		{
			oPage.getUserName().sendKeys("user2");
			oPage.getPassword().sendKeys("change");
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getSEActitimeButton().click();
			Thread.sleep(2000);
			
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.getClickOnTextBox().sendKeys("user3");
			Thread.sleep(2000);
			oPage.getClickOnUser().click();
			Thread.sleep(2000);
			oPage.getClickOnDeleteButton().click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			oPage.getLogout().click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public static void User1LoginDeleteUser2()
	{
		try
		{
			oPage.getUserName().sendKeys("user1");
			oPage.getPassword().sendKeys("user1");
			oPage.getLogin().click();
			Thread.sleep(2000);
			oPage.getuser().click();
			Thread.sleep(2000);
			oPage.getClickOnTextBox().sendKeys("pritam");
			Thread.sleep(2000);
			oPage.getClickOnUser().click();
			Thread.sleep(2000);
			oPage.getClickOnDeleteButton().click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
			oPage.getLogout().click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public static void AdminLoginDeleteUser1LogOut()
	{
		try 
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(2000);
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

