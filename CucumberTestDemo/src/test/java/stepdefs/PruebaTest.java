package stepdefs;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;


public class PruebaTest {
    @Given("I have a configured Cucumber-JVM project")
    public void iHaveAConfiguredCucumberJVMProject() {

    }

    @Then("I will be able to run connected step definitions")
    public void iWillBeAbleToRunConnectedStepDefinitions() {
        System.out.println("Pdos");
    }

    @When("^I run it within my IDE$")
    public void iRunItWithinMyIDE() {
        System.out.print("hola mundo");
    }

    @Given("^I have a configured \"([^\"]*)\" project$")
    public void iHaveAConfiguredProject(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions

      //  Assert.assertEquals("Cucumber-JVM",arg0);
        if(arg0.equals("Cucumber")){
            System.out.println("es corret");
        }else{
            // sAssert.fail();
        }
    }
}
