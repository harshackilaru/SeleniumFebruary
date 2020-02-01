package com.selenium.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;*/

public class BrowserLaunch {

	public static void main(String[] args) {
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.ca");
		
		driver = new FirefoxDriver();
		driver.get("https://www.bestbuy.ca");
		
		
		
		/*
		 * ChromeDriver driver = new ChromeDriver();
		 * driver.get("https://www.amazon.ca");
		 * 
		 * FirefoxDriver driver1 = new FirefoxDriver();
		 * driver1.get("https://www.bestbuy.ca");
		 */
		
		//webdriver.ie.driver for IE
		//webdriver.edge.driver for edge
	}

}
