package org.runner;

import org.basecodes.ReportGeneration;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\Adactin.feature", 
glue = "org.stepdefinition", dryRun = false, 
tags = {"@SanityOne" },
plugin = {
		"rerun:src\\test\\resources\\Reports\\failed.txt",
		"junit:src\\test\\resources\\Reports\\Adactin.xml",
		"html:src\\test\\resources\\Reports",
		"json:src\\test\\resources\\Reports\\Adactin.json" })

public class TestRunner {
@AfterClass
public static void afterExecuton() {
	ReportGeneration.convertReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\Adactin.json");

}

}
