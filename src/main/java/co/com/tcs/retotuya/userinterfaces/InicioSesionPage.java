package co.com.tcs.retotuya.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.demoblaze.com")
public class InicioSesionPage extends PageObject {

    public static final Target Log_in= Target.the("LOG IN").
            locatedBy("//a[@id=\"login2\"]");

    public static final Target Nombre_LogIn= Target.the("name login").
            locatedBy("//input[@id=\"loginusername\"]");

    public static final Target Contrasena_LogIn= Target.the("password login").
            locatedBy("//input[@id=\"loginpassword\"]");

    public static final Target Boton_Login= Target.the("login completado").
            locatedBy("//button[@onclick=\"logIn()\"]");
    public static final Target Carrito= Target.the("Carrito").
            locatedBy("//a[@id=\"cartur\"]");
    public static final Target Laptops= Target.the("Laptops").
            locatedBy("//a[contains(text(),'Laptops')]");
    public static final Target MAC_BOOK_PRO= Target.the("MacBookPro").
            locatedBy("(//a[@href=\"prod.html?idp_=15\"])");
    public static final Target Boton_agregar= Target.the("boton de agregar").
            locatedBy("//a[@onclick=\"addToCart(15)\"]");
}