package com.qa.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\virtusa\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com");
		//driver.findElement(By.cssSelector("body.is-mobileMenuOpen:nth-child(2) div.rc-MetatagsWrapper div.rc-CourseraPlusHubApp._vryy5p span.rc-PageHeaderWrapper:nth-child(1) div.rc-MobileHeader.rc-MobileHeaderLite div._1l1hu98 div.c-mobile-header-controls.horizontal-box.isLohpRebrand.align-items-spacebetween:nth-child(2) nav:nth-child(1) span.nostyle div.logged-out-auth-buttons-wrap li.mobile-header-btn:nth-child(2) > a.logIn-btn.mobile-auth-btn")).click();
		//driver.findElement(By.linkText("Log in")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		 driver.findElement(By.id("userid")).sendKeys("HBQ708");
		 driver.findElement(By.id("password")).sendKeys("Rajesh2110");
		// driver.findElement(By.id("password")).sendKeys("Rajesh02!");
		 driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
		
		
		System.out.println(driver.getTitle());

	}

}
