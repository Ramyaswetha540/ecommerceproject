package utilities;

import java.io.FileInputStream;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		prop=new Properties();
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\14388\\eclipse-workspace\\ecommerce_project\\src\\main\\java\\config\\config.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
	public static void intialization()
	{
		String browsername=prop.getProperty("browser");
		if (browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\14388\\Downloads\\chromedriver\\chromedriver.exe");
			  driver=new ChromeDriver();
		}
		
		 
	}

}
