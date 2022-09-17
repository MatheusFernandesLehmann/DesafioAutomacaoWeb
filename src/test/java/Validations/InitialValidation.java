package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.InitialPage;
import framework.Report.Report;
import framework.Report.Screenshot;
import framework.browser.Waits;

public class InitialValidation {

	private WebDriver driver;

	private InitialPage initialPage;

	private Waits wait;

	public InitialValidation(WebDriver driver) {

		this.driver = driver;
		initialPage = new InitialPage(driver);
		wait = new Waits(driver);

	}

	public void ValidationFirstPage() {

		try {

			wait.loadElement(initialPage.getAutomacaoWebTitle());
			Assertions.assertTrue(initialPage.getAutomacaoWebTitle().isDisplayed());
			Report.log(Status.PASS, "Página Inicial Acessada com Sucesso", Screenshot.capture(driver));
		} catch (Exception e) {

			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}

	}

}
