package com.autogravity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class creditApplication {

	static WebDriver driver;

	@Test
	public void search() throws InterruptedException {

		// Intialize and launch the chrome browser
		System.setProperty("webdriver.chrome.driver", "library/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		PageObjects pageObject = new PageObjects(driver);

		// Navigate to application
		driver.get("https://www.autogravity.com/");

		// Click on get started button
		driver.findElement(pageObject.getStartedButton()).click();

		Thread.sleep(1500);

		// Get the list the car companies and store in list
		List<WebElement> webelementsCarCompany = new ArrayList<WebElement>();

		webelementsCarCompany = driver.findElements(pageObject.carCompany());

		Thread.sleep(1500);

		// Click randomly on the car company.
		webelementsCarCompany.get(new Random().nextInt(webelementsCarCompany.size())).click();

		Thread.sleep(1500);

		// Get the list the car models and store in list
		List<WebElement> webelementsCarModels = new ArrayList<WebElement>();

		webelementsCarModels = driver.findElements(pageObject.carModel());

		Thread.sleep(1500);

		// Click randomly on the car model.
		webelementsCarModels.get(new Random().nextInt(webelementsCarModels.size())).click();

		Thread.sleep(1500);

		// Enter value in the pop up dialog
		driver.findElement(pageObject.enterCityZip()).sendKeys("california city ca, united states");
		Thread.sleep(1000);
		driver.findElement(pageObject.enterCityZip()).sendKeys(Keys.ARROW_DOWN, Keys.ENTER);

		Thread.sleep(1500);

		// Get the list of loan option and store in list
		List<WebElement> webelementsLoan = new ArrayList<WebElement>();

		webelementsLoan = driver.findElements(pageObject.selectLoan());

		Thread.sleep(1500);

		// Click randomly on the loan amount
		webelementsLoan.get(new Random().nextInt(webelementsLoan.size())).click();

		Thread.sleep(1500);

		// Click on next button to navigate to select dealer page
		driver.findElement(pageObject.nextBtn()).click();

		Thread.sleep(1500);

		// Input the pinode to select the dealer
		driver.findElement(pageObject.inputPincode()).click();
		driver.findElement(pageObject.inputPincode()).sendKeys("92831", Keys.ENTER);

		Thread.sleep(2500);

		// Get the list dealer
		List<WebElement> webelementsDealerShip = new ArrayList<WebElement>();
		webelementsDealerShip = driver.findElements(pageObject.selectDealer());

		Thread.sleep(1500);

		// Click randomly on the loan amount
		webelementsDealerShip.get(0).click();

	}
}
