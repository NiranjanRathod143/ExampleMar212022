package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceScenario1 {

	public static WebDriver obrowser=null;
	public static void main(String[] args) {

		launchbrowser();
		navigate();
		loginasadmin();
		minimizeFlyoutWindow();
		createuser();
		logout();
		loginasuser1();
		logout1();
		loginasuser2();
		logout2();
		loginasuser3();
		logout3();
		loginasadmin1();
		logout4();
		loginasuserA();
		logout5();
		loginasuserB();
		logout6();
		loginasuserC();
		logout7();
		loginasadminAA();
		deleteuser();
		logout8();
		closeapplication();
		
		 



	}
	private static void launchbrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\Niranjan\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			obrowser=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try {
			obrowser.get("http://localhost:82/login.do");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasadmin()
	{
		try {
			obrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void minimizeFlyoutWindow()
	{
		try 
		{
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(3000);
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void createuser()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).sendKeys("kishore");
			Thread.sleep(2000);
			obrowser.findElement(By.name("lastName")).sendKeys("naik");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("kn@gmail.com");
			Thread.sleep(2000);
			obrowser.findElement(By.name("username")).sendKeys("khimavat234");
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("love");
			Thread.sleep(2000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("love");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).sendKeys("shankar");
			Thread.sleep(2000);
			obrowser.findElement(By.name("lastName")).sendKeys("naik");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("sn@gmail.com");
			Thread.sleep(2000);
			obrowser.findElement(By.name("username")).sendKeys("shankar12");
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("achu");
			Thread.sleep(2000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("achu");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("firstName")).sendKeys("ravi");
			Thread.sleep(2000);
			obrowser.findElement(By.name("lastName")).sendKeys("naik");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("rn@gmail.com");
			Thread.sleep(2000);
			obrowser.findElement(By.name("username")).sendKeys("ravishankar");
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("786");
			Thread.sleep(2000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("786");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser1()
	{
		try {
			obrowser.findElement(By.name("username")).sendKeys("khimavat234");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("love");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout1()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser2()
	{
		try {
			obrowser.findElement(By.name("username")).sendKeys("shankar12");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("achu");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout2()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser3()
	{
		try {
			obrowser.findElement(By.name("username")).sendKeys("ravishankar");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("786");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout3()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasadminAA()
	{
		try {
			obrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("ishq");
			Thread.sleep(2000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("ishq");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("456");
			Thread.sleep(2000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("456");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.name("password")).sendKeys("puttu");
			Thread.sleep(2000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("puttu");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout4()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuserA()
	{
		try {
			obrowser.findElement(By.name("username")).sendKeys("khimavat234");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("love");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout5()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuserB()
	{
		try {
			obrowser.findElement(By.name("username")).sendKeys("shankar12");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("achu");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout6()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuserC()
	{
		try {
			obrowser.findElement(By.name("username")).sendKeys("ravishankar");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("786");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout7()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasadmin1()
	{
		try {
			obrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(2000);
			Alert o=obrowser.switchTo().alert();
			o.accept();
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(2000);
			Alert o1=obrowser.switchTo().alert();
			o.accept();
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(2000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(2000);
			Alert o2=obrowser.switchTo().alert();
			o.accept();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout8()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void closeapplication()
	{
		try {
			obrowser.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
	

	
	








