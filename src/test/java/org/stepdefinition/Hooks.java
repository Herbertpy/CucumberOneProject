package org.stepdefinition;

import java.awt.AWTException;

import org.basecodes.BaseCodes;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseCodes {
	
	@Before
	public void beforeScenario() throws AWTException {
		driverLaunch("https://adactinhotelapp.com/");
		maximizeMethod();
		implicitwait(30);

	}
	
	@After
	public void afterScenario(Scenario s) {
		TakesScreenshot st = (TakesScreenshot)driver;
		byte[] screenshotAs = st.getScreenshotAs(OutputType.BYTES);
		s.embed(screenshotAs, "img/png");
		quitDriver();

	}

}
