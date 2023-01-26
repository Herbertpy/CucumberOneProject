package org.basecodes;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportGeneration {
	public static void convertReport(String json) {
		
		// Getting the path
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports");
		// Configuring the Reports and Details
		Configuration config = new Configuration(file, "Adactin");
		config.addClassifications("Platform", "Windows");
		config.addClassifications("Version", "Windows 11");
		config.addClassifications("Sprint", "4.2");
		config.addClassifications("Build No", "AD12234");
		// Announcing a list to add a file 
		List<String> jasonFile = new ArrayList<String>();
		jasonFile.add(json);
		//Generating Reports
		ReportBuilder build = new ReportBuilder(jasonFile, config);
		build.generateReports();
		
	}

}
