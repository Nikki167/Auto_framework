package nikitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickaction {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dell/OneDrive/Desktop/locators.html");
		Thread.sleep(2000);
		//driver.findElement(By.tagName("a")).click();
		//driver.findElement(By.id("a1")).click();
		driver.findElement(By.name("n1")).click();
		

	}

}
