package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.browser.Waits;

public class UserListPage {

	public WebDriver driver;

	public Waits wait;

	public UserListPage(WebDriver driver) {

		this.driver = driver;
		wait = new Waits(driver);

	}

	public WebElement getUserListLabelText() {

		return wait.visibilityOfElement(By.xpath("//div[@class='tamanhodiv2']/h5[@class='center']"));

	}

	public WebElement getUserListBackButton() {

		return driver.findElement(By.xpath("//div[@class='center']/a[@class='btn red']"));

	}
}
