package base;

import org.openqa.selenium.WebDriver;


import com.relevantcodes.extentreports.LogStatus;

import utilities.ExtentTestManager;

public class BasePage extends PageGenerator {

	public BasePage(WebDriver driver) {
		super(driver);
	}


	// Invoked when Test step is passed
	public static void passLog(String log) {
		ExtentTestManager.getTest().log(LogStatus.PASS, log);
	}

	// Invoked when Test step is passed
	public boolean failLog(String log) {
		ExtentTestManager.getTest().log(LogStatus.FAIL, log);
		throw new RuntimeException();
	}



}
