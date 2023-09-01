package framework1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testrunner2 extends Generics
{
@Test
public void test1() throws InterruptedException
{
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.name("pass")).sendKeys("manager");
	driver.findElement(By.name("login")).click();
	Thread.sleep(2000);
	String title = driver.getTitle();
	Assert.assertEquals(title, "Log in to Facebook");
	
}
@Test
public void test2() throws InterruptedException
{
	driver.findElement(By.id("email")).sendKeys("admin");
	driver.findElement(By.name("pass")).sendKeys("manager");
	driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	Thread.sleep(2000);
	String title = driver.getTitle();
	Assert.assertEquals(title, "Log");
}


}
