package nikitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='email']")).sendKeys("nikitha");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("nikki123@");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[name='login']")).click();
}
}
