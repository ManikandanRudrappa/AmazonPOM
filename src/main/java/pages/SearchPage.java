package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.ProjectSpecMethods;

public class SearchPage extends ProjectSpecMethods
{
	public SearchPage enterPhoneName()
	{
		WebElement search=driver.findElementById("twotabsearchtextbox");
		search.sendKeys("iphone 11");
		search.sendKeys(Keys.ENTER);
		return this;
	}
	public AddToCartPage clickPhoneLink()
	{
		driver.findElementByXPath("(//span[text()='Apple iPhone 11 (64GB) - Black'])[1]").click();
		Set<String> winhand = driver.getWindowHandles();
		List<String> winhand1 =new ArrayList(winhand);
		driver.switchTo().window(winhand1.get(1));
		return new AddToCartPage();
	}
	
}
