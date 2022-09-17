package Validations;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import PageObjects.UserListPage;
import framework.Report.Report;
import framework.Report.Screenshot;
import framework.browser.Waits;

public class UserListValidation {

	private WebDriver driver;

	private UserListPage userListPage;

	private Waits wait;

	public UserListValidation(WebDriver driver) {

		this.driver = driver;
		userListPage = new UserListPage(driver);
		wait = new Waits(driver);

	}

	public void ValidationUserListMessage() {

		try {
			String label = userListPage.getUserListLabelText().getText();
			Assertions.assertEquals("Lista de Usuários!!", label);
			Report.log(Status.PASS, "Acessou a lista de usuários com sucesso", Screenshot.captureBase64(driver));
		} catch (Exception e) {

			Report.log(Status.FAIL, e.getMessage(), Screenshot.captureBase64(driver));
		}

	}

}
