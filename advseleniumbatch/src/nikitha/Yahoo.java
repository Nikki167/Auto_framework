package nikitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://login.yahoo.com/?.src=ym&pspid=1197806870&activity=header-signin&.lang=en-SG&.intl=sg&.done=https%3A%2F%2Fsg.mail.yahoo.com%2Fd");
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("sagargd07@yahoo.com");
		driver.findElement(By.xpath("//input[@name='signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("sgd@141518");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='login-signin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@role='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='message-to-field']")).sendKeys("nikhitamalya@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Subject']")).sendKeys("hello beautiful");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Message body']")).sendKeys("hey hope all good!!");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@title='Send this email']")).click();
		
		
		
	}
}
