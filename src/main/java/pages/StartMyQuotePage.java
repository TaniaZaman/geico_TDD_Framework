package pages;

import static common.CommonActions.*;
import static utils.UserInformation.*;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baseUtil.BaseClass;

public class StartMyQuotePage extends BaseClass {
	WebDriver driver;

	public StartMyQuotePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	//ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz
	// @FindBy(xpath = "//a[text()='Start My Quote']") WebElement starMyQuote;

	@FindBy(xpath = "//div[@id='bundleModalBtn']/p/a")
	WebElement starMyQuote;
	@FindBy(xpath = "(//h2[@class='modal-headline'])[1]")
	WebElement headerOfContinuePage;
	@FindBy(name = "POL_ratedZip5")
	WebElement zipcode;
	@FindBy(xpath = "//strong[contains(text(), 'Want to')]")
	WebElement subHeaderOfContinuePage;
	@FindBy(xpath = "(//div[@class='product-checkbox'])[8]")
	WebElement clickCeckbox;
	@FindBy(xpath = "//input[@data-quote-start] ")
	WebElement clickContinue;
	@FindBy(xpath = "//h3[contains(text(), 'Let’s')]")
	WebElement headerOfAboutYouPage;
	@FindBy(xpath = "//input[contains(@id, 'Id_GiveDate')]")
	WebElement dateOfBirth;
	@FindBy(xpath = "//button[contains(@id, 'Id_Give')]")
	WebElement clickNext;
	@FindBy(xpath = "//h3[contains(text(), 'Tell')]")
	WebElement headerOfAboutYourselfPage;
	@FindBy(xpath = "//input[contains(@id, 'Id_GiveFirst')]")
	WebElement firstName;
	@FindBy(xpath = "//input[contains(@id, 'Id_GiveLast')]")
	WebElement lastName;
	@FindBy(xpath = "//button[contains(@id, 'Id_Next')]")
	WebElement clickNextButton;
	@FindBy(xpath = "//h3[contains(text(),  'Thanks!')]")
	WebElement headerOfAboutYou3Step;
	@FindBy(xpath = "//input[contains(@id, 'Id_GiveStr')]")
	WebElement addressLine;
	@FindBy(xpath = "//input[contains(@id, 'Id_GiveUnit')]")
	WebElement apartment;
	@FindBy(xpath = "//input[contains(@id, 'Id_GiveZ')]")
	WebElement zipCode;
	@FindBy(xpath = "//h3[contains(text(), 'Entering')]")
	WebElement headerOfAboutYou4thStep;
	@FindBy(xpath = "//span[contains(text(), 'Do')]")
	WebElement verifyText;
	@FindBy(id = "labelForYes")
	WebElement clickRadioButton;
	@FindBy(xpath = "//button[contains(@id, 'Id_YesNo')]")
	WebElement clickNextzRadioButton;
	@FindBy(xpath = "//h3[contains(text(), 'Great!')]")
	WebElement headerOfAboutYou5thStep;
	@FindBy(xpath = "//span[contains(text(), 'Vehicle')]")
	WebElement verifyTextOf5thStep;
	@FindBy(xpath = "//input[contains(@id, 'Id_GiveVin')]")
	WebElement vinNumber;
	@FindBy(xpath = "//span[contains(text(), 'VIN')]")
	WebElement vinErrorMsgUnderTheField;
	@FindBy(xpath = "//strong[contains(text(), 'Invalid')]")
	WebElement vinErrorMsg;
	@FindBy(xpath = "//li[@class='alert-content']")
	WebElement vinAlertContent;
	@FindBy(xpath = "//span[contains(text(), 'Characters ')]")
	WebElement characterSizeVin;
	@FindBy(xpath = "//span[contains(@class, 'vin-countdown-info-c')]")
	WebElement characterSizeCount;
	@FindBy(xpath = "//button[contains(@id, 'Id_GiveVin')]")
	WebElement clickNextInVin;
	@FindBy(xpath = "//button[contains(@id, 'Id_Cancel')]")
	WebElement clickCancelInVin;
	@FindBy(xpath = "//h3[contains(text(), 'Let's')]")
	WebElement headerOfAboutYouBodyType;
	@FindBy(xpath = "//span[contains(text(), 'Body')]")
	WebElement verifyTextOfBodyType;
	@FindBy(id = "labelForUTL4X24D")
	WebElement clickRadioButtonBodyType;
	@FindBy(xpath = "//span[contains(text(), 'Body')]")
	WebElement bodyErrorMsg;
	@FindBy(xpath = "//button[contains(@id, 'Id_GiveBody')]")
	WebElement clickNextInBody;
	@FindBy(xpath = "//select[contains(@id, 'Id_GiveAnti')]")
	WebElement selectPassiveDevice;// select dropdown
	@FindBy(xpath = "//button[contains(@id, 'Id_GiveAnti')]")
	WebElement clickNextPassiveDevice;// select dropdown

	@FindBy(id = "labelForO")
	WebElement clickRadioButtonOwned;
	@FindBy(xpath = "//button[contains(@id, 'Id_GiveVehicle')]")
	WebElement clickNextInOwned;
	
	
	@FindBy(xpath = "//h3[contains(text(), 'Tell')]")
	WebElement headerOfAboutYou7thStep;
	@FindBy(xpath = "//span[contains(text(), 'Primary')]")
	WebElement verifyTextOf7thStep;
	@FindBy(id = "labelForC")
	WebElement clickRadioButtonCommute;
	@FindBy(xpath = "//button[contains(@id, 'Id_GiveVehicle')]")
	WebElement clickNextInCommute;
	@FindBy(xpath = "//h3[contains(text(), 'Let's')]")
	WebElement headerOfAboutYouSelectWeek;
	@FindBy(xpath = "//span[contains(text(), 'Days')]")
	WebElement verifyTextOfSelectWeek;
	@FindBy(xpath = "//select[contains(@id, 'Id_GiveD')]")
	WebElement clickSelectWeek;// select dropdown
	@FindBy(xpath = "//input[contains(@id, 'Id_GiveMile')]")
	WebElement enterValue;
	@FindBy(xpath = "//button[contains(@id, 'Id_Next')]")
	WebElement clickNextInSelectWeek;
	@FindBy(xpath = "//h3[contains(text(), 'Please')]")
	WebElement headerOfAboutYou9thStep;
	@FindBy(xpath = "//span[contains(text(), 'Anti')]")
	WebElement verifyTextOf9thStep;
	@FindBy(xpath = "//h3[contains(text(), 'More')]")
	WebElement headerOfAboutYouAnnualMilege;
	@FindBy(xpath = "//select[contains(@id, 'Id_GiveAnnu')]")
	WebElement selectAnnualMilege;// select dropdown
	//12,001-15,000
	@FindBy(xpath = "//button[contains(@id, 'Id_GiveAnnu')]")
	WebElement clickNextAnnualMilege;
	@FindBy(xpath = "//h3[contains(text(), 'Any')]")
	WebElement headerOfAboutYouAnyOtherAuto;
	@FindBy(xpath = "//button[contains(@id, 'Id_Continue')]")
	WebElement clickNextAnotherAuto;
	@FindBy(xpath = "//h3[contains(text(), 'More')]")
	WebElement headerOfAboutYouSomeMore;
	@FindBy(xpath = "//select[contains(@id, 'Id_GiveGender')]")
	WebElement selectGender;// select dropdown
	//Female
	@FindBy(xpath = "//button[contains(@id, 'Id_ComboActivity')]")
	WebElement clickNextInGender;
//	@FindBy(xpath = "//button[contains(@id, 'Id_ComboActivity')]")
//	WebElement clickAgreeAndContinue;
	@FindBy(xpath = "//select[contains(@id, 'Id_GiveMaritalStatus')]")
	WebElement selectMaritalStatus;// select dropdown
	@FindBy(xpath = "//button[contains(@id, 'Id_GiveMaritalStatus')]")
	WebElement clickNextMaritalStatusPage;
	
	
	@FindBy(xpath = "//input[contains(@id, 'Id_GiveSocialSecurity')]")
	WebElement enterSocialSecurity;
	@FindBy(xpath = "//button[contains(@id, 'Id_Next')]")
	WebElement clickNextInMaritalStatus;
	
	@FindBy(id = "labelForO")
	WebElement clickRadioButtonOwn;
	@FindBy(xpath = "//button[contains(@id, 'Id_GiveOwnOrRent')]")
	WebElement clickNextInRentOrOwn;
	
	@FindBy(id = "labelForR")
	WebElement clickRadioButtonRanOut;
	@FindBy(xpath = "//button[contains(@id, 'Id_GiveCurrentAutoInsuranceStatus')]")
	WebElement clickNextCurrentAutoInsurance;
	
	
	@FindBy(xpath = "//select[contains(@id, 'Id_GiveYearsWithPrevious')]")
	WebElement selectyearsWithPreviousInsurance;// select dropdown
	@FindBy(xpath = "//button[contains(@id, 'Id_GiveYearsWith')]")
	WebElement clickNextyearsWithPreviousInsurance;
	
	@FindBy(id = "labelForY")
	WebElement clickRadioButtonYes;
	@FindBy(xpath = "//button[contains(@id, 'Id_Next')]")
	WebElement clickNextInPriorInsurance;
	
	@FindBy(xpath = "//select[contains(@id, 'Id_GivePreviousBodily')]")
	WebElement selectyearsLimitsPreviousBodilyInjure;// select dropdown
	
	@FindBy(xpath = "//button[contains(@id, 'Id_GivePreviousB')]")
	WebElement clickNextInPreviousBodilyInjured;
	
	
	@FindBy(xpath = "//input[contains(@id, 'Id_GiveAgeFirstLicensed')]")
	WebElement enterLicenseAged;
	@FindBy(xpath = "//button[contains(@id, 'Id_GiveAgeFirstLicens')]")
	WebElement clickNextLicensedAge;
	
//	@FindBy(xpath = "//select[contains(@id, 'Id_MonthYearAgeFirst')]")
//	WebElement selectFirstLicensed;// select dropdown
//	
//	@FindBy(xpath = "//button[contains(@id, 'Id_MonthYearAge')]")
//	WebElement clickNextFirstLicensedAge;
//	
	@FindBy(xpath = "//select[contains(@id, 'Id_GiveEducationLeve')]")
	WebElement selectEducationLevel;// select dropdown
	@FindBy(xpath = "//button[contains(@id, 'Id_GiveEducationLevel')]")
	WebElement clickNextEducationLevel;
	@FindBy(xpath = "//button[contains(@id, 'Id_GiveGovernment')]")
	WebElement clickNextGovernmentMilitary;
	@FindBy(xpath = "//select[contains(@id, 'Id_GiveEmploymentStatus')]")
	WebElement selectGiveEmploymentStatus;// select dropdown
	// A Private Company/Organization or Self Employed
	@FindBy(xpath = "//button[contains(@id, 'Id_GiveEmploymentStatus')]")
	WebElement clickNextEmployementStatus;
	
	@FindBy(xpath = "//select[contains(@id, 'Id_GiveIndustry')]")
	WebElement selectGiveIndustry;// select dropdown
	// Computers
	@FindBy(xpath = "//button[contains(@id, 'Id_Next')]")
	WebElement clickNextIndustry;
	@FindBy(xpath = "//select[contains(@id, 'Id_GiveOccupation')]")
	WebElement selectGiveIndustryOccupation;// select dropdown
	// Clerk
	@FindBy(xpath = "//button[contains(@id, 'Id_GiveOccupation')]")
	WebElement clickNextIndustryOccupation;
	
	
	@FindBy(id = "labelForNo")
	WebElement clickRadioButtonNo;
	@FindBy(xpath = "//button[contains(@id, 'Id_YesNoDefensive')]")
	WebElement clickNextDefensiveDriving;
	@FindBy(xpath = "//button[contains(@id, 'Id_Continue')]")
	WebElement clickNextAnyOtherDriver;
	@FindBy(xpath = "//button[contains(@id, 'Id_Continue')]")
	WebElement clickNextInIncidents;
	
	
	//@FindBy(xpath = "//span[contains(@id, 'select2')]")
	//WebElement selectSelectionGroup;// select dropdown
	// Not a member of any of these organizations
	@FindBy(xpath = "//button[contains(@id, 'Id_Next')]")
	WebElement clickNextInSelectionGroup;
	
	@FindBy(id = "labelForNo")
	WebElement clickRadioButtonMaybe;
	@FindBy(xpath = "//button[contains(@id, 'Id_Next')]")
	WebElement clickNextInDriveEasy;
	
	@FindBy(xpath = "//input[contains(@id, 'Id_GiveEmail')]")
	WebElement enterEmail;
	@FindBy(xpath = "//button[contains(@id, 'Id_ComboActivity')]")
	WebElement clickTakeMeToMyQoute;
	//Let's talk more about your 2014 Jeep Grand Cherokee Limited.
	//Please select which type of anti-theft device your 2014 Jeep Grand Cherokee has.
	//And a few more details.
	//Tell us about how you drive your 2014 Jeep Grand Cherokee.
	//Let's get some details on your commute.
	//More about your 2014 Jeep Grand Cherokee.
	//Feel free to make corrections below:
	//Any other automobile(s)?
	//Some more info we'll need.

	// Just a few more details.
	// Got it!
	// Tell us a bit about your current insurance.
	// How many years were you insured with your previous insurance company?
	// Prior Insurance
	// What were your previous bodily injury limits?
	// Tell us about your driving history.
	// Tell us the highest level of education that you've completed.
	// Tell us how you spend your day.
	// We'll need a few more details\]
	// Let us know what best describes your job.
	// Next Up, Defensive Driver Courses
	// Any other drivers?
	// Now, let's talk discounts!
	// 1C4RJEBM9EC304838

	public void startMyQuote() {

		// scrollIntoViewToTheElement(driver, "arguments[0].scrollIntoView(true);",
		// starMyQuote);
		elementEnabled(starMyQuote);
		verifyTextOfTheWebElement(starMyQuote, "Start My Quote");
		clickElement(starMyQuote);
		pause(2);

	}

	public void continueGetQuote() {
		validationOfHeader(headerOfContinuePage, "You're getting an auto quote today!");
		inputTextThenClickEnter(zipcode, "11432");
		validationOfSubHeader(subHeaderOfContinuePage, "Want to bundle your policy?");
		pause(2);
		clickElement(clickCeckbox);
		clickElement(clickContinue);
		pause(2);

	}

	public void inputDateOfBirth() {

		validationOfHeader(headerOfAboutYouPage, "Let’s get started.");

		inputText(dateOfBirth, "10/18/1973");

		 clickElement(clickNext);
		 pause(2);

	}

	public void inputFirstAndLastName() {

		validationOfHeader(headerOfAboutYourselfPage, "Tell us about yourself.");


		inputText(firstName,configuration.getProperties(FIRST_NAME));
		inputText(lastName, configuration.getProperties(LAST_NAME));

		clickElement(clickNextButton);
		pause(2);

	}

	public void inputAddress() {
		validationOfHeader(headerOfAboutYou3Step, "Thanks! Now, what's your address?");
		inputText(addressLine, "8720 175th street");
		inputText(apartment, "1A");

		clickElement(clickNextButton);
		pause(2);
	}

	public void selectAutomobileVin() {
		// validationOfHeader(headerOfAboutYou4thStep, "Entering your VIN helps you get
		// a more accurate quote.");
		// verifyTextOfTheWebElement(verifyText, "Do you have your automobile VIN?");
		clickElement(clickRadioButton);
		clickElement(clickNextzRadioButton);
		pause(2);
	}

	public void enterVinNumber() {
		// validationOfHeader(headerOfAboutYou5thStep, null);
		// verifyTextOfTheWebElement(verifyTextOf5thStep, null);
		// verifyLengthOfTheFieldContent(characterSizeCount, "17");
		//inputText(vinNumber, "");
		//clickElement(clickNextInVin);
//		pause(2);
//		verifyErrorMsgUnderTheField(vinErrorMsgUnderTheField, "VIN is Required");
//		inputText(vinNumber, "1FAFP44472F1248");
//		clickElement(clickNextInVin);
//		pause(2);
//		verifyErrorMsg(vinErrorMsg, "Invalid Vehicle Identification Number");
		inputText(vinNumber, "1C4RJEBM9EC304838");
		clickElement(clickNextInVin);
		pause(2);

	}

	public void selectBodyType() {

		//validationOfHeader(headerOfAboutYouBodyType, null);
		clickElement(clickRadioButtonBodyType);
		clickElement(clickNextInBody);
		pause(3);

	}

	public void selectPassiveDevice() {
		selectDropdown(selectPassiveDevice, "Passive Device");
		clickElement(clickNextPassiveDevice);
		pause(2);

	}

	public void selectOwnedVehicle() {
		clickElement(clickRadioButtonOwned);
		clickElement(clickNextInOwned);
		pause(2);

	}

	public void selectPrimaryUse() {
		clickElement(clickRadioButtonCommute);
		clickElement(clickNextInCommute);
		pause(2);

	}

	public void selectweekAndInputValue() {
		selectDropdown(clickSelectWeek,"5");
		inputText(enterValue, "20");
		clickElement(clickNextInSelectWeek);
		pause(2);

	}
	public void selectAnnualMilegeUsage() {
		//selectDropdown(selectAnnualMilege,"12,001-15,000");
		clickElement(clickNextAnnualMilege);
		pause(2);
		
	}
	public void informationOfAnyOtherAuto() {
		clickElement(clickNextAnotherAuto);
		pause(2);
		
	}
	
	public void selectGenderInSomeMorePage() {
		selectDropdown(selectGender, "Female");
		clickElement(clickNextInGender);
		pause(2);
	}
	public void selectMaritalStatusPage() {
		selectDropdown(selectMaritalStatus, "Single");
//		clickElement(enterSocialSecurity);
//		inputText(enterSocialSecurity, "446447768");
		clickElement(clickNextInMaritalStatus);
		
		pause(2);
	}
	public void enterSocialSecurityPage() {
		
		clickElement(enterSocialSecurity);
		inputText(enterSocialSecurity, "446447768");
		clickElement(clickNextInMaritalStatus);
		pause(2);
	}
	
	public void informationOfRentOrOwnedHomePage() {
		clickElement(clickRadioButtonOwn);
		clickElement(clickNextInRentOrOwn);
		pause(2);
	}
	
	public void informationOfCurrentAutoInsurance() {
		clickElement(clickRadioButtonRanOut);
		clickElement(clickNextCurrentAutoInsurance);
		pause(2);
	}
	public void selectyearsWithPreviousInsurancePage() {
		selectDropdown(selectyearsWithPreviousInsurance, "11 or more");
		clickElement(clickNextyearsWithPreviousInsurance);
		pause(2);
	}
	public void informationOfPriorInsurancePage() {
		clickElement(clickRadioButtonYes);
		clickElement(clickNextInPriorInsurance);
		pause(2);
	}
	public void informationOfpreviousbodilyInjurePage() {
		selectDropdown(selectyearsLimitsPreviousBodilyInjure, "Not Sure");
		clickElement(clickNextInPreviousBodilyInjured );
		pause(2);
	}
	public void informationOfDrivingHistoryPage() {
		inputText(enterLicenseAged,"38");
		clickElement(clickNextLicensedAge);
		pause(2);
	}
//	public void informationOfFirstDrivingHistoryPage() {
//		selectDropdown(selectFirstLicensed, "");;
//		clickElement(clickNextLicensedAge);
//		pause(2);
//	}
	
	public void informationOfEducationLevelPage() {
		selectDropdown(selectEducationLevel,"High School");
		clickElement(clickNextEducationLevel);
		pause(2);
	}
	public void informationOfAnyAffiliationsPage() {
		clickElement(clickNextGovernmentMilitary);
		pause(2);
	}
	
	public void informationOfEmploymentPage() {
		selectDropdown(selectGiveEmploymentStatus,"A Private Company/Organization or Self Employed");
		clickElement(clickNextEmployementStatus);
		pause(2);
	}
	
	public void informationOfJobDetailPage() {
		selectDropdown(selectGiveIndustry,"Computers");
		clickElement(clickNextIndustry);
		pause(2);
	}
	
	
	
	
	public void descriptionOfJobDetaiPage() {
		selectDropdown(selectGiveIndustryOccupation,"Clerk");
		clickElement(clickNextIndustryOccupation);
		pause(2);
	}
	
	
	public void informationOfDefensiveDrivingPage() {
		clickElement(clickRadioButtonNo);
		clickElement(clickNextDefensiveDriving);
		pause(2);
	}
	
	
	
	public void descriptionOfAnyotherDriverAndIncidentPage() {
		clickElement(clickNextAnyOtherDriver);
		pause(2);
		clickElement(clickNextInIncidents);
		pause(2);
	}
	
	
	public void selectSelectionGroupPage() {
		//selectDropdown(selectSelectionGroup, "Not a member of any of these organizations");
		clickElement(clickNextInSelectionGroup);
		pause(2);
	}
	
	
	public void choseDriveEasyPage() {
		clickElement(clickRadioButtonMaybe);
		clickElement(clickNextInDriveEasy);
		pause(2);
	}
	
	
	public void takeMyQoutePage() {
		inputText(enterEmail, "jarinabibi18@gmail.com");
		clickElement(clickTakeMeToMyQoute);
		pause(2);
	}
	

}
