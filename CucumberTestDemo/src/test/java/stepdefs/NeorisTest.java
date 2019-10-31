package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class NeorisTest {
    @Given("^una persona que vino con muchas ganas de aprender$")
    public void una_persona_que_vino_con_muchas_ganas_de_aprender() throws Exception {
        // Write code here that turns the phrase above into concrete actions
       // Toda la funcionalidad que cumpla con el caso
        System.out.println(" vine con uchas ganas");
    }

    @Given("^pero no tenia tantas ganas$")
    public void pero_no_tenia_tantas_ganas() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        // throw new PendingException();
        System.out.println(" Me di cuenta que las galletas estaban duras");
    }

    @When("^la charla este buena$")
    public void la_charla_este_buena() throws Exception {
        // Write code here that turns the phrase above into concrete actions

        System.out.println(" Si genial uipi!");
    }

    @When("^haya facturas$")
    public void haya_facturas() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        Assert.fail();

    }

    @Then("^nada de eso sucedio$")
    public void nada_de_eso_sucedio() throws Exception {
        // Write code here that turns the phrase above into concrete actions

        System.out.println(" pero habia galletitas diversion");
    }

}
