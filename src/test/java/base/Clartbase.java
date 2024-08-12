package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Clartbase {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void precondition()
	{
		driver=new ChromeDriver();
		driver.get("https://www.clartstudios.com/");
		driver.manage().window().maximize();
	}
	
	@AfterTest
	public void postcondition()
	{
		driver.quit();
	}
	
	

}
