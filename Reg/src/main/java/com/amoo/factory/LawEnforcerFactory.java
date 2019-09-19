package com.amoo.factory;

import com.amoo.domain.LawEnforcer.LawEnforcer;

public class LawEnforcerFactory {

    public static LawEnforcer getLawEnforcer(String name){

        return new LawEnforcer.Builder().name(name).build();

    }
}
