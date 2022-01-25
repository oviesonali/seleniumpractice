package practiceprograme;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttoncount {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//full screen browser
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
         driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
}
}