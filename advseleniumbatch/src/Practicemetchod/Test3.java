package Practicemetchod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


		public class Test3 {
			
     @Test
     public void data1()
     {
    	 {
    			String key="webdriver.chrome.driver";
    			String value="./Softwares/chromedriver.exe";
    			System.setProperty(key, value);
    			ChromeDriver driver= new ChromeDriver();
    			}
     }
}
