package test;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class StartMyQuotePageTest extends BaseClass{
	
	@Test
	public void getMyQuoteTest()throws InterruptedException{
		startMyQuotePage.startMyQuote();
		startMyQuotePage.continueGetQuote();
		startMyQuotePage.inputDateOfBirth();
		startMyQuotePage.inputFirstAndLastName();
		startMyQuotePage.inputAddress();
		startMyQuotePage.selectAutomobileVin();
		startMyQuotePage.enterVinNumber();
		startMyQuotePage.selectBodyType();
		startMyQuotePage.selectPassiveDevice();;
		startMyQuotePage.selectOwnedVehicle();
		startMyQuotePage.selectPrimaryUse();
		startMyQuotePage.selectweekAndInputValue();
		startMyQuotePage.selectAnnualMilegeUsage();
		startMyQuotePage.informationOfAnyOtherAuto();
		startMyQuotePage.selectGenderInSomeMorePage();
		startMyQuotePage.selectMaritalStatusPage();
		startMyQuotePage.enterSocialSecurityPage();
		startMyQuotePage.informationOfRentOrOwnedHomePage();
		startMyQuotePage.informationOfCurrentAutoInsurance();
		startMyQuotePage.selectyearsWithPreviousInsurancePage();
		startMyQuotePage.informationOfPriorInsurancePage();
		startMyQuotePage.informationOfpreviousbodilyInjurePage();
		startMyQuotePage.informationOfDrivingHistoryPage();
		startMyQuotePage.informationOfEducationLevelPage();
		startMyQuotePage.informationOfAnyAffiliationsPage();
		startMyQuotePage.informationOfEmploymentPage();
		startMyQuotePage.informationOfJobDetailPage();
		startMyQuotePage.descriptionOfJobDetaiPage();
		startMyQuotePage.descriptionOfJobDetaiPage();
		startMyQuotePage.informationOfDefensiveDrivingPage();
		startMyQuotePage.descriptionOfAnyotherDriverAndIncidentPage();
		startMyQuotePage.selectSelectionGroupPage();
		startMyQuotePage.choseDriveEasyPage();
		startMyQuotePage.takeMyQoutePage();

}
	}
