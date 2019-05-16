package com.amoo.domain.Driver;

import java.util.Date;

public class License_no {

 private long license_no;
 private Date expiryDate;

 private License_no(){}


 private License_no(Builder builder){
     this.license_no = builder.license_no;
     this.expiryDate = builder.expiryDate;


 }


    public long getLicense_no() {
        return license_no;
    }

    public void setLicense_no(long license_no) {
        this.license_no = license_no;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }


    public static class Builder {

        private long license_no;
        private Date expiryDate;

        public Builder license_no (long license_no){
            this.license_no = license_no;
            return this;

        }

        public Builder expiryDate (Date expiryDate){
            this.expiryDate = expiryDate;
            return this;

        }


        public License_no build() {
            return new License_no(this);
        }

    }


}
