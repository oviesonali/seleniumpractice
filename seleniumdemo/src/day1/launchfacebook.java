package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class launchfacebook {

	public static void main(String[] args) {
		//set path for driver executables
			System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
				//open Chrome browser
				ChromeDriver driver = new ChromeDriver();
				
			
				//launch facebook browser
				driver.get("https://www.facebook.com");
				
				//display tittle
				
				System.out.println();
				
				//verifying actual titlke home page with excpected one
				String Title=driver.getTitle();
				if(Title.equals("https://www.facebook.com"))
				{
					System.out.println("title home page is same");
				}
				else {
					System.out.println("title home page is different");
				}
				 //print title
				System.out.println(Title);
				
				//browse close
				driver.close();
	

	}

}
