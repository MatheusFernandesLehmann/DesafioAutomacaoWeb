package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.browser.Waits;

public class CreateUserPage {

	public WebDriver driver;

	public Waits wait;

	public CreateUserPage(WebDriver driver) {

		this.driver = driver;
		wait = new Waits(driver);
	}

	public WebElement getNewUserTextLabel() {

		return wait.visibilityOfElement(By.xpath("//div[@class='tamanhodiv2']/h5[@class='center']"));
	}

	public WebElement getFirstNameTextField() {

		return driver.findElement(By.id("user_name"));
	}

	public WebElement getLastNameTextField() {

		return driver.findElement(By.id("user_lastname"));
	}

	public WebElement getEmailTextField() {

		return driver.findElement(By.id("user_email"));
	}

	public WebElement getAddressTextField() {

		return driver.findElement(By.id("user_address"));
	}

	public WebElement getUniversityTextField() {

		return driver.findElement(By.id("user_university"));
	}

	public WebElement getProfessionTextField() {

		return driver.findElement(By.id("user_profile"));
	}

	public WebElement getGenderTextField() {

		return driver.findElement(By.id("user_gender"));
	}

	public WebElement getAgeTextField() {

		return driver.findElement(By.id("user_age"));
	}

	public WebElement getSubmitButton() {

		return driver.findElement(By.xpath("//div[@class='col s12 center']/div/input[@type='submit']"));
	}
}
