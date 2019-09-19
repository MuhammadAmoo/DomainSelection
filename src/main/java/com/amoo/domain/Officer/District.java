package com.amoo.domain.Officer;

public class District {

    private String office_location;
    private String municipal_court;

    private District(){}


    private District(Builder builder) {
        this.office_location = builder.office_location;
        this.municipal_court = builder.municipal_court;

    }

    public String getOffice_location() {
        return office_location;
    }

    public String getMunicipal_court() {
        return municipal_court;
    }

    public static class Builder {
        private String office_location;
        private String municipal_court;

        public Builder office_location (String office_location){
            this.office_location = office_location;
            return this;
        }

        public Builder municipal_court (String municipal_court){
            this.municipal_court = municipal_court;
            return this;
        }

        public District build() {
            return new District(this);
        }

    }





    }
