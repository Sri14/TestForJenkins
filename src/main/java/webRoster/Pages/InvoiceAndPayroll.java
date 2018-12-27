package webRoster.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webRoster.util.TestBase;

public class InvoiceAndPayroll extends TestBase {

	@FindBy(xpath = "//span[contains(text(),'  Book a FREE Online Demo Today')]")
	WebElement bookDemo;

	@FindBy(id = "input_1_2")
	WebElement nameField;

	@FindBy(id = "input_1_3")
	WebElement companyNameField;

	@FindBy(id = "input_1_4")
	WebElement emailField;

	@FindBy(id = "input_1_5")
	WebElement phoneNumberField;
	
	@FindBy(id = "choice_1_6_1")
	WebElement dataProtectionButton;
	
	public InvoiceAndPayroll() {
		PageFactory.initElements(driver, this);

	}
	
	public void bookDemobutton() throws Exception{
		bookDemo.click();
		Thread.sleep(2000);
	}

	public void enterName() throws Exception {
		nameField.sendKeys(prop.getProperty("name"));
		Thread.sleep(2000);

	}

	public void enterCompanyName() {
		companyNameField.sendKeys(prop.getProperty("companyName"));
	}

	public void enterEmail() {
		emailField.sendKeys(prop.getProperty("email"));

	}

	public void enterPhone() {
		phoneNumberField.sendKeys(prop.getProperty("phonenumber"));
	}

	public void selectDataProtection() throws Exception{
		dataProtectionButton.click();
		Thread.sleep(2000);

	}
}
