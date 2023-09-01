package nikitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploadpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/dell/OneDrive/Desktop/uploadpopup.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//input[@name='upload file']"));
		ele.sendKeys("C:\\Users\\dell\\OneDrive\\Documents\\execution_bought site.xlsx");

	}

}
