package com.google.www.questions;

import com.google.www.userinterfaces.CategorysPromart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AlertMessage implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(CategorysPromart.MENSAJE_CONFIRMACION).viewedBy(actor).asString();
    }
    public static AlertMessage confirmation(){
        return new AlertMessage();
    }
}
