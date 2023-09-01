package nikitha;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo7practice {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe/");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
}

}