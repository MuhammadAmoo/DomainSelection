package com.amoo.factory.license;

import com.amoo.domain.Driver.License_no;
import com.amoo.factory.License_noFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class License_noFactoryTest {


    @Test
    public void getLicense_no() {
        License_no license = License_noFactory.getLicense_no(6645867,"23051997");
        System.out.println(license);
        assertNotNull(license);

    }
}