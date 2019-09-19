package com.amoo.domain.Vehicles;

public class Vehicle_manufacturer {

private String manufacturer_code, manufacturer_name;

private Vehicle_manufacturer(){}

    private Vehicle_manufacturer(Vehicle_manufacturer.Builder builder) {
        this.manufacturer_code = builder.manufacturer_code;
        this.manufacturer_name = builder.manufacturer_name;

    }

    public String getManufacturer_code() {
        return manufacturer_code;
    }

    public String getManufacturer_name() {
        return manufacturer_name;
    }

    public static class Builder {
        private String manufacturer_code, manufacturer_name;

        public Vehicle_manufacturer.Builder manufacturer_code(String manufacturer_code){
            this.manufacturer_code = manufacturer_code;
            return this;
        }

        public Vehicle_manufacturer.Builder manufacturer_name(String manufacturer_name){
            this.manufacturer_name = manufacturer_name;
            return this;
        }


        public Vehicle_manufacturer build() {
            return new Vehicle_manufacturer(this);
        }
    }

    }
