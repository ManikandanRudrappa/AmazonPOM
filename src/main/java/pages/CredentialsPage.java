package pages;

import base.ProjectSpecMethods;

public class CredentialsPage extends ProjectSpecMethods
{
   public CredentialsPage enterUserName(String UserName)
   {
	   driver.findElementByXPath("//input[@type='email']").sendKeys(UserName);
	   driver.findElementById("continue").click();
		return this;
   }
   public DeliveryPage enterPassword(String Password)
   {
	   driver.findElementByXPath("//input[@type='password']").sendKeys(Password);
	   driver.findElementById("signInSubmit").click();
	   return new DeliveryPage();
   }
}
