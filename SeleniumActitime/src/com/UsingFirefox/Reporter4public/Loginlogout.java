package com.UsingFirefox.Reporter4public;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Loginlogout
{   
	public static WebDriver oBrowser=null;
public static void main(String[] args) 
{
	Launchbrowser();
	navigate();
}
public static void Launchbrowser()
{
	try 
	{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path+"\\Libraries\\Drivers\\geckodriver.exe");
		oBrowser =new FirefoxDriver();
	}
	catch (Exception e) 
	{
		e.printStackTrace();
	}
}
public static void navigate()
{
	try
	{
		oBrowser.manage().window().maximize();
		Thread.sleep(2000);
		oBrowser.get("https://reporter4public.herokuapp.com");
		Thread.sleep(2000);
	}
	catch (Exception e) 
	{
		e.printStackTrace();
	}
}

}
