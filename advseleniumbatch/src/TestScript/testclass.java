package TestScript;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericscript.genericclass;
import pomscript.Pomclass;

public class testclass extends genericclass
{
	@Test
	public void amazon() throws InterruptedException
	{
		Pomclass pm=new Pomclass(driver);
		pm.sear("Apple AirPods (2nd Generation)");
		Thread.sleep(2000);
		pm.button();
		Thread.sleep(2000);
		pm.product();
		Thread.sleep(2000);
		Set<String> allwh = driver.getWindowHandles();
		for(String wh:allwh)
		{
			driver.switchTo().window(wh);
		}
		pm.addtocart();
		Thread.sleep(2000);
		pm.proceedtobuy();
		Thread.sleep(2000);
		pm.uname("nikitha");
		Thread.sleep(2000);
		pm.sub();
		Thread.sleep(2000);
		
		
		
		
		
		
	}

}
