package ecommerce_projectpages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.TestBase;



public class Homepage extends TestBase{
	
	@FindBy(xpath="//li[@class='level0 nav-1 first active']")
	WebElement mobilelink;
	
	@FindBy(linkText="TV")
	WebElement tvlink;
	
	@FindBy(xpath="//img[@class='large']")
	WebElement image;
	
	@FindBy(xpath="//a[@class='skip-link skip-account']")
	WebElement account;
	
	public Homepage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public MobilePage clickonmobile()
	{
		mobilelink.click();
		return new MobilePage();
	}
	
	public TvPage clickontv()
	{
		tvlink.click();
		return new TvPage();
	}
	
	public String verifyTitle()
	{
		return driver.getTitle();
		
		
	}
	
	public boolean verifyimage()
	{
	return image.isDisplayed();
	
	}
	public boolean accountlink()
	{
		return account.isDisplayed();
	}

}
