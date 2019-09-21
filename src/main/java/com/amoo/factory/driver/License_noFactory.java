package com.amoo.factory.driver;

import com.amoo.domain.driver.License_no;


public class License_noFactory {

    public static License_no getLicense_no(long license_no, String expiryDate){

        return new License_no.Builder().license_no(license_no)
                .expiryDate(expiryDate)
                .build();



    }
}
