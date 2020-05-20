package com.freecrmpro.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public Testbase() throws FileNotFoundException, IOException{
		prop = new Properties();
		prop.load(new FileInputStream("config.properties"));
	}
	
	public static void invokebrowser(){
		String browser = System.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}

}
