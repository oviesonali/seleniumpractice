package WindowHandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.SeleniumUtils;

public class windowhandling extends SeleniumUtils{
	static WebDriver driver;
	@Test
	public void testWindow() {
		driver=setUp("chrome","https://demoqa.com/browser-windows");
		System.out.println("Home window current url:"+driver.getCurrentUrl());
		//to get current window id
		String homewind=driver.getWindowHandle();
		System.out.println("Home window id: "+homewind);
		//click on button to open new tab/window..FROM where it come from
		driver.findElement(By.id("windowButton")).click();
		
		//get the window ids of all the browser window open by webdriver
				Set<String> allWinIds=driver.getWindowHandles();
				System.out.println("All win ids: "+allWinIds);//2 Win IDs
	}
	

}
//asked to megha