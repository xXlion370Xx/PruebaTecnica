package com.co.demoqa.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/clickAlert.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        glue = "com.co.demoqa.stepsdefinitions")
public class DemoQARunner {
}
