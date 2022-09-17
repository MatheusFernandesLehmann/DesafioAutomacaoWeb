package TestCases;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import Tasks.CreateUserTask;
import Tasks.FinishTask;
import Tasks.HomeTask;
import Tasks.InitialTask;
import framework.TestBase;
import framework.Report.Report;
import framework.Report.ReportType;
import framework.Report.Screenshot;

public class RealizarCadastroComSucesso extends TestBase {

	private WebDriver driver = this.getDriver();

	InitialTask initialTask = new InitialTask(driver);
	HomeTask homeTask = new HomeTask(driver);
	CreateUserTask createUserTask = new CreateUserTask(driver);
	FinishTask finishTask = new FinishTask(driver);

	@Test
	public void realizarCadastro() {
		try {
			Report.createTest("Realizar cadastro com Sucesso", ReportType.SINGLE);
			initialTask.clicarBotaoAutomacaoWeb();
			homeTask.clicarBotaoFormulario();
			createUserTask.preencherForm();

		} catch (Exception e) {

			Report.log(Status.FAIL, e.getMessage(), Screenshot.capture(driver));
		}

	}
}
