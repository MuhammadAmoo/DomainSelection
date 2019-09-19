package com.amoo.factory;

import com.amoo.domain.Location.Location;

public class LocationFactory {

    public static Location getLocation(int zip_postcode, int location_id, String city, String suburb, String street){
        return new Location.Builder()
                .city(city)
                .zip_postcode(zip_postcode)
                .location_id(location_id)
                .suburb(suburb)
                .street(street)
                .build();


    }


}
