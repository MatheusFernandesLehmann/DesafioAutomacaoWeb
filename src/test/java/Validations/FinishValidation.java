package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.FinishPage;
import framework.Report.Report;
import framework.Report.Screenshot;
import framework.browser.Waits;

public class FinishValidation {

	private WebDriver driver;

	private FinishPage finishPage;

	private Waits wait;

	public FinishValidation(WebDriver driver) {

		this.driver = driver;
		finishPage = new FinishPage(driver);
		wait = new Waits(driver);
	}

	public void ValidationUserCreated() {

		try {
			String label = finishPage.getUsuarioCriadoSucessoLabelText().getText();
			Assertions.assertEquals("Usuário Criado com sucesso", label);
			Report.log(Status.PASS, "Usuário Criado com sucesso", Screenshot.captureBase64(driver));
		} catch (Exception e) {

			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}

	}
}
