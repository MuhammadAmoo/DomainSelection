package com.amoo.domain.driver;

public class Contact_info {

    private long cellNo;
    private String email;

    public Contact_info(){}

    public Contact_info (Builder builder){
        this.cellNo = builder.cellNo;
        this.email = builder.email;

    }


    public long getCellNo() {
        return cellNo;
    }

    public void setCellNo(long cellNo) {
        this.cellNo = cellNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public static class Builder {
        private long cellNo;
        private String email;

        public Builder cellNo (long cellNo){
            this.cellNo = cellNo;
            return this;
        }


        public Builder email (String email){
            this.email = email;
            return this;

        }

        public Contact_info build() {
            return new Contact_info(this);
        }

    }


    }
