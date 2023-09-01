package nikitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class countriesdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dell/OneDrive/Desktop/countriesdropdown.html");
		WebElement ele = driver.findElement(By.id("countries"));
		Thread.sleep(2000);
		Select s=new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByValue("k");
		Thread.sleep(2000);
		s.selectByVisibleText("Korea");
		Thread.sleep(2000);
		s.deselectAll();

	}

}
