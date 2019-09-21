package com.amoo.domain.vehicle;



public class Vehicle {

    private String registration_no, model, colour;
    private int year_of_manufacturer;


    private  Vehicle(){}

    private Vehicle(Builder builder) {
        this.registration_no = builder.registration_no;
        this.colour = builder.colour;
        this.model = builder.model;
        this.year_of_manufacturer = builder.year_of_manufacturer;

    }

    public String getRegistration_no() {
        return registration_no;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getYear_of_manufacturer() {
        return year_of_manufacturer;
    }


    public static class Builder {

        private String registration_no, model, colour;
        private int year_of_manufacturer;

        public Builder registration_no(String registration_no){
            this.registration_no = registration_no;
            return this;
        }

        public Builder model(String model){
            this.model = model;
            return this;
        }


        public Builder colour(String colour){
            this.colour = colour;
            return this;
        }

        public Builder year_of_manufacturer(int year_of_manufacturer){
            this.year_of_manufacturer = year_of_manufacturer;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }


    }

}
