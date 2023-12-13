package pages;


import static common.CommonActions.buttonEnabled;
import static common.CommonActions.clickElement;
import static common.CommonActions.inputText;
import static common.CommonActions.inputTextThenClickEnter;
import static common.CommonActions.pause;
import static common.CommonActions.validationOfHeader;
import static common.CommonActions.validationOfSubHeader;
import static common.CommonActions.verifyTextOfTheWebElement;

import java.sql.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseUtil.BaseClass;


public class StartMyQuotePage extends BaseClass{
	WebDriver driver;
	
	public StartMyQuotePage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//@FindBy(xpath = "//a[text()='Start My Quote']") 	WebElement starMyQuote;
	
	@FindBy(xpath = "//div[@id='bundleModalBtn']/p/a")	WebElement starMyQuote;
	@FindBy(xpath = "(//h2[@class='modal-headline'])[1]")	WebElement headerOfContinuePage;
	@FindBy(name="POL_ratedZip5") WebElement zipcode;
	@FindBy(xpath = "//strong[contains(text(), 'Want to')]")	WebElement subHeaderOfContinuePage;
	@FindBy(xpath = "(//div[@class='product-checkbox'])[8]") WebElement clickCeckbox;
	@FindBy(xpath = "//input[@data-quote-start] ") WebElement clickContinue;
	@FindBy(xpath = "//h3[contains(text(), 'Let’s')]")	WebElement headerOfAboutYouPage;
	@FindBy(xpath ="//input[contains(@id, 'Id_GiveDate')]") WebElement dateOfBirth;
	@FindBy(xpath ="//button[contains(@id, 'Id_Give')]") WebElement clickNext;
	@FindBy(xpath = "//h3[contains(text(), 'Tell')]")	WebElement headerOfAboutYourselfPage;
	@FindBy(xpath = "//input[contains(@id, 'Id_GiveFirst')]")	WebElement firstName;
	@FindBy(xpath = "//input[contains(@id, 'Id_GiveLast')]")	WebElement lastName;
	@FindBy(xpath ="//button[contains(@id, 'Id_Next')]") WebElement clickNextButton;
	
	
	
	public void startMyQuote() {
		
		//scrollIntoViewToTheElement(driver, "arguments[0].scrollIntoView(true);", starMyQuote);
		buttonEnabled(starMyQuote);
		verifyTextOfTheWebElement(starMyQuote, "Start My Quote");
		clickElement(starMyQuote);
		pause(2);
		
	}
	public void continueGetQuote() {
		validationOfHeader(headerOfContinuePage, "You're getting an auto quote today!");
		inputTextThenClickEnter(zipcode, "21244");
		validationOfSubHeader(subHeaderOfContinuePage, "Want to bundle your policy?");
		pause(2);
		clickElement(clickCeckbox);
		clickElement(clickContinue);
		pause(2);
		
	}
	public void aboutYouselectbirth() {
		//driver.get("https://sales.geico.com/quote");
		//String parentWindow= driver.getWindowHandle();
		//validationOfHeader(headerOfAboutYouPage, "Let’s get started.");
		clickElement(dateOfBirth);
		//Date dtDate = new Date(01, 01, 1987); 
		
		//dateOfBirth.sendKeys(dtDate);
		//inputText(dateOfBirth, "10111987");
		js.executeScript("arguments[0].value = arguments[1];", dateOfBirth, "2000-01-01");
		pause(5);
		
		//clickElement(clickNext);
		
		
	}
	public void inputFirstAndLastName() {
		//driver.get("https://sales.geico.com/quote");
		//String parentWindow= driver.getWindowHandle();
		//Set<String> allWindowHandles = driver.getWindowHandles();
		validationOfHeader(headerOfAboutYourselfPage, "Tell us about yourself.");
		
		inputText(firstName, "Henry");
		inputText(lastName, "Smith");
		
		
		clickElement(clickNextButton);
		pause(2);
		
	}
	


}
