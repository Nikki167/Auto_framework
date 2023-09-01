package nikitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbxpath {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nikkitha");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("nikithaaaa");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	

	}

}
