package co.com.tcs.retotuya.stepdefinitions;

import co.com.tcs.retotuya.questions.VerificacionProducto;
import co.com.tcs.retotuya.tasks.LogIn;

import co.com.tcs.retotuya.tasks.LogInCarrito;
import co.com.tcs.retotuya.userinterfaces.InicioSesionPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class InicioSesionStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver hisdriver;
    InicioSesionPage page;

    @Before
    public void setup(){
        setTheStage(new OnlineCast());
        theActorCalled("carlos");
    }

    @Given("^soy un usuario de DemoBlaze con credenciales$")
    public void soyUnUsuarioDeDemoBlazeConCredenciales() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com"));
    }

    @When("^ingreso informacion necesaria para iniciar sesion$")
    public void ingresoInformacionNecesariaParaIniciarSesion() {

        theActorInTheSpotlight().attemptsTo(LogIn.logIn());
    }

    @Then("^se realiza el login exitoso$")
    public void seRealizaElLoginExitoso() {
    }
    @Given("^que soy un usuario de DemoBlaze$")
    public void queSoyUnUsuarioDeDemoBlaze() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.demoblaze.com"));
    }

    @When("^agrego un computador al carrito$")
    public void agregoUnComputadorAlCarrito() {
        theActorInTheSpotlight().attemptsTo(LogInCarrito.logInCarrito());
    }

    @When("^ingreso para verificar carrito$")
    public void ingresoParaVerificarCarrito() {
        theActorInTheSpotlight().attemptsTo(LogIn.logIn());
    }

    @Then("^verifico que se encuentre agregado$")
    public void verificoQueSeEncuentreAgregado() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificacionProducto.verificacionProducto(), Matchers.is(true)));
    }
}