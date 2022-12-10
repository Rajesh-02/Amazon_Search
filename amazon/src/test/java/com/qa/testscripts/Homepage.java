package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {

	public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\virtusa\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com");
		//driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/span[1]/nav[1]/button[1]/*[1]")).click();
		driver.findElement(By.linkText("Log in")).click();
		 driver.findElement(By.className("sc-60vv3c-0 eOYJSt sc-fznyAO CWQMf")).sendKeys("6382178960");
		// driver.findElement(By.id("password")).sendKeys("Rajesh02!");
	 driver.findElement(By.className("sc-60vv3c-0 eOYJSt sc-fznyAO CWQMf")).sendKeys("Keys.ENTER");
		
		
		System.out.println(driver.getTitle());
		//Thread.sleep(8000);
		driver.quit();
	}

}
