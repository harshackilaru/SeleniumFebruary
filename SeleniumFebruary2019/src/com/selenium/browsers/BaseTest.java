package com.selenium.browsers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	
	public static WebDriver driver;
	public static String projectpath=System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties envprop;
	
	public static void init() throws Exception 
	{
		fis=new FileInputStream(projectpath+"//data.properties");
		p = new Properties();
		p.load(fis);
		
		fis = new FileInputStream(projectpath+"//environment.properties");
		envprop = new Properties();
		p.load(fis);
	}
	
	
	public static void launch(String browser) {
		
		if (p.getProperty(browser).equals("chrome")) {
			
			driver = new ChromeDriver();
		}
		else if (p.getProperty(browser).equals("firefox")) {
			
			driver = new FirefoxDriver();
		}
	}
	
	
	public static void navigateurl(String url) {
		
		driver.get(p.getProperty(url));
	}
	
}
