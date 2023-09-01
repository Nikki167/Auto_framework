package nikitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoqaframes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		Thread.sleep(2000);
		driver.switchTo().frame(ele);
		WebElement ele1 = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
	    String t = ele1.getText();
	    System.out.println(t);
	    Thread.sleep(2000);
	}	
}
