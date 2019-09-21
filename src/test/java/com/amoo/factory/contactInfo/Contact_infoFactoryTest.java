package com.amoo.factory.contactInfo;

import com.amoo.domain.driver.Contact_info;
import com.amoo.factory.driver.Contact_infoFactory;
import org.junit.Test;

import static org.junit.Assert.*;

public class Contact_infoFactoryTest {



    @Test
    public void getContact_info() {

        Contact_info contact = Contact_infoFactory.getContact_info("jacobjames@gmail.com", 0712456475);
        System.out.println(contact);
        assertNotNull(contact);


    }
}