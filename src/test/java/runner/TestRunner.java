package runner;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
                 features = {"src/test/features/DeveloperSiteNavigation.feature"},
                 glue = {"stepdefinitions"},
                 plugin = {"html:target/cucumber-reports"},
                 tags = {"@service_navigation"})
public class TestRunner {
}
