package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {
	
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createuser();
		logout();
		closeapplication();
		
		
		

	}
	private static void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver","D:\\Niranjan\\Web-Automation\\Library\\drivers\\chromedriver.exe" );
			obrowser=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void navigate()
	{
		try {
			obrowser.get("http://localhost:82/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void login()
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
	public static void minimizeFlyoutWindow()
	{
		try {
			obrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
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
			obrowser.findElement(By.name("firstName")).sendKeys("user");
			Thread.sleep(2000);
			obrowser.findElement(By.name("lastName")).sendKeys("rathod");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("n@gmail.com");
			Thread.sleep(2000);
			obrowser.findElement(By.name("username")).sendKeys("user1");
			Thread.sleep(2000);
			obrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123");
			Thread.sleep(2000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("123");
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
