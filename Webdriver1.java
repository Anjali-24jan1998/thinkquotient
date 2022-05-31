package com.seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SANKET\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver dr =new ChromeDriver();
	  dr.get("https://www.flipkart.com");
	}

}
