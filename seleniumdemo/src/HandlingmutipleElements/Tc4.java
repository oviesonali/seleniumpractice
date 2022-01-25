package HandlingmutipleElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc4 {

	public static void main(String[] args) {
		//Step1: open browser
				System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				//full screen browser 
				driver.manage().window().maximize();
				/**Step2: enter required URL */
				driver.get("https://www.gsmarena.com");
				//implicit wait: Interface->Interface->Interface->abstract method*/
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				//Get mobile phone name count from phone finder
				driver.findElement(By.tagName("a")).click();

	}

}
