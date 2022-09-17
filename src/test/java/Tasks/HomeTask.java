package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.HomePage;
import Validations.GenericValidation;

public class HomeTask {

	private WebDriver driver;

	private HomePage homePage;

	private GenericValidation genericValidation;

	public HomeTask(WebDriver driver) {

		this.driver = driver;
		genericValidation = new GenericValidation(driver);
		homePage = new HomePage(driver);

	}

	public void clicarBotaoFormulario() {
		genericValidation.ValidationFunctionList();
		homePage.getFormularioButton().click();
		homePage.getCriarFormularioButton().click();

	}

}
