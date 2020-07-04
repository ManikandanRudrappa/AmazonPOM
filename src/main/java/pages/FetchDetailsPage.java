package pages;

import base.ProjectSpecMethods;

public class FetchDetailsPage extends ProjectSpecMethods
{
    public FetchDetailsPage getPhoneName()
    {
    	String ProductName = driver.findElementByXPath("//p[text()='Apple iPhone 11 (64GB) - Black']").getText();
		System.out.println("The name of the product you ordered is: "+ProductName);
		return this;	
    }
    public FetchDetailsPage getPrice()
    {
    	String ProdPrice = driver.findElementByXPath("//span[text()='68,300.00']").getText();
		System.out.println("The price of the product you ordered is:"+ProdPrice);
		return this;
    }
}
