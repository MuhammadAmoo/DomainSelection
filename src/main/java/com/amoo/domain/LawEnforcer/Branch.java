package com.amoo.domain.LawEnforcer;

public class Branch {

    private  String brnch_code;

    private Branch(){}



    private Branch (Builder builder){
        this.brnch_code = builder.brnch_code;

    }
    public String getBrnch_code() {
        return brnch_code;
    }

    public static class Builder {
        private  String brnch_code;

        public Builder brnch_code (String brnch_code){
            this.brnch_code = brnch_code;
            return this;

        }


        public Branch build()  {
            return new Branch(this);
        }

    }
    }
