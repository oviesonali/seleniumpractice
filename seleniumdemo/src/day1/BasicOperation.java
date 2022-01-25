package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperation {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    //eneter the url
	    driver.get("https://www.google.com");
	    
		//print page sourcecode
	    
	    driver.getPageSource();
	    System.out.println("Page Source:"+driver.getPageSource());
	    
	    //current Page Title
	    driver.getTitle();
	    String currentPageTitle = driver.getTitle();
	    //System.out.println("current page title:"+currentPageTitle);
	                       //or
	    
	    System.out.println("current page title:"+driver.getTitle());
	    
	    //currentpage url
	    System.out.println("current page url:"+driver.getCurrentUrl());
	    
	    //closing current browser
	    driver.close();
	    
	    
	
	}

}
