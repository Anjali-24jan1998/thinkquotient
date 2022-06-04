package com.seleniumwebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SANKET\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		dr.navigate().to("https://www.facebook.com/");
		
		dr.findElement(By.xpath("//a[text()='Create New Account']")).click();
		dr.findElement(By.name("firstname")).sendKeys("Anjali");
		
//		Actions act = new Actions(dr);
//		act.sendKeys(Keys.TAB);
		
		dr.findElement(By.name("lastname")).sendKeys("Raghuvanshi");
		dr.findElement(By.name("reg_email__")).sendKeys("anjaliraghuvanshi928@gmail.com");
		dr.findElement(By.name("reg_email_confirmation__")).sendKeys("anjaliraghuvanshi928@gmail.com");
		dr.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("ANjali@1234");
		dr.findElement(By.xpath("//select[@aria-label='Day']")).sendKeys("24");
	    dr.findElement(By.xpath("//select[@aria-label='Month']")).sendKeys("jan");
	    dr.findElement(By.xpath("//select[@aria-label='Year']")).sendKeys("1998");
		
		Select sel1 = new Select(dr.findElement(By.id("day")));
		sel1.selectByIndex(24);
		
		Select sel2 = new Select(dr.findElement(By.id("month")));
		sel2.selectByValue("3");
		
		Select sel3 = new Select(dr.findElement(By.id("year")));
		sel3.selectByVisibleText("1998");
		
		System.out.println(sel1.isMultiple());


	}

}
