package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.DriverFactory;

public class Hooks {

	 @Before
	    public void setUp() {
	        DriverFactory.getDriver();
	    }

	    @After
	    public void tearDown() throws InterruptedException {
	    	Thread.sleep(5000);
	        DriverFactory.quitDriver();
	    }
	}

