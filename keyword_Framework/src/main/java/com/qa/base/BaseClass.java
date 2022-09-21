package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
	public WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver(String browserName) {
		System.setProperty("webdriver.chrome.driver",
				"C:/Users/ARNAVI/Desktop/Selenium google crome/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public Properties initializeProperties() {
		prop = new Properties();
		try {
			FileInputStream inputStream = new FileInputStream(
					"C:\\Users\\ARNAVI\\eclipse-workspace\\keyword_Framework\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(inputStream);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
		
	}
}