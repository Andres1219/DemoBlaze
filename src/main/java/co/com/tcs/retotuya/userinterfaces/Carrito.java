package co.com.tcs.retotuya.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Carrito {
    public static final Target MAC_BOOK_PRO= Target.the("MacBook Pro").
            locatedBy("//a[contains(text(),'MacBook Pro')]");
}