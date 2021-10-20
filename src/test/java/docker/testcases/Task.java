package docker.testcases;

import base.BaseTest;
import pages.TaskPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(utilities.TestListener.class)
public class Task extends BaseTest {
	@Test(description = "Refresh Task")
	public void refreshTask() throws InterruptedException {
		TaskPage taskPage = page.GetInstance(TaskPage.class);
		taskPage.refreshPage();

	}
}