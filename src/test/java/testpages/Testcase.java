package testpages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Testcase {
	
	static WebDriver driver;
	public String verifyTitle()
	{
	return driver.getTitle();
		
	}

	
		  Testcase tc=new Testcase();
		 //verify homepage
		
		  
		 		  if(s.equals("Home page"))
		 		  {
		 			  System.out.println("title home page is equal");
		 		  }
		  String b =driver.findElement(By.xpath("//h2")).getText();
		  System.out.println(b);
		  //navigate to mobile page
		  driver.findElement(By.xpath("//li[@class='level0 nav-1 first active']")).click();
		  //verify title
          if(driver.getTitle().equals("Mobile"))
        		  {
        	  System.out.println("titles are equal");
        		  }
          //select sort by -name
          
 WebElement sortby= driver.findElement(By.xpath("//select[@title='Sort By']"));
     
        Select sel=new Select(sortby);
 
         sel.selectByIndex(1); 
         
       
         
   driver.findElement(By.xpath("//a[@class='sort-by-switcher sort-by-switcher--asc']")).click();
    
List <WebElement> lis=driver.findElements(By.tagName("a"));

for(int i=0;i<lis.size();i++)
{
	
	
		System.out.println(lis.get(i).getText());
		
	
}
         
	}

}
