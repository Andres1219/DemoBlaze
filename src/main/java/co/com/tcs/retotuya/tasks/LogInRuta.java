package co.com.tcs.retotuya.tasks;

import co.com.tcs.retotuya.userinterfaces.InicioSesionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogInRuta implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(InicioSesionPage.Carrito)
        );
    }
    public static LogInRuta logInRuta(){ return instrumented(LogInRuta.class);}
}
