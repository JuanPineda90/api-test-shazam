package com.pineda.interactions;

import net.serenitybdd.screenplay.Tasks;

public class ConsumeService {

    private ConsumeService() {
    }

    public static WithGet withGet(String param){
        return Tasks.instrumented(WithGet.class,param);
    }
}
