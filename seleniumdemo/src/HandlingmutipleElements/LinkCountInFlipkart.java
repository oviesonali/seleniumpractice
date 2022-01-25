package HandlingmutipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCountInFlipkart {
	public static void main(String args[]) {
		//step one: open browser
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//full screen browser
		driver.manage().window().maximize();
		//step two: enter url
		driver.get("https://www.flipkart.com/");
		//implicit wait: Interface->Interface->Interface->abstract method*/
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				List<WebElement> flipkartLinks=driver.findElements(By.tagName("a"));
				
			
				System.out.println("links count:"+flipkartLinks.size());
				//for fetching
				for(WebElement element:flipkartLinks) {
					System.out.println(element.getText());
				}
	}

}
