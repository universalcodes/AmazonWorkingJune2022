package com.base.AmazonBaseConfigFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupConfigFileCode_BaseFile {
	
	/*
	 * @FindBy(xpath = "//*[@type='email']") public static WebElement
	 * amazon_useremail_textbox;
	 */
	
	public static WebDriver amazondriver;
	public static Properties load_configfile1  = new Properties();
	static String config_file_path = "C:\\Users\\yoges\\eclipse-workspace\\DummyAutomation\\src\\com\\config\\configFile\\AmazonConfig.properties";
	
	public static void amazonbroswersetup() throws IOException
	{
	FileInputStream load_configfile = new FileInputStream(config_file_path);
	load_configfile1.load(load_configfile);

	String amazonbrowserName = load_configfile1.getProperty("Browser");
	if (amazonbrowserName.contains("Chrome")) 
	{
		WebDriverManager.chromedriver().setup();
		amazondriver= new ChromeDriver();
		
	}
	
	else if (amazonbrowserName.contains("Edge")) 
	{
		
		WebDriverManager.edgedriver().setup();
		amazondriver = new EdgeDriver();
	}
	else 
	{
		System.out.println("No Browser Found");
	}
	}
	
	
	
	public static void closeamazonDriver()
	{
		amazondriver.quit();
	}
	
	

	
			
	
	}
	
	
