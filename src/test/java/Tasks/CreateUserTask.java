package Tasks;

import org.openqa.selenium.WebDriver;

import PageObjects.CreateUserPage;
import Validations.CreateUserValidation;
import Validations.FinishValidation;
import framework.Utils.FakersGeneration;

public class CreateUserTask {

	private WebDriver driver;

	private CreateUserPage createUserPage;

	private CreateUserValidation createUserValidation;

	private FakersGeneration fakers;

	private FinishValidation finishValidation;

	public CreateUserTask(WebDriver driver) {

		this.driver = driver;
		createUserPage = new CreateUserPage(driver);
		createUserValidation = new CreateUserValidation(driver);
		fakers = new FakersGeneration(driver);
		finishValidation = new FinishValidation(driver);

	}

	public void preencherForm() {
		createUserValidation.ValidationCreateUserMessage();
		createUserPage.getFirstNameTextField().sendKeys(fakers.getFirstName());
		createUserPage.getLastNameTextField().sendKeys(fakers.getLastName());
		createUserPage.getEmailTextField().sendKeys(fakers.getEmail());
		createUserPage.getAddressTextField().sendKeys(fakers.getAddress());
		createUserPage.getUniversityTextField().sendKeys(fakers.getUniversity());
		createUserPage.getProfessionTextField().sendKeys(fakers.getProfession());
		createUserPage.getGenderTextField().sendKeys("unknown");
		createUserPage.getAgeTextField().sendKeys("20");
		createUserPage.getSubmitButton().click();
		finishValidation.ValidationUserCreated();

	}

}