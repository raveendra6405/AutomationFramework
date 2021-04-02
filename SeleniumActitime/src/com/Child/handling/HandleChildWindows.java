package com.Child.handling;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleChildWindows {
	public static void main(String[] args) {
		ChromeDriver ch = null;
		try {
			System.setProperty("webdriver.chrome.driver", ".Libraries\\drivers\\chromedriver.exe");
			ch = new ChromeDriver();
			
			ch.manage().window().maximize();
			
			ch.get("file:///C:/temp/HTML/SampleWebPage.html");
			Thread.sleep(2000);
			
			//Read the parent window id
			String sParent = ch.getWindowHandle();
			System.out.println(sParent);
			
			//Click on the first link (Sg Testing)
			ch.findElement(By.id("link1")).click();
			Thread.sleep(2000);
			
			
			Set<String> oChild = ch.getWindowHandles();
			System.out.println("No. of Child windows: " + oChild.size());
			
			for(String child: oChild)
			{
				if(!child.equals(sParent)) {
					System.out.println("Chld w2indow ID: " + child);
					
					ch.switchTo().window(child);
					
					System.out.println(ch.getCurrentUrl());
					
					System.out.println(ch.getTitle());
					
					ch.close();
				}
			}
			
			ch.switchTo().window(sParent);
			Thread.sleep(5000);
			ch.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally{
			ch = null;
		}
	}
}
