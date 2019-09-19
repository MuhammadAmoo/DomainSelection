package com.amoo.domain.LawEnforcer;

public class LawEnforcer {

    private String name;

    private LawEnforcer(){}

    private LawEnforcer (Builder builder){
        this.name = builder.name;

    }

    public String getName() {
        return name;
    }


    public static class Builder {
        private String name;

        public Builder name(String name)
        {
            this.name = name;
            return this;

        }

        public LawEnforcer build() {
            return new LawEnforcer(this);
        }

    }



    }
