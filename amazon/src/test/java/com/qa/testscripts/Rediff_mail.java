package com.qa.testscripts;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediff_mail {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\virtusa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com");
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		WebElement login = driver.findElement(By.linkText("Create Account"));
		login.click();
		WebElement full_name = driver.findElement(By.cssSelector("table.f14:nth-child(3) tbody:nth-child(1) tr:nth-child(3) td:nth-child(3) > input:nth-child(1)"));
		full_name.sendKeys("Rajesh Kumar M");
		WebElement valid = driver.findElement(By.cssSelector("table.f14:nth-child(3) tbody:nth-child(1) tr:nth-child(7) td:nth-child(3) > input:nth-child(1)"));
		valid.sendKeys("rajesh2110@rediffmail.com");
		WebElement pwd = driver.findElement(By.id("newpasswd"));
		pwd.sendKeys("Rajesh2110");
		WebElement n = driver.findElement(By.xpath("//em[@id='eyeiconNew']"));
		n.click();
		WebElement newpwd = driver.findElement(By.id("newpasswd1"));
		newpwd.sendKeys("Rajesh2110");    
		WebElement n1 = driver.findElement(By.xpath("//em[@id='eyeiconNew']"));
		n1.click();
		String str = sc.next();
		if(str.equals("yes")) {
			WebElement alternate = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/input[1]"));
			alternate.sendKeys("rajeshmarakkannu1998@gmail.com");
		}
		else {
			WebElement no = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/input[1]"));
			no.click();
			WebElement  ques = driver.findElement(By.xpath("//tbody/tr[2]/td[3]/select[1]"));
			Select select5 = new Select(ques);
			select5.selectByIndex(2);
			WebElement ques1 = driver.findElement(By.xpath("//body[1]/center[1]/form[1]/div[1]/table[2]/tbody[1]/tr[16]/td[1]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/input[1]"));
			ques1.sendKeys("Briyani");
			WebElement ques2 = driver.findElement(By.xpath("//tbody/tr[6]/td[3]/input[1]"));
			ques2.sendKeys("Mother");
			
		}
		
		WebElement number = driver.findElement(By.xpath("//input[@id='mobno']"));
		number.sendKeys("6382178960");
		WebElement day = driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[1]"));
		Select select = new Select(day);
		select.selectByIndex(2);
		WebElement month = driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[2]"));
		Select select1 = new Select(month);
		select1.selectByIndex(11);
		WebElement year = driver.findElement(By.xpath("//tbody/tr[22]/td[3]/select[3]"));
		Select select2 = new Select(year);
		select2.selectByIndex(20);
		WebElement gender = driver.findElement(By.xpath("//tbody/tr[24]/td[3]/input[1]"));
		gender.click();
		WebElement country = driver.findElement(By.xpath("//select[@id='country']"));
		Select select3 = new Select(country);
		select3.selectByIndex(10);
		WebElement city = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/select[1]"));
		Select select4 = new Select(city);
		select4.selectByIndex(3);
		WebElement register = driver.findElement(By.xpath("//input[@id='Register']"));
		register.click();
		String title = driver.getTitle();
		System.out.println(title);

	}

}
