package lhms;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"lhms.StepDefinitions"},
        features = {"src/test/resources/lhms/feature"}
        )

public class RunCucumberTest {
}


  //      plugin = {"pretty"},
    //    glue = {"stepdefs"},
      //  features = {"src/test/features"})
//features = {"src/test/java/resources/lhms/features"}
