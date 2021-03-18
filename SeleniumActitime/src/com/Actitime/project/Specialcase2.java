package com.Actitime.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Specialcase2 
{
	public static WebDriver c1=null;
	public static void main(String[] args) 
	{
		launchbrowser();
		navigate();
		login();
		minimizewindow();
	    createuser123();
		loginuser123admin();
		login123();
		adminlogindel123();
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
	static void createuser123()
	{
		try
		{
			c1.findElement(By.xpath("//a[@href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("ravi");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("prasad");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_emailField")).sendKeys("123@gmail.com");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("raveendra");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_passwordField")).sendKeys("rauser1");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("rauser1");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[@class='addUserButton beigeButton useNativeActive']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//input[@id='userDataLightBox_firstNameField']")).sendKeys("rocky");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("kgf");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_emailField")).sendKeys("12@gmail");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("pritam");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_passwordField")).sendKeys("pritam1");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("pritam1");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("user3");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("passcode3");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_emailField")).sendKeys("user3@gmail");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_usernameField")).sendKeys("pavan");
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_passwordField")).sendKeys("pavanduke");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("pavanduke");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//div[@id='userDataLightBox_commitBtn']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/logout.do']")).click();
			Thread.sleep(2000);
			}
		catch (Exception e) 
		{
				e.printStackTrace();
		}
	}
	static void loginuser123admin()
	{
		try 
		{
			c1.findElement(By.id("username")).sendKeys("raveendra");
			Thread.sleep(2000);
			c1.findElement(By.name("pwd")).sendKeys("rauser1");
			Thread.sleep(2000);
			c1.findElement(By.id("loginButtonContainer")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/logout.do']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("username")).sendKeys("pritam");
			Thread.sleep(2000);
			c1.findElement(By.name("pwd")).sendKeys("pritam1");
			Thread.sleep(2000);
			c1.findElement(By.id("loginButtonContainer")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/logout.do']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("username")).sendKeys("pavan");
			Thread.sleep(2000);
			c1.findElement(By.name("pwd")).sendKeys("pavanduke");
			Thread.sleep(2000);
			c1.findElement(By.id("loginButtonContainer")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/logout.do']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			c1.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			c1.findElement(By.id("loginButtonContainer")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[text()='prasad, ravi']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_passwordField")).sendKeys("user1");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//input[@placeholder='Retype Password']")).sendKeys("user1");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[contains(text(),' Changes')]")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[@class='userNameSpan'][text()='kgf, rocky']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_passwordField")).sendKeys("user2");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//input[@placeholder='Retype Password']")).sendKeys("user2");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[contains(text(),' Changes')]")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[text()='passcode3, user3']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_passwordField")).sendKeys("user3");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//input[@placeholder='Retype Password']")).sendKeys("user3");
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[contains(text(),' Changes')]")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/logout.do']")).click();
			Thread.sleep(2000);
		} 
		catch (Exception e) 
	    {
			e.printStackTrace();
		}
	}
	static void login123()
	{
		try 
		{
			c1.findElement(By.id("username")).sendKeys("raveendra");
			Thread.sleep(2000);
			c1.findElement(By.name("pwd")).sendKeys("user1");
			Thread.sleep(2000);
			/*c1.findElement(By.xpath("//div[@class='startExploringLink']")).click();
			Thread.sleep(2000);*/
			c1.findElement(By.id("loginButtonContainer")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/logout.do']")).click();
			Thread.sleep(2000);
			
			c1.findElement(By.id("username")).sendKeys("pritham");
			Thread.sleep(2000);
			c1.findElement(By.name("pwd")).sendKeys("user2");
			Thread.sleep(2000);
			c1.findElement(By.id("loginButtonContainer")).click();
			Thread.sleep(2000);
			/*c1.findElement(By.xpath("//div[@class='startExploringLink']")).click();
			Thread.sleep(2000);*/
			c1.findElement(By.xpath("//a[@href='/logout.do']")).click();
			Thread.sleep(2000);
			
			c1.findElement(By.id("username")).sendKeys("pavan");
			Thread.sleep(2000);
			c1.findElement(By.name("pwd")).sendKeys("user3");
			Thread.sleep(2000);
			c1.findElement(By.id("loginButtonContainer")).click();
			Thread.sleep(2000);
			/*c1.findElement(By.xpath("//div[@class='startExploringLink']")).click();
			Thread.sleep(2000);*/
			c1.findElement(By.xpath("//a[@href='/logout.do']")).click();
			Thread.sleep(2000);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	static void adminlogindel123()
	{
		try 
		{
			c1.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			c1.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			c1.findElement(By.id("loginButtonContainer")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/administration/userlist.do']")).click();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[text()='prasad, ravi']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			c1.switchTo().alert().accept();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[@class='userNameSpan'][text()='kgf, rocky']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			c1.switchTo().alert().accept();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//span[text()='passcode3, user3']")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			c1.switchTo().alert().accept();
			Thread.sleep(2000);
			c1.findElement(By.xpath("//a[@href='/logout.do']")).click();
			Thread.sleep(2000);
			c1.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}	