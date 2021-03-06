package com.amoo.domain.location;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Location {

    @Id
    private int location_id;
    private String city;
    private int zip_postcode;
    private String suburb;
    private String street;


    public Location(){}

    public Location(Builder builder) {
        this.location_id = builder.location_id;
        this.city = builder.city;
        this.zip_postcode = builder.zip_postcode;
        this.suburb = builder.suburb;
        this.street = builder.street;


    }


    public int getLocation_id() {
        return location_id;
    }



    public String getCity() {
        return city;
    }


    public int getZip_postcode() {
        return zip_postcode;
    }


    public String getSuburb() {
        return suburb;
    }


    public String getStreet() {
        return street;
    }



    public static class Builder {
        private int location_id;
        private String city;
        private int zip_postcode;
        private String suburb;
        private String street;

        public Builder location_id (int location_id){
            this.location_id = location_id;
            return this;
        }

        public Builder city (String city){
            this.city = city;
            return this;
        }

        public Builder zip_postcode (int zip_postcode){
            this.zip_postcode = zip_postcode;
            return this;
        }

        public Builder suburb (String suburb){
            this.suburb = suburb;
            return this;
        }

        public Builder street (String street){
            this.street = street;
            return this;
        }


        public Location build() {
            return new Location(this);
        }

        }


    }
