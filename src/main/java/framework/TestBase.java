package framework;

import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import framework.Report.Report;
import framework.Utils.FilesOperation;
import framework.browser.DriverManager;
import framework.browser.TypeBrowser;

public class TestBase extends DriverManager {

	private static WebDriver driver;

	private static FilesOperation filesOperation = new FilesOperation();

	public static WebDriver getDriver() {

		driver = getDriver(TypeBrowser.EDGE);
		return driver;

	}

	@BeforeEach
	public void initial() throws IOException {

		String URL = filesOperation.getProperties("url").getProperty("url.index");
		getDriver().get(URL);

	}

	@AfterEach
	public void finish() {

		Report.close();
		quitDriver();

	}

}
