package com.google.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CategorysPromart {
    public static final Target CATEGORIA = Target.the("taking {0} category").
            locatedBy("//li[@class= 'item-dept'][@data-index='{0}']");
    public static final Target  ELEMENTO = Target.the("Choosing a {0} of categorys").
            locatedBy("//*[text()='{0}']");
    public static final Target ROPERO = Target.the("{0}").
            locatedBy("//a[@title='{0}']");
    public static final Target ELEMENTO_ROPERO = Target.the("Element: Roperos").
        locatedBy("//*[@title='Ropero Cali Almendra']//*[@alt='116593']");
    public static final Target BOTON_AGREGAR = Target.the("Button push to the cart").
            locatedBy("//button[@class = 'js-addtocart gh-btn v2 v3']");
    public static final Target MENSAJE_CONFIRMACION = Target.the("Message of confirmation ").
            locatedBy("//*[@class = 'title']");
}
