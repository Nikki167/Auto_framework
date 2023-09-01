package nikitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Youtube
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.findElement(By.cssSelector("input[id='search']")).sendKeys("kgf trailer");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("a[id='video-title']")).click();
	System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
	WebDriver driver1=new FirefoxDriver();
	driver1.get("https://www.youtube.com/");
	driver1.findElement(By.cssSelector("input[id='search']")).sendKeys("kgf trailer");
	Thread.sleep(2000);
	driver1.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
	Thread.sleep(2000);
	driver1.findElement(By.cssSelector("[id='video-title']")).click();
}
}











