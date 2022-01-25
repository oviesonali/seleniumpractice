package homeworkproperties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipcart {

	public static void main(String[] args) {
	//open browser
		//System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		//open url
		driver.get("https:www.flipkart.com");
		//for validate browser
		
	System.out.println();
		String Title = driver.getTitle();
		if(Title.equals("https:www.flipkart.com"))
			
		{
			System.out.println("title home page is same");
		}
		else {
			System.out.println("title home page is not same");
			
		}
		 //print title
		System.out.println(Title);
		
		//browse close
		driver.close();
		

	}

}
