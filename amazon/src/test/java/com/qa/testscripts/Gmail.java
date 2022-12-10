package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\virtusa\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com"); 
		WebElement mailbox= driver.findElement(By.xpath("//input[@id='identifierId']"));
		  mailbox.sendKeys("19l206@kce.ac.in");
		  String title=driver.getTitle();
		  System.out.println(title);
		  if(title.contains("Gmail"))
		  {
		  System.out.println("Welcome to Sign-in Page"); 
		  }
		  else
		  {
		  System.out.println("Enter the Correct Url");
		  }
		  Thread.sleep(10000);
		  String URL=driver.getCurrentUrl();
		  System.out.println(URL);
		  //driver.getMouse();
		 
		      WebElement loginButton=  driver.findElement(By.xpath("//div[@id='identifierNext']"));
		      loginButton.click();
		       
		       Thread.sleep(10000);
		WebElement passwordButton = driver.findElement(By.name("Passwd"));
		Thread.sleep(10000);
		String title2=driver.getTitle();
		System.out.println(title2);
		if(title2.contains("Gmail"))
		{
		System.out.println("You were Entered to the Google mail...! Page Compose your mail");
		}
		else
		{
		System.out.println("404 Error check the Code");
		}


		passwordButton.sendKeys("Karpagam@2023");
		WebElement passwordButton1=driver.findElement(By.xpath("//div[@id='passwordNext']"));
		passwordButton1.click();
		Thread.sleep(25000);
//		WebElement composemail =driver.findElement(By.xpath("//body/div[9]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]"));
//		composemail.click();

		

	}

}
