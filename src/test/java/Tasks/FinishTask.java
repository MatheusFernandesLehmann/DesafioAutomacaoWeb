package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.FinishPage;
import PageObjects.UserListPage;
import Validations.FinishValidation;
import Validations.UserListValidation;

public class FinishTask {

	private WebDriver driver;

	private FinishPage finishPage;

	private UserListPage userListPage;

	private FinishValidation finishValidation;

	private UserListValidation userListValidation;

	public FinishTask(WebDriver driver) {

		this.driver = driver;
		finishPage = new FinishPage(driver);
		userListPage = new UserListPage(driver);
		finishValidation = new FinishValidation(driver);
		userListValidation = new UserListValidation(driver);

	}

	public void finalizarCriacao() {

		finishValidation.ValidationUserCreated();
		finishPage.getBackButton().click();
		userListValidation.ValidationUserListMessage();

	}

	public void fecharListaUsuario() {

		userListValidation.ValidationUserListMessage();
		userListPage.getUserListBackButton().click();

	}

}
