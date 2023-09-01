package pomscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Pomclass {
	@FindBy(name="field-keywords")
	private WebElement search;
	@FindBy(id="nav-search-submit-button")
	private WebElement btn;
	@FindBy(xpath="//span[text()='Apple AirPods (2nd Generation)']")
	private WebElement prod;
	@FindBy(name="submit.add-to-cart")
	private WebElement adtocart;
	@FindBy(name="proceedToRetailCheckout")
	private WebElement proceed;
	@FindBy(name="email")
	private WebElement username;
	@FindBy(id="continue")
	private WebElement submit;
	public Pomclass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void sear(String sr)
	{
		search.sendKeys(sr);
	}
	public void button()
	{
		btn.click();
	}
	public void product()
	{
		prod.click();
	}
	public void addtocart()
	{
		adtocart.click();
	}
	public void proceedtobuy()
	{
		proceed.click();
	}
	public void uname(String un)
	{
		username.sendKeys(un);
	}
	public void sub()
	{
		submit.click();
	}
	
	
	
	

}
