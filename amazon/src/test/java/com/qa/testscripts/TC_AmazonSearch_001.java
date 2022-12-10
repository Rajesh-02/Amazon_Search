package com.qa.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Amazon_pages;

public class TC_AmazonSearch_001 extends TestBase
{
	Amazon_pages amzpages;
@Parameters({"Browser","Url"})
@Test
public void Search(String Browser,String Url) throws InterruptedException
{
	//WebDriver Driver = null;
	amzpages=new Amazon_pages(Driver);
	amzpages.SearchBox().sendKeys("Da Vince Code");
	amzpages.SearchButton().click();
	Thread.sleep(5000);
	String title=Driver.getTitle();
	if(title.contains("Da Vince Code"))
		System.out.println("User Landed on Da Vince Code page");
	else
		System.out.println("User Landed on Da Vince Code page");
	
//	Actions amzpages = new Actions(Driver);
//	amzpages.sendKeys(Keys.PAGE_DOWN).build().perform();
	
	JavascriptExecutor js = (JavascriptExecutor)Driver;
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}

}