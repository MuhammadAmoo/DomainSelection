package com.amoo.factory;

import com.amoo.domain.Driver.Address;

public class AddressFactory {

public static Address getAddress(String street, String area, int postcode, int address_id){

    return new Address.Builder().street(street)
            .area(area)
            .postcode(postcode)
            .address_id(address_id)
            .build();

}

}
