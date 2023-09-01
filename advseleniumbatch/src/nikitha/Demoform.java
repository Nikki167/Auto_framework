package nikitha;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoform {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Nikitha");
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Kamadolli");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("nikhitamalya@gmail.com");
		Thread.sleep(2000);
	driver.findElement(By.xpath("//label[@for='gender-radio-2']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9148207890");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(text(),'19')]")).click();
			
	
			}

}
