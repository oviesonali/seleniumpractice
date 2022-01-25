package HandlingmutipleElements;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingdropdownlist {
	public static void main(String args[]) throws InterruptedException {
		//step 1: open browser
		System.setProperty("webdriver.chrome.driver",".\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//full screen
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("https://courses.letskodeit.com/practice");
		//implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement skilldropdown=driver.findElement(By.id("carselect"));
		//step2: create instance of Select class by pass dropdown to its constructor
		Select skillSelect=new Select(skilldropdown);
		//isDisplay(), isEnabled()
		System.out.println("Is drop down multiselect or not"+skillSelect.isMultiple());
		System.out.println("Select option"+skillSelect.getFirstSelectedOption().getText());			
	System.out.println("Options count: "+skillSelect.getOptions().size());
	for(int i=0;i<skillSelect.getOptions().size();i++) 
	{
		System.out.println(skillSelect.getOptions().get(i).getText());
	}
	//select option from dropdown
	skillSelect.selectByIndex(2);
	System.out.println("Selected option: "+skillSelect.getFirstSelectedOption().getText());
	Thread.sleep(2000);
	skillSelect.selectByValue("benz");
	System.out.println("Selected option: "+skillSelect.getFirstSelectedOption().getText());
	Thread.sleep(2000);
	skillSelect.selectByVisibleText("BMW");
	System.out.println("Selected option: "+skillSelect.getFirstSelectedOption().getText());
	
	
	System.out.println("**********************************************");
	WebElement multiSelect=driver.findElement(By.id("multiple-select-example"));
	Select mSelect=new Select(multiSelect);
	System.out.println("Multiselect: "+mSelect.isMultiple());				
	for(int i=0;i<mSelect.getOptions().size();i++) {
		System.out.println(mSelect.getOptions().get(i).getText());
	}
	Thread.sleep(2000);
	mSelect.selectByIndex(1);
	Thread.sleep(2000);
	mSelect.selectByVisibleText("Peach");
	System.out.println("Select options: "+mSelect.getAllSelectedOptions().size());
	for(int i=0;i<mSelect.getAllSelectedOptions().size();i++) {
		System.out.println(mSelect.getAllSelectedOptions().get(i).getText());
	}
	Thread.sleep(2000);
//	mSelect.deselectAll();
	}

}
