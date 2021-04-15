package com.demo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"rerun:target/rerun.txt",
                  "json:target/cucumber.json"},
        glue = "com/demo/step_definitions",
         features = "src/test/resources",
         tags = "@new_feature",
         publish = true,
          dryRun = false


)
public class CucumberRunner {
}
