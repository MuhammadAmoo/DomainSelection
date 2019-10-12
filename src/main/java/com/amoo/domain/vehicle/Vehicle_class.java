package com.amoo.domain.vehicle;

public class Vehicle_class {

    private String class_code;

    public Vehicle_class(){}

    public Vehicle_class(Builder builder) {
        this.class_code = builder.class_code;

    }


    public String getClass_code() {
        return class_code;
    }

    public static class Builder {

        private String class_code;


        public Builder class_code(String colour){
            this.class_code = class_code;
            return this;
        }

        public Vehicle_class build() {
            return new Vehicle_class(this);
        }
    }

    }
