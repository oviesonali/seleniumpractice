package Testng;

import org.testng.annotations.Test;

public class withPeriority1 {
	@Test
	public void Mango() {
		System.out.println("I am Mango");
	}
	@Test(priority=2)
	public void APPle() {
		System.out.println("I am Apple");
	}
	@Test(priority=3)
	public void WaterMelon() {
		System.out.println("I am Watermelon");
	}

}
