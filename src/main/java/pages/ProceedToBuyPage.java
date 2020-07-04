package pages;

import base.ProjectSpecMethods;

public class ProceedToBuyPage extends ProjectSpecMethods
{
	public CredentialsPage clickProceedToBuy()
	{
		driver.findElementByXPath("(//a[@class='a-button-text a-text-center'])[1]").click();
		return new CredentialsPage();
	}
}
