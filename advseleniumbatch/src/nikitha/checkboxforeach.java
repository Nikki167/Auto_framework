package nikitha;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxforeach {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/dell/OneDrive/Desktop/checkbox.html");
List<WebElement> links = driver.findElements(By.xpath("//input"));
int count = links.size();
System.out.println(count);
for(WebElement we:links)
{
  we.click();
	Thread.sleep(2000);
}
for(int i=count-1;i>=0;i--)
{
	WebElement we = links.get(i);
	we.click();
	Thread.sleep(2000);
}

	}

}
