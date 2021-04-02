package com.Actitime.testscripts;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class Actimeuser1 {
	public static Logger log=Logger.getLogger("actions");
	public static WebDriver c1=null;
	@Test(priority=1)
	public static void launchbrowser()
	{
		String path=null;
		try 
		{  
			log.info("launch browser executed");
			path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\libraries\\drivers\\chromedriver.exe");
			c1=new ChromeDriver();
		}
		catch(Exception e)
		{
			e.printStackTrace();	
		}
	}
	@Test(priority=2)
	public	static void navigate()
	{
		try 
		{
		log.info("navigate method");
		c1.get("http://localhost:81/login.do");
		c1.manage().window().maximize();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3)
	public static void login()
	{
		try
		{
			log.info("login");
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
	@Test(priority=4)
	public static void minimizewindow()
	{
		try 
		{
			log.info("minimize window");
			c1.findElement(By.xpath("//div[@id='gettingStartedShortcutsMenuCloseId']")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5)
	public	static void createuser()
	{
		try 
		{
			log.info("create user");
			c1.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			c1.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(2000);
			c1.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("ravi");
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
	@Test(priority=6)
	public static void deleteuser()
	{
		try
		{
			log.info("delete user");
			c1.findElement(By.xpath("//*[@id=\"userListTableHeader\"]/tr[2]/th[1]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/input")).sendKeys("ravi");
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
	@Test(priority=7)
	public static void logout ()
	{
		try 
		{
			log.info("logout");
			c1.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	public	static void closebrowser()
	{
		try 
		{
			log.info("closebrowser");
			c1.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();	
		}
	}
}
