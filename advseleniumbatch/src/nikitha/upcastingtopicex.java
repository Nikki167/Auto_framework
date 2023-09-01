package nikitha;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class upcastingtopicex {

	

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
Thread.sleep(2000);
driver.get("https://www.selenium.dev/downloads/");
WebElement ele1=driver.findElement(By.xpath("//span[text()='Downloads']"));
WebElement ele2=driver.findElement(By.xpath("//span[text()='Documentation']"));
WebElement ele3=driver.findElement(By.xpath("//span[text()='Projects']"));
WebElement ele4=driver.findElement(By.xpath("//span[text()='Support']"));
WebElement ele5=driver.findElement(By.xpath("//span[text()='Blog']"));
Actions act = new Actions(driver);

Thread.sleep(2000); 	
Robot r = new Robot();
 ArrayList<WebElement> l = new ArrayList<>();
l.add(ele1);
l.add(ele2);
l.add(ele3);
l.add(ele4);
l.add(ele5);
Thread.sleep(2000);
for(WebElement l1:l)
{
	act.contextClick(l1).perform();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	
}
Set<String> wh = driver.getWindowHandles();
               ArrayList<String> l3 = new ArrayList<String>(wh);
              String z = l3.get(2);
              driver.switchTo().window(z);
               
}

}
