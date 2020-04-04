package com.google.www.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PrincipalMenuPromart {
    public static final Target BANNER = Target.the("Principal Banner").
            locatedBy("//*[@class = 'content-placeholder-loader']");
    public static final Target TODAS_LAS_CATEGORIAS = Target.the("option to choose category").
            locatedBy("//div[@class = '-category-main vdk']");

}
