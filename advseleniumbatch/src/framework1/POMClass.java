package framework1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMClass {
@FindBy(name="email")
private WebElement uname;
@FindBy(name="pass")
private WebElement pswd;
@FindBy(xpath = "//button[text()='Log in']")
private WebElement loginbtn;
public POMClass(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void username(String un)
{
	uname.sendKeys(un);
}
public void password(String pwd)
{
	pswd.sendKeys(pwd);
}
public void Loginbutton()
{
	loginbtn.click();
}
}