package nikitha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class srcforeach {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		List<WebElement> links = driver.findElements(By.xpath("//img"));
		int count = links.size();
		System.out.println(count);
		for(WebElement we:links)
		{
			String t = we.getAttribute("src");
			System.out.println(t);
		}

	}

}
