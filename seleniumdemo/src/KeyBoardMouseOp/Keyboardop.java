package KeyBoardMouseOp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Keyboardop {

	public static void main(String[] args) {
    //System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	}

}