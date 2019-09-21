package com.amoo.domain.driver;


public class License_no {

 private long license_no;
 private String expiryString;

 private License_no(){}


 private License_no(Builder builder){
     this.license_no = builder.license_no;
     this.expiryString = builder.expiryDate;


 }


    public long getLicense_no() {
        return license_no;
    }

    public void setLicense_no(long license_no) {
        this.license_no = license_no;
    }

    public String getExpiryDate() {
        return expiryString;
    }

    public void setExpiryDate(String expiryString) {
        this.expiryString = expiryString;
    }


    public static class Builder {

        private long license_no;
        private String expiryDate;

        public Builder license_no (long license_no){
            this.license_no = license_no;
            return this;

        }

        public Builder expiryDate (String expiryDate){
            this.expiryDate = expiryDate;
            return this;

        }


        public License_no build() {
            return new License_no(this);
        }

    }


}
