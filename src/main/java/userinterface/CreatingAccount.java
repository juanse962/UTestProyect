package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CreatingAccount {
    public static final Target FIRST_NAME = Target.the("Escribir nombre")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Escribir segundo nombre")
            .located(By.id("lastName'"));
    public static final Target EMAIL = Target.the("Escribir ")
            .located(By.id("email'"));
    public static final Target BIRTH_MONTH = Target.the("Selecionar mes")
            .located(By.id("birthMonth"));
    public static final Target BIRTH_DAY = Target.the("Selecionar mes")
            .located(By.id("birthDay"));
    public static final Target BIRTH_YEAR = Target.the("Selecionar mes")
            .located(By.id("birthYear"));

}
