package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.InitialPage;
import Validations.InitialValidation;

public class InitialTask {

	private WebDriver driver;

	private InitialPage initialPage;

	private InitialValidation initialValidation;

	public InitialTask(WebDriver driver) {

		this.driver = driver;
		initialPage = new InitialPage(driver);
		initialValidation = new InitialValidation(driver);

	}

	public void clicarBotaoAutomacaoWeb() {

		initialValidation.ValidationFirstPage();
		initialPage.getStartButton().click();

	}
}
