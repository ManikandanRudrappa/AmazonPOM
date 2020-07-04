package pages;

import base.ProjectSpecMethods;

public class AddToCartPage extends ProjectSpecMethods
{
	public ProceedToBuyPage clickAddToCart()
	{
		driver.findElementById("add-to-cart-button").click();
		 return new ProceedToBuyPage();
	}
	
}
