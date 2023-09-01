package framework1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassertclass extends Generics
{
	@Test
	public void test1() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(title, "Log in to ");
		System.out.println("1");
		sa.assertAll();
		
}
}