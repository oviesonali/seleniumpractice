package HandlingmutipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//full screen browser
		driver.manage().window().maximize();
		//eneter url
		driver.get("http://demo.automationtesting.in/Register.html");
		//implicit wait: Interface->Interface->Interface->abstract method*/
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> buttons=driver.findElements(By.tagName("button"));
		System.out.println("button count:"+buttons.size());
		//for fetching
		for(WebElement element:buttons) {
			System.out.println(element.getText());
		}
		
	}

}
