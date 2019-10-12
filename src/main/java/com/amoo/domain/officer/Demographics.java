package com.amoo.domain.officer;

public class Demographics {

    private int age;
    private String gender;

    public Demographics(){}


    public Demographics(Builder builder) {
        this.age = builder.age;
        this.gender = builder.gender;

    }


    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }


    public static class Builder {
        private int age;
        private String gender;

        public Builder age (int age){
            this.age = age;
            return this;
        }

            public Builder gender (String gender){
            this.gender = gender;
            return this;
        }

        public Demographics build() {
            return new Demographics(this);
        }

    }

    }
