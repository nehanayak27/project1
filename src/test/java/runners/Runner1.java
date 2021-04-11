package runners;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import Pages.Class1;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Runner1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		Class1 obj=new Class1(driver);
		driver.get("http://gmail.com");
		obj.email();
		obj.clicknext();
		obj.password("neya");
	}

}
