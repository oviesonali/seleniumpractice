package day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchingfirefoxbrowser {
	public static void main(String args []) {
	//set path for firefocks executables*/
	System.setProperty("webdriver.gecko.driver",".\\executable\\geckodriver.exe");
	//open for firefock
	FirefoxDriver fdriver=new FirefoxDriver();

}
}      	