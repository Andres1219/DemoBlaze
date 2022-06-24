package co.com.tcs.retotuya.questions;

import co.com.tcs.retotuya.userinterfaces.Carrito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificacionProducto implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean compare= Carrito.MAC_BOOK_PRO.resolveFor(actor).getText().contains("MacBook Pro");
        return compare;
    }
    public static VerificacionProducto verificacionProducto(){return new VerificacionProducto();}
}
