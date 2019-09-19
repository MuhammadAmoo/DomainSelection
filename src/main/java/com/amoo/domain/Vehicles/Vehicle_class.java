package com.amoo.domain.Vehicles;

public class Vehicle_class {

    private String class_code;

    private Vehicle_class(){}

    private Vehicle_class(Vehicle_class.Builder builder) {
        this.class_code = builder.class_code;

    }


    public String getClass_code() {
        return class_code;
    }

    public static class Builder {

        private String class_code;


        public Vehicle_class.Builder class_code(String colour){
            this.class_code = class_code;
            return this;
        }

        public Vehicle_class build() {
            return new Vehicle_class(this);
        }
    }

    }
