package Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Users\\PragatiSharma\\IdeaProjects\\AmazonAddItemToCartTask\\\\src\\test\\java\\FeatureFile\\AmazonTask.feature"},
        glue = {"Stepdefinition"},
        monochrome = true,
        plugin = {"pretty", "json:Report/Cucumber.json", "junit:Report/XMLReport.xml",
                "html:Report/cucumberReport"}
)
class Runner1 {
}

