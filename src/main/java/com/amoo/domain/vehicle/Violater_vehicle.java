package com.amoo.domain.vehicle;

public class Violater_vehicle {

    private int violater_id;
    private String licence_number;

    private Violater_vehicle(){}

    private Violater_vehicle(Builder builder) {
        this.violater_id = builder.violater_id;
        this.licence_number = builder.licence_number;

    }


    public int getViolater_id() {
        return violater_id;
    }

    public String getLicence_number() {
        return licence_number;
    }


    public static class Builder {
        private int violater_id;
        private String licence_number;

        public Builder violater_id(int violater_id){
            this.violater_id = violater_id;
            return this;
        }

        public Builder licence_number(String licence_number){
            this.licence_number = licence_number;
            return this;
        }



        public Violater_vehicle build() {
            return new Violater_vehicle(this);
        }
    }

}
