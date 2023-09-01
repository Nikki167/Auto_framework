package nikitha;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrollactionamazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Instagram']"));
		Point loc = ele.getLocation();
         int x = loc.getX();
         int y = loc.getY();
        js.executeScript("window.scrollBy("+x+","+y+")");
        Thread.sleep(2000);
        ele.click();

	}

}
