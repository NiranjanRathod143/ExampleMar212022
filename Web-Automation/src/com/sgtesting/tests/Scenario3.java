package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {
	public static WebDriver obrowser=null;
	public static void main(String[] args) {
		
		launchbrowser();
		navigate();
		login();
		minimizeFlyoutWindow();
		createcustomer();
		deletecustomer();
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
	private static void login()
	{
		try {
			obrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(3000);
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(3000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(3000);
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
	private static void createcustomer()
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr/td[3]/a/div[1]")).click();
			Thread.sleep(4000);
			obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(4000);
			obrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(4000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		private static void deletecustomer()
		{
			try {
				obrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("chetan");
				Thread.sleep(4000);
				obrowser.findElement(By.xpath("//*[@id=\'customerLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(4000);
				obrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
				Thread.sleep(3000);
				obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
				obrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[4]/div/div[3]/div")).click();
				Thread.sleep(3000);
				obrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
				Thread.sleep(3000);

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
		private static void closeapplication()
		{
			try {
				obrowser.quit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
