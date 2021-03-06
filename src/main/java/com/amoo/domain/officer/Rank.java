package com.amoo.domain.officer;

public class Rank {

    private String description;

    public Rank(){}

    public Rank(Builder builder) {
        this.description = builder.description;

    }


    public String getDescription() {
        return description;
    }

    public static class Builder {
        private String description;

        public Builder description (String description){
            this.description = description;
            return this;
        }

        public Rank build() {
            return new Rank(this);
        }
    }
    }
