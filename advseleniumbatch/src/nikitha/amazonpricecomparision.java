package nikitha;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonpricecomparision {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iPhone 14 (128 GB) - Blue ");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		WebElement ele1 = driver.findElement(By.xpath("//div[@data-csa-c-item-id='amzn1.asin.1.B0BDK62PDX']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a/span[1]/span[2]/span[2]"));
		
		String t1 = ele1.getText();
		String t = t1.replace(",","");
		int v1 = Integer.parseInt(t);
		System.out.println(v1);
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("Apple iPhone 14 (128 GB) - Blue ");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		WebElement ele2 = driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']/../following-sibling::div[1]/div[1]/div[1]/div[1]"));
		
		String t2 = ele2.getText();
		String str = t2.substring(1);
		String t3 = str.replace(",","");
		int v2 = Integer.parseInt(t3);
		System.out.println(v2);
		driver.close(); 
		if(v1==v2)
		{
			System.out.println("both the prices are same");
		}
		else if (v1<v2) 
		{
			System.out.println("The value in Amazon "+v1+" is less than the value "+v2+ " in Flipkart");	
		}
		else
		{
			System.out.println("The value in Flipkart "+v2+" is less than the value "+v1+ " in Amazon");
		}
	}
}