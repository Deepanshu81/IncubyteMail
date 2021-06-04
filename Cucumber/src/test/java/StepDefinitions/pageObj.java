package StepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageObj {
		
		public WebDriver driver;
		public pageObj(WebDriver driver) {
			this.driver = driver;
		}
		By email = By.cssSelector("[type='email']");
		By emailnext = By.cssSelector("[id='identifierNext']");
		By pass = By.cssSelector("[type='password']");
		By passnext = By.cssSelector("[id='passwordNext']");
		By Compose = By.cssSelector("[class='T-I T-I-KE L3']");
		By dialog= By.cssSelector("[role='dialog']");
		
		By To = By.cssSelector("[aria-label='To']");
		By Addcc = By.cssSelector("[data-tooltip='Add Cc recipients ‪(Ctrl-Shift-C)‬']");
		By cc = By.name("cc");
		By AddBcc = By.cssSelector("[aria-label='Add Bcc recipients ‪(Ctrl-Shift-B)‬']");
		By Bcc = By.name("bcc");
		By Subject = By.name("subjectbox");
		By Body = By.cssSelector("[aria-label='Message Body'][role='textbox']");
		By Send = By.xpath("//div[text()='Send']");
		By sentMails = By.xpath("//a[text()='Sent']");
		
		By ImgInsert = By.cssSelector("[data-tooltip='Insert photo']");
		By Iframe = By.cssSelector("iframe[class='KA-JQ']");
		By WebURL = By.xpath("//div[contains(text(),'Web')]");
		By ImgInput = By.xpath("//label/following-sibling::input");
		By InsertButton = By.xpath("(//div[text()='Insert'])[2]");
		By InboxTab = By.xpath("//a[text()='Inbox']");
		
		By closebtn = By.cssSelector("[aria-label='Save & close']");
		By draftsbtn = By.xpath("//a[text()='Drafts']");
		
		
		public WebElement Sendclosebtn() {
			return(driver.findElement(closebtn));
			}
		public WebElement Senddraftsbtn() {
			return(driver.findElement(draftsbtn));
			}
		public WebElement SendInboxTab() {
			return(driver.findElement(InboxTab));
			}
		public WebElement SendInsertButton() {
			return(driver.findElement(InsertButton));
			}
		public WebElement getImage() {
			return(driver.findElement(ImgInput));
			}
		public WebElement getWebURL() {
			return(driver.findElement(WebURL));
			}
		public WebElement getEmail() {
		return(driver.findElement(email));
		}
		public WebElement sendEmail() {
				return(driver.findElement(emailnext));
		}
		public WebElement getPass() {
			return(driver.findElement(pass));
		}
		public WebElement sendPass() {
			return(driver.findElement(passnext));
		}
		public WebElement getCompose() {
			return(driver.findElement(Compose));
		}
		public WebElement getDialog() {
			return(driver.findElement(dialog));
		}
		public WebElement getTo() {
			return(driver.findElement(To));
		}
		public WebElement getAddcc() {
			return(driver.findElement(Addcc));
		}
		public WebElement getcc() {
			return(driver.findElement(cc));
		}
		public WebElement getAddBcc() {
			return(driver.findElement(AddBcc));
		}
		public WebElement getBcc() {
			return(driver.findElement(Bcc));
		}
		public WebElement getSubject() {
			return(driver.findElement(Subject));
		}
		public WebElement getBody() {
			return(driver.findElement(Body));
		}
		public WebElement SendButton() {
			return(driver.findElement(Send));
		}
		public WebElement SentList() {
			return(driver.findElement(sentMails));
		}
		public WebElement getInsertImg() {
			return(driver.findElement(ImgInsert));
		}
		public WebElement getIframe() {
			return(driver.findElement(Iframe));
		}
		
	}


