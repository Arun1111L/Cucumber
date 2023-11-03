package Orange2;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(tags = "@ValidCredentials",features="src\\test\\resources\\feat\\Orange.feature",glue="Orange2",plugin={"pretty","junit:target/Cucumber-reports/Cucumber.junit"})
public class Report_file {
}