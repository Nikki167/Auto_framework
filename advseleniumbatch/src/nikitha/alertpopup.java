package nikitha;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("cusid")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.name("submit")).click();
		 Alert a = driver.switchTo().alert();
		String t = a.getText();
		System.out.println(t);
		Thread.sleep(2000);
		a.accept();

	}

}
