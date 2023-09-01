package nikitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagramxpath {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[(@aria-label='Phone number, username, or email' or @name='username') and @type='text']")).sendKeys("lorem");
    driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("nikitha879");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
