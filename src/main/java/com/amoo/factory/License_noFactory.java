package com.amoo.factory;

import com.amoo.domain.Driver.License_no;

import java.util.Date;


public class License_noFactory {

    public static License_no getLicense_no(long license_no, Date expiryDate){

        return new License_no.Builder().license_no(license_no)
                .expiryDate(expiryDate)
                .build();



    }
}
