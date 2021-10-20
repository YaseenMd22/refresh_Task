package pages;


import org.openqa.selenium.WebDriver;


import base.BasePage;
import base.BaseTest;

public class TaskPage extends BasePage {

	public TaskPage(WebDriver driver) {
		super(driver);
	}
	public void refreshPage() throws InterruptedException {
		int c = Integer.parseInt(BaseTest.prop.getProperty("count"));
		for(int i=1; i<=c; i++) {
			driver.navigate().refresh();
			Thread.sleep(Integer.parseInt(BaseTest.prop.getProperty("timeGap")));
			BasePage.passLog("Refresh count now: "+ i);
		}
		}


}
