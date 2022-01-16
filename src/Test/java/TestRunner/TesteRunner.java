package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="features",glue ="stepdefinition",tags="@Login"/*,dryRun = true*/
        ,plugin={"pretty","html:Target1/report.html"} )

public class TesteRunner {

}

//if you dont have stepdefinition or undefined ,to know which are all undefined then dry run can be used.