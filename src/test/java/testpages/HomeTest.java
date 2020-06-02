package testpages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ecommerce_projectpages.Homepage;

public class HomeTest {
		
	WebDriver driver;
	Homepage homepage;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		  driver.get("http://live.demoguru99.com/index.php/");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		  homepage =new Homepage();
	
			
	}
		
//	@Test
//	public void verifytitle()
//	{
//		String s=homepage.verifyTitle();
//		System.out.println(s);
//	}
	@Test
	public void verifymobileTest()
	{
          homepage.clickonmobile();
	}
	
	@AfterMethod
	public void Teardown()
	{
		driver.quit();
	}

}
