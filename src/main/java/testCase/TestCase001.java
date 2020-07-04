package testCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecMethods;
import pages.SearchPage;

public class TestCase001 extends ProjectSpecMethods
{
	@BeforeTest
	public void Data()
	{
		FileName = "TestDataSheet";
	}
	
	@Test(dataProvider="sendData")
	public void testcase001(String UserName, String Password)
	{
		new SearchPage()
		.enterPhoneName()
		.clickPhoneLink()
		.clickAddToCart()
		.clickProceedToBuy()
		.enterUserName(UserName)
		.enterPassword(Password)
		.clickDeliverHere()
		.getPhoneName()
		.getPrice();
	}
}