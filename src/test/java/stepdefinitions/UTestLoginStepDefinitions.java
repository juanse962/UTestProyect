package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import task.CreateAccount;
import task.OpenTheBrowser;
import task.Login;

public class UTestLoginStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Brandon quiere logearse en UTest$")
    public void brandonQuiereLogearseEnUTest() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorCalled("Brandom").wasAbleTo(OpenTheBrowser.on());
    }

    @When("^El debera de ingresar sus datos personales$")
    public void elDeberaDeIngresarSusDatosPersonales() {
        // Write code here that turns the phrase above into concrete actions
        OnStage.theActorInTheSpotlight().attemptsTo(Login.the());
        OnStage.theActorInTheSpotlight().attemptsTo(CreateAccount.the());
    }

    @Then("^El debera tener creada su cuenta$")
    public void elDeberaTenerCreadaSuCuenta() {
        // Write code here that turns the phrase above into concrete actions

    }
}
