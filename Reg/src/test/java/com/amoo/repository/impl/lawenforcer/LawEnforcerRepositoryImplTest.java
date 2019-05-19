package com.amoo.repository.impl.lawenforcer;

import com.amoo.domain.LawEnforcer.LawEnforcer;
import com.amoo.factory.LawEnforcerFactory;
import com.amoo.repository.Impl.Impl.lawEnforcer.LawEnforcerRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class LawEnforcerRepositoryImplTest {


    LawEnforcerRepositoryImpl law;

    @Before
    public void setUp() throws Exception {
        law = LawEnforcerRepositoryImpl.getLawEnforcer();
    }


    @Test
    public void create(){
        LawEnforcer lawEnforcer = LawEnforcerFactory.getLawEnforcer("Gary");
        law.create(lawEnforcer);
        assertNotNull(law.getAll());
        System.out.println(law.getAll());

    }

    @Test
    public void read() {
        LawEnforcer lawEnforcer = LawEnforcerFactory.getLawEnforcer("Gary");
        law.create(lawEnforcer);
        assertNotNull(law.read("Gary"));
        System.out.println(law.read("Gary"));

    }

    
    @Test
    public void update() {
        LawEnforcer lawEnforcer = LawEnforcerFactory.getLawEnforcer("Gary");
        law.create(lawEnforcer);
        assertNotNull(law.read("Gary"));
        System.out.println(law.getAll());

        LawEnforcer updatelawEnforcer = LawEnforcerFactory.getLawEnforcer("Ntando");
        law.create(updatelawEnforcer);
        assertEquals(updatelawEnforcer, law.read("Ntando"));
        System.out.println(law.getAll());
    }


    @Test
    public void delete() {
        LawEnforcer lawEnforcer = LawEnforcerFactory.getLawEnforcer("Gary");
        law.create(lawEnforcer);
        assertNotNull(law.read("Gary"));

        law.delete("Gary");
        assertNull(law.read("Gary"));
        System.out.println(law.getAll());
    }


}