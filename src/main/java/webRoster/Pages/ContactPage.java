package webRoster.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import webRoster.util.TestBase;

public class ContactPage extends TestBase {

	@FindBy(xpath = "//span[contains(text(), 'Contact')]")
	WebElement contactMenu;

	@FindBy(id = "input_8_4")
	WebElement contactName;

	@FindBy(id = "input_8_2")
	WebElement contactPhone;

	@FindBy(id = "input_8_3")
	WebElement contactEmail;

	@FindBy(id = "input_8_5_1")
	WebElement streetAddress;

	@FindBy(id = "input_8_5_2")
	WebElement addressLine1;

	@FindBy(id = "input_8_5_3")
	WebElement city;

	@FindBy(id = "input_8_5_4")
	WebElement county;

	@FindBy(id = "input_8_5_5")
	WebElement postCode;

	@FindBy(id = "input_8_6")
	WebElement aboutUsDropDown;

	@FindBy(id = "choice_8_8_1")
	WebElement demoClickOption;

	@FindBy(id = "choice_8_9_1")
	WebElement schedulingCheckBox;

	@FindBy(id = "choice_8_9_2")
	WebElement ElectronicCheckBox;

	@FindBy(id = "choice_8_9_3")
	WebElement travelCheckBox;

	@FindBy(id = "choice_8_9_4")
	WebElement mobileCheckBox;

	@FindBy(id = "choice_8_10_1")
	WebElement partnerCheckBox;

	@FindBy(id = "input_8_11")
	WebElement messageBox;

	public ContactPage() {
		PageFactory.initElements(driver, this);
	}

	public void clickOnContactMenu() {
		contactMenu.click();
	}

	public void enterContactName(String Name) {
		contactName.sendKeys(Name);
	}

	public void enterContactPhone(String Num) {
		contactPhone.sendKeys(Num);
	}

	public void enterContactText(String Email) {
		contactEmail.sendKeys(Email);
	}
	
	public void enteraddressdetails(){
		streetAddress.sendKeys(prop.getProperty("streetAddress"));
		addressLine1.sendKeys(prop.getProperty("addressLine1"));
		city.sendKeys(prop.getProperty("city"));
		county.sendKeys(prop.getProperty("county"));
		postCode.sendKeys(prop.getProperty("postcode"));
		
		
	}
	
	public void selectAndTickRest() throws Exception{
		Select select = new Select(aboutUsDropDown);
		select.selectByVisibleText("Directory listing");
		
		demoClickOption.click();
		schedulingCheckBox.click();
		ElectronicCheckBox.click();
		Thread.sleep(2000);
		travelCheckBox.click();
		mobileCheckBox.click();
		partnerCheckBox.click();
		messageBox.sendKeys(prop.getProperty("message"));
		Thread.sleep(2000);
	}	
		
	
	

}