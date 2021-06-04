package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class ComposeFrame {

	public WebDriver driver;
	String Subjects = null;
	pageObj c;
	Actions a;

	@Given("^Browser is open with Gmail Url$")
	public void browser_is_open_with_gmail_url() throws Throwable {
		String dir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", dir+"\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		c = new pageObj(driver);
		a = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://mail.google.com/mail/u/1/#settings/inbox");
	}

	@And("^Logged in through (.+) and (.+)$")
	public void logged_in_through_and(String username, String password) throws Throwable {
		c.getEmail().sendKeys(username);
		c.sendEmail().click();
		Thread.sleep(2000);
		c.getPass().sendKeys(password);
		c.sendPass().click();
	}

	@When("^I click on the Compose button$")
	public void i_click_on_the_compose_button() throws Throwable {
		c.getCompose().click();
	}

	@Then("^the frame for writing the compose becomes visible$")
	public void the_frame_for_writing_the_compose_becomes_visible() throws Throwable {
		c.getDialog().isDisplayed();
		c.getDialog().isEnabled();
	}

	@When("^I enter the details in the various sections of the frame such as To (.+),CC,BCC and (.+)$")
	public void i_enter_the_details_in_the_various_sections_of_the_frame_such_as_to_ccbcc_and(String emailid,
			String subject) throws Throwable {
		c.getTo().sendKeys(emailid);
		c.getAddcc().click();
		c.getcc().sendKeys(emailid);
		c.getAddBcc().click();
		c.getBcc().sendKeys(emailid);
		c.getSubject().sendKeys(subject);
		c.getBody().sendKeys("This is a Testing email body");
		Subjects = subject;
	}

	@And("^I press the Send button$")
	public void i_press_the_send_button() throws Throwable {
		c.SendButton().click();
	}

	@Then("^Check of the mail is sent by going in sent Section$")
	public void check_of_the_mail_is_sent_by_going_in_sent_section() throws Throwable {
		Thread.sleep(3000);
		c.SentList().click();
	}

	@And("^I click on insert image and insert one image$")
	public void i_click_on_insert_image_and_insert_one_image() throws Throwable {
		c.getInsertImg().click();	
		WebElement URLframe = c.getIframe();
		driver.switchTo().frame(URLframe);
		c.getWebURL().click();
		c.getImage().sendKeys("https://assets.leetcode.com/uploads/2020/11/13/spiraln.jpg");
		c.getImage().sendKeys(Keys.BACK_SPACE);
		Thread.sleep(3000);
		c.getImage().sendKeys("g");
		Thread.sleep(2000);
		c.SendInsertButton().click();
		driver.switchTo().defaultContent();

	}

	@Then("^Check if the email is in the Inbox section$")
	public void check_if_the_email_is_in_the_inbox_section() throws Throwable {
		c.SendInboxTab().click();
	}
	
	  @Then("^Check if the email is in the Discard section$")
	    public void check_if_the_email_is_in_the_discard_section() throws Throwable {
		  Thread.sleep(5000);
		  c.Senddraftsbtn().click();
	    }

	    @And("^Press the close button$")
	    public void press_the_close_button() throws Throwable {
	    	c.Sendclosebtn().click();
	    	driver.switchTo().defaultContent();
	    }


	@After
	public void Close() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
