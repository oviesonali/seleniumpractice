package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimedemo {
	public static void main(String args[]) {
		//set path for driver executables
			System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
				//open Chrome browser
				ChromeDriver cdriver = new ChromeDriver();
				//open actitime browse
			//enter url//
				cdriver.get("https://demo.actitime.com");
				//page title
				String currentpagetitle=cdriver.getTitle();
				System.out.println("current page title:"+cdriver.getTitle());
				//title lenth
			    String a=cdriver.getTitle();
				int b=a.length();
				System.out.println("current page title:"+cdriver.getTitle().length());
			
			
				if(cdriver.equals("https://demo.actitime.com"))
				{
					System.out.println("The current url is opened.");
				}
				else
				{
					System.out.println("Incorrect url is opened");
				//get page source
					String e=cdriver.getPageSource();
				System.out.println("PageSourcecode:"+e.length());
				//lenght of pagesouce
				int f= e.length();
				}	
				
				
	}

}
