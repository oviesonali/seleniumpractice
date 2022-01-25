package Testng;

import org.testng.annotations.Test;

public class NewTestdata {
	@Test(groups = "integration")
	public void testCaseOne() {
		System.out.println("Im in testCaseOne - And in integration Group");
	}
	@Test(groups = "integration")
	public void testCaseTwo() {
		System.out.println("Im in testCaseTwo - And in integration Group");
	}
	@Test(groups = "Smoke Test")
	public void testCaseThree() {
		System.out.println("Im in testCaseThree - And in Smoke Test Group");
	}
	@Test(groups = "integration")
	public void testCaseFour() {
		System.out.println("Im in testCaseFour - And in integration Group");
	}
	@Test(groups = "Smoke Test")
	public void testCaseFive() {
		System.out.println("Im in testCaseThreeFive - And in Smoke Test Group");
	}
	@Test(groups = "Sanity")
	public void testCaseSix() {
		System.out.println("Im in testCaseSix - And in Sanity Group");
	}
}

  

