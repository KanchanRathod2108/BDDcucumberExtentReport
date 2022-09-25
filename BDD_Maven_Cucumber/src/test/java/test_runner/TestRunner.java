package test_runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 

@CucumberOptions(features="src/test/resources/Feature",
                          //here we provide the path of feature file

glue= {"step_defination"}, //glue code means all the code belong to stepdefination //here we have to provide the package name of that stepdefination file
monochrome=true,
//In glue code mention the extact name of your package name.
		//plugin is used to genrate report
plugin={"pretty",//"junit:target/JunitReport/report.xml"

		//,"html:target/HtmlReports",
		
		//"json:target/JSONReports/report/json",})
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
	
//"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
		
		//for extendreport we have added this})//jar particular file run karych asel tr }natr ek comma ani tags la close brakets dych ahe
//tags="@smoketest") //if we want to run specific file then we use tagname of that file
//if we run more tags then only give comma and name of that tag


public class TestRunner {
 //used for grouping
	//test
	
}
//"junit:target/JunitReport/report.xml"

		//,"html:target/HtmlReports",
		
		//"json:target/JSONReports/report/json",
