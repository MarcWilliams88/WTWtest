package Verification;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="test.feature", glue={"Verification"},
monochrome = true,

//REPORTING
plugin = {"pretty", "html:target/HtmlReports", 
"json:target/JSONReports/report.json", 
"junit:target/JunitReports/report.xml"},

//FILTERING BY TAG
tags="@ScenarioBrowser"
)
public class testrunner {

}
