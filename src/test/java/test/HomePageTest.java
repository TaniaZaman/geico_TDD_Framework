package test;


import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass{
	
	@Test
	
	public void getMyQuoteTest() throws InterruptedException {
		homePage.getMyQuote();

		
	}

}
