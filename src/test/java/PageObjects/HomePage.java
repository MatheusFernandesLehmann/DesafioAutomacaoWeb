package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.browser.Waits;

public class HomePage {

	public WebDriver driver;

	public Waits wait;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		wait = new Waits(driver);

	}

	public WebElement getWelcomeTextLabel() {

		return wait.visibilityOfElement(By.xpath("//div[@class='tamanhodivupl']/h5[@class='orange-text center ']"));

	}

	public WebElement getFormularioButton() {

		return driver.findElement(By.xpath("//div[@class='col s3']/ul/li/a[@class='collapsible-header ']"));

	}

	public WebElement getCriarFormularioButton() {

		return driver.findElement(By.xpath("//div[@class='collapsible-body']/ul/li/a[@href='/users/new']"));
	}
}
