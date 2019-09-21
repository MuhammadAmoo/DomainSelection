package com.amoo.domain.violation;


public class ExpiredLicense {

    private int id, driver_id;
    private String licence_no;

    private ExpiredLicense(){}

    private ExpiredLicense(Builder builder) {
        this.id = builder.id;
        this.driver_id = builder.driver_id;
        this.licence_no = builder.licence_no;
    }


    public int getId() {
        return id;
    }

    public int getDriver_id() {
        return driver_id;
    }

    public String getLicence_no() {
        return licence_no;
    }

    public static class Builder {
       private int id, driver_id;
       private String licence_no;

        public Builder id (int id){
            this.id = id;
            return this;
        }

        public Builder driver_id (int driver_id){
            this.driver_id = driver_id;
            return this;
        }

        public Builder licence_no (String licence_no){
            this.licence_no = licence_no;
            return this;
        }

        public ExpiredLicense build() {
            return new ExpiredLicense(this);
        }

    }
    }
