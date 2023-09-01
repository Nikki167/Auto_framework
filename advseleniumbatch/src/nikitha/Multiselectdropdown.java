package nikitha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselectdropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		WebElement ele = driver.findElement(By.id("day"));
		Select s =new Select(ele);
		boolean b = s.isMultiple();
		if(b)
		{
			System.out.println("multi select dropdown");
		}
		else
		{
			System.out.println("single select dropdown");
		}
	}

}
