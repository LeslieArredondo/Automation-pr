package runnersStore;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;


@CucumberOptions(
		features= "src/test/resources/featureFiless",
		glue = {"StepsBuy"})

public class RunnerN1 extends AbstractTestNGCucumberTests{

}
