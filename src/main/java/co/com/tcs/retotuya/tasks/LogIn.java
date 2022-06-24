package co.com.tcs.retotuya.tasks;

import co.com.tcs.retotuya.userinterfaces.InicioSesionPage;
import co.com.tcs.retotuya.utils.Constantes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class LogIn implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        String usuario=actor.recall("Usuario");
        actor.attemptsTo(
                Click.on(InicioSesionPage.Log_in),
                Enter.theValue(Constantes.Name).into(InicioSesionPage.Nombre_LogIn),
                Enter.theValue(Constantes.Password).into(InicioSesionPage.Contrasena_LogIn),
                Click.on(InicioSesionPage.Boton_Login)
        );
    }
    public static LogIn logIn(){ return instrumented(LogIn.class);}
}
