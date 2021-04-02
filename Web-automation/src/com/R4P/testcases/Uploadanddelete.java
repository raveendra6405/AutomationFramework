package com.R4P.testcases;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Uploadanddelete
{
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		launchbrowser();
		navigate();
		  login();	
		  upload();
		 logout();
	}
	public static void launchbrowser()
	{	 
		try 
		{  
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Libraries\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
		}
		catch(Exception e)
		{
		  e.printStackTrace();	
		}	
	}
	public static void navigate()
	{
		try 
		{	
			oBrowser.get("https://reporter4public.herokuapp.com/");
			oBrowser.manage().window().maximize();
		    Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//a[@href='/users/sign_in']")).click();
			 Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//input[@id='user_email']")).sendKeys("user2@r4p.com");
			oBrowser.findElement(By.id("user_password")).sendKeys("password@R4p");
			oBrowser.findElement(By.xpath("//input[@type='submit']")).click();
			 Thread.sleep(2000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
	public static void upload()
	{
		try 
		{
			oBrowser.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
			oBrowser.findElement(By.xpath("//a[@href='/articles']")).click();
			String parentBrowser=oBrowser.getWindowHandle();
			System.out.println("Parent Browser :"+parentBrowser);
		        Set<String> childBrowsers=oBrowser.getWindowHandles();
			Object[] popups=childBrowsers.toArray();			
			for(int i=1;i<popups.length;i++)
			{
				String childbrowser=popups[i].toString();
				System.out.println("Child Browser :"+childbrowser);
				oBrowser.switchTo().window(childbrowser);
			}
	/*		String childBrowser=oBrowser.getWindowHandle();
			System.out.println("Child Browser :"+childBrowser);
			oBrowser.switchTo().window(childBrowser);*/
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[@href='/articles/new']")).click();
			WebElement singleselect=oBrowser.findElement(By.id("article_category_id"));
			Thread.sleep(2000);
			Select DD=new Select(singleselect);
			
			DD.selectByVisibleText("Small Stories");
			
			oBrowser.findElement(By.xpath("//input[@id='article_title']")).sendKeys("Akbar and Birbal stories");
			Thread.sleep(2000);
			WebElement multiselect=oBrowser.findElement(By.id("article_source"));
			Select DD1=new Select(multiselect);
			DD1.selectByValue("Unknown");
			oBrowser.findElement(By.xpath("//input[@id='article_image']")).sendKeys("C:\\Users\\Raveendra\\Pictures\\Screenshots\\Screenshot (1).png");
			Thread.sleep(2000);
			oBrowser.switchTo().frame(0);
			oBrowser.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("stories");
			oBrowser.switchTo().defaultContent();
		
			oBrowser.findElement(By.xpath("//input[@value='Create Article']")).click();
			// copy xpath
		/*	oBrowser.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[6]/a[3]/button")).click();
			Thread.sleep(2000);*/
			oBrowser.findElement(By.xpath("//td[text()='Akbar and Birbal stories']/..//button[@title='Delete']")).click();
			oBrowser.switchTo().alert().accept();
			oBrowser.switchTo().window(parentBrowser);
			
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void logout()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//button[@type='button']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//a[@href='/users/sign_out']")).click();
			Thread.sleep(2000);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}	
}
