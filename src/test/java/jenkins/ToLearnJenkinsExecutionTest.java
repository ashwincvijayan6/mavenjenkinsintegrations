package jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnJenkinsExecutionTest {
	@Test
	public void execute() {
		Reporter.log("jenkins class executed", true);
	}

}
