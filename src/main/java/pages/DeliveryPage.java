package pages;

import base.ProjectSpecMethods;

public class DeliveryPage extends ProjectSpecMethods
{
	public FetchDetailsPage clickDeliverHere()
	{
		driver.findElementByXPath("(//a[@class='a-declarative a-button-text '])[1]").click();
		return new FetchDetailsPage();
	}
}
