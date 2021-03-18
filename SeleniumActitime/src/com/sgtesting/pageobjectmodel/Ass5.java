package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass5
{
  
	public static WebDriver oBrowser=null;
    public static ActiTimePage oPage=null;
	public static void main(String[] args) 
	{
		  launchBrowser();
		  navigate();
		  login();
		  minimizeFlyOutWindow();
		  CreateCustomer();
		  CreateProject();
		  DeleteProject();
		  DeleteCustomer();
	      logout();
		  closebrowser(); 
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
  
  public static void CreateCustomer()
  {
	  try 
	  {
		  oPage.getClickOnTasks().click();
		  Thread.sleep(2000);
		  oPage.getClickOnAddnewButton().click();
		  Thread.sleep(2000);
		  oPage.getClickOnNewCustomerButton().click();
		  Thread.sleep(2000);
		  oPage.getClickonCustomerTextField().sendKeys("raveendra");
		  Thread.sleep(2000);
		  oPage.getClickonCustomerCommitbutton().click();
		  Thread.sleep(2000);
	   }
	  catch (Exception e) 
	  {
			e.printStackTrace();
	  }
  }
  
  public static void CreateProject()
  {
	  try
	  {
		  oPage.getClickOnAddnewButton().click();
		  Thread.sleep(2000);
		  oPage.getClickonNewProjectButton().click();
		  Thread.sleep(2000);
		  oPage.getClickOnProTextField().sendKeys("madhali");
		  Thread.sleep(2000);
		  oPage.getClickOnProCommitButton().click();
		  Thread.sleep(2000);
	  }
	  catch (Exception e) 
	  {
		e.printStackTrace();
	  }
  }
  
  public static void DeleteProject()
  {
	  try
	  {
		oPage.getClickonCusEditButton().click();
		 Thread.sleep(2000);
		oPage.getClickonProjectActionButton().click();
		 Thread.sleep(2000);
		oPage.getClickonProjectDeleteButton().click();
		 Thread.sleep(2000);
		oPage.getClickonCusDelPerBut().click();
		 Thread.sleep(2000);
	  }
	  catch (Exception e) 
	  {
		e.printStackTrace();
	  }
  }
  public static void DeleteCustomer()
  {
	  try 
	  {
		  oPage.getClickOnCustomereditButton().click();
		  Thread.sleep(2000);
		  oPage.getClickonCustomerActionButton().click();
		  Thread.sleep(2000);
		  oPage.getClickonDeleteCustomerbutton().click();
		  Thread.sleep(2000);
		  oPage.getClickonDeletepermanentlyButton().click();
		  Thread.sleep(2000);
	  }
	  catch (Exception e) 
	  {
		e.printStackTrace();
	  }
  }
 public  static void logout()
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
 public	static void closebrowser()
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
