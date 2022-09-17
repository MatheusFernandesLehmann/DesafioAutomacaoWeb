package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.HomePage;
import framework.Report.Report;
import framework.Report.Screenshot;
import framework.browser.Waits;

public class GenericValidation {

	private WebDriver driver;

	private HomePage homePage;

	private Waits wait;

	public GenericValidation(WebDriver driver) {

		this.driver = driver;
		homePage = new HomePage(driver);
		wait = new Waits(driver);

	}

	public void ValidationFunctionList() {

		try {
			wait.loadElement(homePage.getWelcomeTextLabel());
			Assertions.assertTrue(homePage.getWelcomeTextLabel().isDisplayed());
			Report.log(Status.PASS, "Acessou a pagina principal", Screenshot.captureBase64(driver));
		} catch (Exception e) {

			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));

		}

	}

}
