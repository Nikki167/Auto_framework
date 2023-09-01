package nikitha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5 {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
       Thread.sleep(2000);
       String title=driver.getTitle();
   System.out.println(title);
    String url = driver.getCurrentUrl();
    System.out.println(url);
    String src = driver.getPageSource();
    
    System.out.println(src);
   
}
}
