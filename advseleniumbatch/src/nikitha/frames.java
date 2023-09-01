package nikitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class frames {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("///C:/Users/dell/OneDrive/Desktop/frames1.html");
	 driver.findElement(By.xpath("//input[@id='a1']")).sendKeys("nikitha");
	 Thread.sleep(2000);
	 WebElement frame = driver.findElement(By.tagName("iframe"));
	 driver.switchTo().frame("frame");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//input[@id='p1']")).sendKeys("nikithaaaaaaaaa");
	 
}
}
