package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\virtusa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in");
		driver.manage().window().maximize();
		String  title = driver.getTitle();
		System.out.println(title);
		WebElement arrow = driver.findElement(By.id("sign-in-icon-down"));
		arrow.click();
		WebElement signin = driver.findElement(By.id("signInLink"));
		signin.click();
		WebElement google = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]"));
		google.click();
//		WebElement from = driver.findElement(By.id("src"));
//		from.sendKeys("Rajapalayam");
//		WebElement to = driver.findElement(By.id("dest"));
//		to.sendKeys("Coimbatore");
//		String dd="25";
//		String mm="oct";
//		String yy="2022";
//		while(true) {
//			String monthyear=driver.findElement(By.xpath("//td[contains(text(),'Oct 2022')]")).getText();
//			String arr[] = monthyear.split(" ");
//			String m = arr[0];
//			String yr = arr[1];
//			
//		}
		
		
	String t = driver.getTitle();
		System.out.println(t);

	}

}
