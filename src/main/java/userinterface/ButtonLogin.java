package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ButtonLogin {
    public static final Target BUTTON_JOIN = Target.the("Iniciar Login")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

}
