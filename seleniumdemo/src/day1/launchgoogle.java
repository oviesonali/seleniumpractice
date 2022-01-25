package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class launchgoogle {
	public static void main(String args []) {
		//set path for driver executables
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
			//open Chrome browser
			ChromeDriver cdriver = new ChromeDriver();
			//open google browse
		//enter url//fectching the url
			cdriver.get("https://www.google.com");
			//printing on console
			System.out.println("current url:"+cdriver.getCurrentUrl());
			//pagesource + length
			String a=cdriver.getPageSource();
			System.out.println("Page Source:"+cdriver.getPageSource());
			
			
		//Page source length;
			int b=a.length();
			System.out.println("Page Source:"+cdriver.getPageSource().length());
			
	//close the browse
			cdriver.close();
	}

}
