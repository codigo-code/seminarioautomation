package stepdefs;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Banco {

    @Given("el banco nos abra la puerta")
    public void el_banco_nos_abra_la_puerta() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("nos abrieron la puerta");

    }

    @Given("tengan dinero")
    public void tengan_dinero() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("nos abrieron la puerta");
    }

    @When("el dinero sea real")
    public void el_dinero_sea_real() throws Exception {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("nos abrieron la puerta");
    }

    @When("no sea chamuyo")
    public void no_sea_chamuyo() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("nos abrieron la puerta");

    }

    @Then("muchos miles de dolares")
    public void muchos_miles_de_dolares() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("nos abrieron la puerta");
    }

}
