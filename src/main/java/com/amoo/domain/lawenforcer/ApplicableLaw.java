package com.amoo.domain.lawenforcer;


public class ApplicableLaw {

    private String offense;

    public ApplicableLaw(){}

    public ApplicableLaw (Builder builder){
        this.offense = builder.offense;

    }

    public String getOffense() {
        return offense;
    }


    public static class Builder {
        private String offense;

        public Builder offense (String offense){
            this.offense = offense;
            return this;

        }

        public ApplicableLaw build()  {
            return new ApplicableLaw(this);
        }

    }

    }
