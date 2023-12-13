package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='ssp-service-zip']")
	WebElement enterZipCode;
	
	@FindBy(xpath  = "(//input[@type='submit'])[1]")
	WebElement go;
	
	@FindBy(xpath = "(//div[@class='product-checkbox'])[1]")
	WebElement clickCeckboxElement;
	
	//@FindBy(xpath = "//a[text()='Start My Quote']") 	WebElement starMyQuote;
	
	@FindBy(xpath = "//div[@id='bundleModalBtn']/p/a")	WebElement starMyQuote;
	
	
	public void getMyQuote() {
		inputText(enterZipCode, "21244");
		clickElement(go);
		clickElement(clickCeckboxElement);
		scrollIntoViewToTheElement(driver, "arguments[0].scrollIntoView(true);", starMyQuote);
		pause(2);
		clickElement(starMyQuote);
		pause(5);
		
	}
}
