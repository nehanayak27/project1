package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {
	private RemoteWebDriver driver;
	
	
	public  Class1(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (how=How.NAME, using="identifier")
	public WebElement emailid;
	public void email()
	{
		emailid.sendKeys("nehanayak32@gmail.com");
	}
	
	
	@FindBy (how=How.XPATH, using="//*[text()='Next']/parent::*")
	public WebElement next;
	public void clicknext()
	{
		next.click();
		
	}
	
	@FindBy (how=How.NAME, using="password")
	public WebElement password;
	public void password(String x)
	{
		password.sendKeys("Nehanayak");
		driver.navigate().back();	
		password.sendKeys(x);
	}
	
	public String confirmpass(String x)
	{
		password.sendKeys(x);
		return x;
		
	}
	
	


}
