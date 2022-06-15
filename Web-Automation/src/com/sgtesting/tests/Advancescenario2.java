package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.browser.Browser;

public class Advancescenario2 {
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		
		launchbrowser();
		navigate();
		loginasadmin();
		minimizeFlyoutWindow();
		createuser1();
		logout1();
		loginasuser1();
		createuser2();
		logout2();
		loginasuser2();
		createuser3();
		logout3();
		loginasuser3();
		logout4();
		loginasuser22();
		Modifiedpasswordcreateuser3();
		logout5();
		loginasuser33();
		logout6();
		loginasuser11();
		Modifiedpasswordcreateuser2();
		logout7();
		loginasuser222();
		logout8();
		loginasadmin1();
		modifiedpasswordcreateuser1();
		logout9();
		loginasuser111();
		logout10();
		loginasuser2222();
		deletecreateuser3();
		logout11();
		loginasuser1111();
		deletectreateuser2();
		logout12();
		loginasadmin11();
		deletecreateuser1();
		logout();
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
	private static void createuser1()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("sharuk");
			Thread.sleep(1000);
			obrowser.findElement(By.name("lastName")).sendKeys("khan");
			Thread.sleep(1000);
			obrowser.findElement(By.name("email")).sendKeys("sk@gmai.com");
			Thread.sleep(1000);
			obrowser.findElement(By.name("username")).sendKeys("sharukkhan123");
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("ddlj");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("ddlj");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	private static void logout1()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser1()
	{
		try {
			obrowser.findElement(By.name("username")).sendKeys("sharukkhan123");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("ddlj");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createuser2()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("salman");
			Thread.sleep(1000);
			obrowser.findElement(By.name("lastName")).sendKeys("khan");
			Thread.sleep(1000);
			obrowser.findElement(By.name("email")).sendKeys("ski1@gmail.com");
			Thread.sleep(1000);
			obrowser.findElement(By.name("username")).sendKeys("salmankhan786");
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("sajan");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("sajan");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout2()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser2()
	{
		try {
			obrowser.findElement(By.name("username")).sendKeys("salmankhan786");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("sajan");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void createuser3()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("amir");
			Thread.sleep(1000);
			obrowser.findElement(By.name("lastName")).sendKeys("khan");
			Thread.sleep(1000);
			obrowser.findElement(By.name("email")).sendKeys("ak12@gmail.com");
			Thread.sleep(1000);
			obrowser.findElement(By.name("username")).sendKeys("amirkhan200");
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("dil");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("dil");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout3()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser3()
	{
		try {
			obrowser.findElement(By.name("username")).sendKeys("amirkhan200");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("dil");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout4()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser22()
	{
		try {
			obrowser.findElement(By.name("username")).sendKeys("salmankhan786");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("sajan");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void Modifiedpasswordcreateuser3()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("bulbul");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("bulbul");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout5()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser33()
	{
		try {
			obrowser.findElement(By.name("username")).sendKeys("amirkhan200");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("bulbul");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void logout6()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser11()
	{
		try {
			obrowser.findElement(By.name("username")).sendKeys("sharukkhan123");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("ddlj");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Modifiedpasswordcreateuser2()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("madhuri");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("madhuri");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		
		}
	}
	private static void logout7()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser222()
	{
		try {
			obrowser.findElement(By.name("username")).sendKeys("salmankhan786");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("madhuri");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout8()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
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
	private static void modifiedpasswordcreateuser1()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("kkkg");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("kkkg");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout9()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser111()
	{
		try {
			obrowser.findElement(By.name("username")).sendKeys("sharukkhan123");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("kkkg");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout10()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser2222()
	{
		try {
			obrowser.findElement(By.name("username")).sendKeys("salmankhan786");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("madhuri");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deletecreateuser3()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1000);
			Alert o=obrowser.switchTo().alert();
			o.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout11()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasuser1111()
	{
		try {
			obrowser.findElement(By.name("username")).sendKeys("sharukkhan123");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("kkkg");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void deletectreateuser2()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1000);
			Alert o=obrowser.switchTo().alert();
			o.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout12()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void loginasadmin11()
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
	private static void deletecreateuser1()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userListTableContainer\']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1000);
			Alert o=obrowser.switchTo().alert();
			o.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
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
	
	

	



		

	