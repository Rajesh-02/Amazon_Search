package com.qa.testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Downloads\\virtusa\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
//        WebElement search = driver.findElement(By.cssSelector("ddiv._1kfTjk div._1rH5Jn div._2Xfa2_:nth-child(2) div.go_DOp._2errNR:nth-child(3) div._28p97w div._1psGvi._3BvnxG div:nth-child(1) > a._1_3w1N"));
//        search.click();
//        Thread.sleep(2000);
        WebElement user = driver.findElement(By.cssSelector("body.fk-modal-visible:nth-child(2) div._2Sn47c:nth-child(14) div._2hriZF._2rbIyg div._2QfC02 div._2MlkI1 div._3wFoIb.row div._36HLxm.col.col-3-5 div:nth-child(1) form:nth-child(1) div.IiD88i._351hSN:nth-child(1) > input._2IX_2-.VJZDxU"));
        user.sendKeys("6382178960");
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        WebElement pwd = driver.findElement(By.cssSelector("body.fk-modal-visible:nth-child(2) div._2Sn47c:nth-child(14) div._2hriZF._2rbIyg div._2QfC02 div._2MlkI1 div._3wFoIb.row div._36HLxm.col.col-3-5 div:nth-child(1) form:nth-child(1) div.IiD88i._351hSN:nth-child(2) > input._2IX_2-._3mctLh.VJZDxU"));
        pwd.sendKeys("Rajesh02!"+Keys.ENTER);
        String t = driver.getTitle();
        System.out.println(t);
       // driver.navigate().back();
//        WebElement createAccount = driver.findElement(By.cssSelector("body.fk-modal-visible:nth-child(2) div._2Sn47c:nth-child(14) div._2hriZF._2rbIyg div._2QfC02 div._2MlkI1 div._3wFoIb.row div._36HLxm.col.col-3-5 div:nth-child(1) form:nth-child(1) div._1En5li:nth-child(6) > a._14Me7y"));
//        createAccount.click();
        WebElement search = driver.findElement(By.cssSelector("div._1kfTjk div._1rH5Jn div._2Xfa2_:nth-child(2) div._1cmsER:nth-child(2) form._2M8cLY.header-form-search div.col-12-12._2oO9oE:nth-child(1) div._3OO5Xc:nth-child(1) > input._3704LK"));
        search.sendKeys("watches for men"+Keys.ENTER);
        String temp = driver.getTitle();
        System.out.println(temp);
        
       // driver.navigate().back();
        
        
		
		

	}

}
