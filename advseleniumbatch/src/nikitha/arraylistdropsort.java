package nikitha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class arraylistdropsort {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		WebElement ele = driver.findElement(By.id("month"));
		TreeSet<String> t = new TreeSet<String>();
		Select s=new Select(ele);
		List<WebElement> opt = s.getOptions();
		int count = opt.size();
		System.out.println(count);
		for(WebElement we:opt)
		{
			String t1 = we.getText();
			t.add(t1);
		}
	
		for( String t1:t)
		{
			System.out.println(t1);
		}


	}

}
