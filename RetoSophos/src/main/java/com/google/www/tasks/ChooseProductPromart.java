package com.google.www.tasks;

import com.google.www.userinterfaces.CategorysPromart;
import com.google.www.userinterfaces.PrincipalMenuPromart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ChooseProductPromart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(PrincipalMenuPromart.BANNER, WebElementStateMatchers.isVisible())
                ,Click.on(PrincipalMenuPromart.TODAS_LAS_CATEGORIAS),
                Click.on(CategorysPromart.CATEGORIA.of("3")),
                Click.on(CategorysPromart.ELEMENTO.of("Roperos")),
                WaitUntil.the(CategorysPromart.ELEMENTO_ROPERO,WebElementStateMatchers.isEnabled()),
                Click.on(CategorysPromart.ROPERO.of("Ropero Cali Jacaranda")),
                Click.on(CategorysPromart.BOTON_AGREGAR));
    }
    public static ChooseProductPromart in(){
        return Tasks.instrumented(ChooseProductPromart.class);
    }
}