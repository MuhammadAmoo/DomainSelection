package com.amoo.domain.Officer;

public class Rank {

    private String description;

    private Rank(){}

    private Rank(Builder builder) {
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
