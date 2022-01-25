package day1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchingIEbrowser {
	public static void main(String args []) {
		//set path for ie executables
				System.setProperty("webdriver.ie.driver",".\\executable\\IEdriverserver.exe");
				//open for ie
			     InternetExplorerDriver idriver=new InternetExplorerDriver();
				
	}

}
