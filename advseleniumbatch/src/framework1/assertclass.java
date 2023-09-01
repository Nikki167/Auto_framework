package framework1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertclass extends Generics
{
	@Test
	public void test1() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("manager");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		//Assert.assertEquals(title, "Log in to Facebook");
		Assert.assertEquals(title, "Log");
		System.out.println("1");
	}

}
