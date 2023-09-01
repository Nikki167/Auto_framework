package nikitha;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentbrowserclose {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://skpatro.github.io/demo/links/");
         String wh = driver.getWindowHandle();
         System.out.println(wh);
         driver.findElement(By.name("NewWindow")).click();
         Set<String> wh1 = driver.getWindowHandles();
int count = wh1.size();
System.out.println(count);
for(String wh2:wh1)
{
	driver.switchTo().window(wh2);
	String t = driver.getTitle();
	System.out.println(t);
	if(wh2.equals(wh))
	{
		driver.close();
	}
}
	}

}
