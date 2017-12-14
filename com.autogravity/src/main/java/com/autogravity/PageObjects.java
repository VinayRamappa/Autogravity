package com.autogravity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageObjects {

	WebDriver driver;

	public PageObjects(WebDriver driver) {
		this.driver = driver;
	}

	By getStarted = By.xpath("//button[contains(text(),'Get Started')][contains(@class,'home')]");

	By carCompanies = By.xpath("//img[@class='image___1p6Dn']");
	
	By carModels = By.xpath("//img[@class='image___1R4ra']");

	By enterCityOrZip = By.xpath("//input[@placeholder='Enter City or Zip']");

	By loanSelection = By.xpath("//div[@class='trimName___9if8r']");
	
	By nextButtonToSelectDealer = By.xpath("//button[contains(text(),'NEXT')]");
	
	By pincode = By.xpath("//input[@class='input___27f7_']");
	
	By dealer = By.xpath("//div[@itemprop='address']/following-sibling::div//button");

	public By getStartedButton() {
		return getStarted;
	}

	public By carCompany() {
		return carCompanies;
	}
	
	public By carModel() {
		return carModels;
	}
	
	public By enterCityZip() {
		return enterCityOrZip;
	}
	
	public By selectLoan() {
		return loanSelection;
	}
	
	public By nextBtn() {
		return nextButtonToSelectDealer;
	}
	
	public By inputPincode() {
		return pincode;
	}
	
	public By selectDealer() {
		return dealer;
	}
	
}
