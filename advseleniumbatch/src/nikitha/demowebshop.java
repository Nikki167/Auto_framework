package nikitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@href='/books']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Computing and Internet']/../../div[3]//input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Fiction']/../..//div[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Shopping cart']")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//a[text()='Computing and Internet']/../..//td[1]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[text()='Fiction']/../../td[1]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='updatecart']")).click();
	
	
	
	
	
	
			
	}

}
