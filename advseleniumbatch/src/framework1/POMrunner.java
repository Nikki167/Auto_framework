package framework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class POMrunner {
@Test
public void click1() throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	POMClass pm=new POMClass(driver);
	pm.username("admin");
	Thread.sleep(2000);
	pm.password("manager");
	Thread.sleep(2000);
	pm.Loginbutton();
}
}
