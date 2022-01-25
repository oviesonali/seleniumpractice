package homeworkproperties;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		//Step1: open browser
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen browser 
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("http://www.Amazon.com");
		//implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> catOptions=driver.findElements(By.cssSelector("#nav-main>div"));
		//List<WebElement>catOptions=driver.findElements(By.xpath("//div[@id='nav-main']/div/div/div"));
		System.out.println("Options count: "+catOptions.size());
		for(int i=0;i<catOptions.size();i++) {
			WebElement option=catOptions.get(i);
			System.out.println(option.getText());

	}

}
}