package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import userinterface.HomePage;

public class OpenTheBrowser implements Task
{
    private HomePage homePage;
    public static OpenTheBrowser on() {
        return Tasks.instrumented(OpenTheBrowser.class);
    }

    @Override
    @Step("{0} Abrir el navegador")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(homePage));
    }
}
