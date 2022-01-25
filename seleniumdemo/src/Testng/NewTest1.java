package Testng;

import org.testng.annotations.Test;

public class NewTest1 {
	@Test(groups = "integration")
	public void testCaseOne() {
		System.out.println("Im in testCaseOne - And in integration Group");
	}
	@Test(groups = "integration")
	public void testCaseTwo() {
		System.out.println("Im in testCaseTwo - And in integration Group");
	}
	@Test(groups = "System")
	public void testCaseThree() {
		System.out.println("Im in testCaseThree - And in Smoke Test Group");
	}
	@Test(groups = "integration")
	public void testCaseFour() {
		System.out.println("Im in testCaseFour - And in integration Group");
	}
	@Test(groups = "System")
	public void testCaseFive() {
		System.out.println("Im in testCaseThreeFive - And in Smoke Test Group");
	}
	@Test(groups = "Sanity")
	public void testCaseSix() {
		System.out.println("Im in testCaseSix - And in Sanity Group");
	}
}

//1 create normal file like as obove.
//2.then creat xml file..goto file then other then xml-gicve name withxml extension.then run it
//3.selenum right clikc then refresh..then test-output file comes..then click on right and emailable-report html
