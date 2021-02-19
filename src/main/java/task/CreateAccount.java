package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterface.CreatingAccount;

public class CreateAccount implements Task {
    public static CreateAccount the() {
        return Tasks.instrumented(CreateAccount.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CreatingAccount.FIRST_NAME),
                Click.on(CreatingAccount.LAST_NAME),
                Click.on(CreatingAccount.EMAIL),
                Click.on(CreatingAccount.EMAIL),
                Click.on(CreatingAccount.EMAIL)

                );
    }
}
