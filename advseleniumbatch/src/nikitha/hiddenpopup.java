package nikitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class hiddenpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Thu, Aug 3']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='10']"));
		driver.quit();
		
		
	
	}

}
