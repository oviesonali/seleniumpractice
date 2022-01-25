package homeworkproperties;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practice {

	public static void main(String[] args) {
		//Step1: open browser
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen browser 
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("https://courses.letskodeit.com/practice");
		//implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement multiSelect=driver.findElement(By.id("multiple-select-example"));
		Select mSelect=new Select(multiSelect);
		System.out.println("Multiselect: "+mSelect.isMultiple());				
		for(int i=0;i<mSelect.getOptions().size();i++) {
			System.out.println(mSelect.getOptions().get(i).getText());
		}
		//driver.findElement(By.id("bmwradio")).click();
		driver.findElement(By.id("benzradio")).click();
		//driver.findElement(By.id("hondaradio")).click();
	}
}