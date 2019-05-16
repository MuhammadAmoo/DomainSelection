package com.amoo.domain.LawEnforcer;


public class Contact_info {

    private long tel_number;
    private String email;

    private Contact_info(){}

    private Contact_info(Builder builder){
        this.email = builder.email;
        this.tel_number = builder.tel_number;


    }

    public long getTel_number() {
        return tel_number;
    }

    public void setTel_number(long tel_number) {
        this.tel_number = tel_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public static class Builder {
        private long tel_number;
        private String email;

        public Builder tel_number(long tel_number)
        {
            this.tel_number = tel_number;
            return this;

        }

        public Builder email(String email)
        {
            this.email = email;
            return this;

        }

        public Contact_info build() {
            return new Contact_info(this);
        }


    }


}
