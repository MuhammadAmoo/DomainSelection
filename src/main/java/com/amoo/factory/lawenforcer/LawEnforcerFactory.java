package com.amoo.factory.lawenforcer;

import com.amoo.domain.lawenforcer.LawEnforcer;

public class LawEnforcerFactory {

    public static LawEnforcer getLawEnforcer(String name){

        return new LawEnforcer.Builder().name(name).build();

    }
}
