package framework1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class runnerclass extends Generics
{
@Test
public void Test1() throws InterruptedException
{
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.name("pass")).sendKeys("manager");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	
}
}
