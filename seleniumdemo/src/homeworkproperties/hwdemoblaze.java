package homeworkproperties;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hwdemoblaze {

	public static void main(String[] args) {
		//Step1: open browser
				System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				//full screen browser 
				driver.manage().window().maximize();
				/**Step2: enter required URL */
				driver.get("https://www.demoblaze.com/");
				//implicit wait: Interface->Interface->Interface->abstract method*/
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				//WebElement Name=driver.findElement(By.cssSelector("#tbodyid>div>div>div>h4>a"));
				
				
				List<WebElement> catOptions=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
				List<WebElement> price = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
				System.out.println("Options count: "+catOptions.size());
				System.out.println("price count: "+price.size());
				for(int i=0;i<catOptions.size();i++) {
					
					WebElement option=catOptions.get(i);
					WebElement p=price.get(i);
					System.out.println(option.getText()+":"+p.getText());
					 
				
	}
				driver.findElement(By.cssSelector("button[id=next2]")).click();

				List<WebElement> mobile=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
				List<WebElement> price1 = driver.findElements(By.cssSelector("#tbodyid>div>div>div>h5"));
				System.out.println("Options count: "+mobile.size());
				System.out.println("price count: "+price1.size());
				for(int i=0;i<mobile.size();i++) {
					
					WebElement option=mobile.get(i);
					WebElement p=price.get(i);
					System.out.println(option.getText()+":"+p.getText());
					 
				
	}
}
}
//a[text()='Nokia lumia 1520']

//#tbodyid>div>div>div>h4>a
//h5[text()='$820']

//#tbodyid>div>div>div>h5

//#tbodyid>div>div>div>h4>a