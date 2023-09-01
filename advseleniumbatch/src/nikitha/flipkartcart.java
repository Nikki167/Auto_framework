package nikitha;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class flipkartcart {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Apple iPhone 14 (128 GB) - Blue ");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Plus (Blue, 128 GB)']")).click();
		 Thread.sleep(2000);
		 Set<String> wh = driver.getWindowHandles();
		 for (String wh1 : wh) 
		 {
		driver.switchTo().window(wh1);
		}
		 WebElement ele =driver.findElement(By.xpath("//button[@type='button']"));
		Thread.sleep(2000);
		Point loc = ele.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		js.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		ele.click();
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dst = new File("C:\\Users\\dell\\OneDrive\\Desktop\\screenshot\\1.jpeg");
			FileHandler.copy(src, dst);
			
			
		

	}

}
