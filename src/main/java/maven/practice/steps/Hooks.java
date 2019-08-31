package maven.practice.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.BaseClass;

public class Hooks extends BaseClass{
	@Before
	public void start() {
		BaseClass.setUp();
	}
	
	@After
	public void finish() {
		BaseClass.tearDown();
	}

}
