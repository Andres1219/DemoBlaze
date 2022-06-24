package co.com.tcs.retotuya.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src\\test\\resources\\features\\iniciosesion.feature",
        glue = "co.com.tcs.retotuya.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class InicioSesion {
}
