package webRoster.Pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webRoster.util.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath = "//span[contains(text(),'Products')]")
	WebElement productsMenu;
	
	@FindBy (xpath = "//span[contains(text(), 'Invoice &  payroll')]")
	WebElement invoiceAndParollMenu;
	
	
	@FindBy(xpath = "//img[@alt='Online Workforce Management & Rostering Software - Webroster']")
	WebElement homepageImage;
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);	
		
	}
	
	
	
	public void clickOnProducts() throws Exception{
	 Actions action = new Actions(driver);
	 action.moveToElement(productsMenu).build().perform();
	 Thread.sleep(2000);
	}
	
	public void clickOnInvoiceAndPayroll(){
		invoiceAndParollMenu.click();
	}
	
	public Boolean checkHomePageImage(){
		Boolean image = homepageImage.isDisplayed();
		return image;
	}
	
}



