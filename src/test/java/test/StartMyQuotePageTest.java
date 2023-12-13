package test;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class StartMyQuotePageTest extends BaseClass{
	
	@Test
	public void getMyQuoteTest()throws InterruptedException{
		startMyQuotePage.startMyQuote();
		startMyQuotePage.continueGetQuote();
		startMyQuotePage.aboutYouselectbirth();
		//startMyQuotePage.inputFirstAndLastName();

}
	}
