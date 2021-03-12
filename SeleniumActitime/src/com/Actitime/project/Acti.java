package com.Actitime.project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti 
{

	public static void main(String[] args) throws InterruptedException 
	{  
		System.setProperty("webdriver.chrome.driver", "D:\\Testautomation\\selenium sg\\drivers\\chromedriver.exe");
		WebDriver c1=new ChromeDriver();
		c1.get("http://localhost:81/login.do");
		c1.manage().window().maximize();
		c1.findElement(By.id("username")).sendKeys("admin");
		c1.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		c1.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		// user creation
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
		c1.findElement(By.xpath("//*[@id=\"userListTableHeader\"]/tr[2]/th[1]/table/tbody/tr/td[1]/table/tbody/tr/td[1]/input")).sendKeys("ravi");
		Thread.sleep(3000);
		c1.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/table")).click();
		Thread.sleep(2000);
		c1.findElement(By.id("userDataLightBox_deleteBtn")).click();
		c1.switchTo().alert().accept();
		Thread.sleep(2000);
		c1.quit();
	}
}
