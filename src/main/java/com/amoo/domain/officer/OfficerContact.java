package com.amoo.domain.officer;

public class OfficerContact {

    private int cellNumber, homeNumber;

    public OfficerContact(){}

    private OfficerContact(Builder builder) {
        this.cellNumber = builder.cellNumber;
        this.homeNumber = builder.homeNumber;

    }


    public int getCellNumber() {
        return cellNumber;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

    public static class Builder {
        private int cellNumber, homeNumber;

        public Builder cellNumber (int cellNumber){
            this.cellNumber = cellNumber;
            return this;
        }

        public Builder homeNumber (int homeNumber){
            this.homeNumber = homeNumber;
            return this;
        }

        public OfficerContact build() {
            return new OfficerContact(this);
        }
    }
    }
