package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\virtusa\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.com");
//			driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1")).click();
//			driver.findElement(By.id("ap_email")).sendKeys("9944589398");
//			driver.findElement(By.id("ap_email")).sendKeys(Keys.ENTER);
//			driver.findElement(By.id("ap_password")).sendKeys("Deepika@7");
//			driver.findElement(By.id("ap_password")).sendKeys(Keys.ENTER);
		    driver.manage().window().maximize();
			WebElement c = driver.findElement(By.className("<nav-icon nav-arrow>"));
			c.click();
			WebElement country = driver.findElement(By.className("<icp-mkt-change-lnk>"));
			country.click();
			WebElement change = driver.findElement(By.className("<icp-dropdown_7>"));
			change.click();
			System.out.println(driver.getTitle());			
			WebElement s = driver.findElement(By.id("twotabsearchtextbox"));
			s.sendKeys("redmi note 10 pro mobile covers");
			WebElement m = driver.findElement(By.id("nav-search-submit-button"));
			m.click();
			System.out.println(driver.getTitle());
			

	}

}
