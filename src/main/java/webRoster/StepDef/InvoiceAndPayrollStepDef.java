package webRoster.StepDef;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import webRoster.Pages.ContactPage;
import webRoster.Pages.HomePage;
import webRoster.Pages.InvoiceAndPayroll;
import webRoster.util.TestBase;

public class InvoiceAndPayrollStepDef extends TestBase {
	
	HomePage homepage;
	InvoiceAndPayroll invoicepage;
	ContactPage contactpage;
	
	
	@Given("^I am on WebRoster homepage$")
	public void i_am_on_WebRoster_homepage() throws Throwable {
		TestBase.initialization();
		homepage = new HomePage();
		String title = driver.getTitle();
		Assert.assertEquals("Webroster: Online rostering & workforce management software", title);		

	}

	@When("^I click on Products$")
	public void i_click_on_Products() throws Throwable {
		homepage = new HomePage();
		homepage.clickOnProducts();

	}

	@Then("^I click on Invoic and Payments$")
	public void i_click_on_Invoic_and_Payments() throws Throwable {
		homepage = new HomePage();
		homepage.clickOnInvoiceAndPayroll();
	}

	@Then("^I click on book a free online demo$")
	public void i_click_on_book_a_free_online_demo() throws Throwable {
		invoicepage = new InvoiceAndPayroll();
		invoicepage.bookDemobutton();
	}

	@Then("^I fill in Name and Company name and Email and Phonenumber$")
	public void i_fill_in_Name_and_Company_name_and_Email_and_Phonenumber() throws Throwable {
		invoicepage = new InvoiceAndPayroll();
		invoicepage.enterName();
		invoicepage.enterCompanyName();
		invoicepage.enterEmail();
		invoicepage.enterPhone();
	}

	@Then("^I click on Data Protection$")
	public void i_click_on_Data_Protection() throws Throwable {
		invoicepage = new InvoiceAndPayroll();
		invoicepage.selectDataProtection();

	}

	@Then("^I close the Browser$")
	public void i_close_the_Browser() throws Throwable {
		driver.quit();
	}
	
	@Then("^I see the image displayed$")
	public void i_see_the_image_displayed() throws Throwable {
		homepage = new HomePage();
		homepage.checkHomePageImage();
	}
	
	@When("^I click on contact tab$")
	public void i_click_on_contact_tab() throws Throwable {
	   contactpage = new ContactPage();
	   contactpage.clickOnContactMenu();
	   Thread.sleep(2000);
	}

	@Then("^I fill in \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_fill_in_and_and(String Name, String Phone, String Email) throws Throwable {
	   contactpage = new ContactPage();
	   contactpage.enterContactName(Name);
	   contactpage.enterContactPhone(Phone);
	   contactpage.enterContactText(Email);
	   Thread.sleep(3000);
		
	}
	
	@Then("^I fill in address and tick required boxes$")
	public void i_fill_in_address_and_tick_required_boxes() throws Throwable {
	    contactpage = new ContactPage();
	    contactpage.enteraddressdetails();
	    contactpage.selectAndTickRest();
	}

	
	

}
