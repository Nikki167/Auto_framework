package framework1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class runnerclass4 extends Generics
{
	@Test
	public void test2() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("manager");
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		Thread.sleep(2000);
	}
}
