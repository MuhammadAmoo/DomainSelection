package com.amoo.domain.driver;

import com.amoo.domain.officer.Officer;

import java.util.Set;

public class Driver {

    private String driverFirstName, driverLastName;
    private int age;
    private String id;
    private String registration_no;

    private Set<Officer> officers;


    private Driver(){}


    private Driver(Builder builder) {
        this.id = builder.id;
        this.age = builder.age;
        this.driverFirstName = builder.driverFirstName;
        this.driverLastName = builder.driverLastName;
        this.registration_no = builder.registration_no;

    }


    public String getDriverFirstName() {
        return driverFirstName;
    }


    public String getDriverLastName() {
        return driverLastName;
    }



    public String getRegistration_no() {
        return registration_no;
    }



    public int getAge() {
        return age;
    }



    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "com.amoo.domain.driver{" +
                "driverFirstName='" + driverFirstName + '\'' +
                ", driverLastName='" + driverLastName + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                ", registration_no=" + registration_no +
                ", officers=" + officers +
                '}';
    }


    public static class Builder {
        private String driverFirstName, driverLastName;
        private int age;
        private String id;
        private String registration_no;


        public Builder id (String id){
            this.id = id;
            return this;
        }

        public Builder driverFirstName( String driverFirstName) {
            this.driverFirstName = driverFirstName;
            return this;
        }

        public Builder registration_no( String registration_no) {
            this.registration_no = registration_no;
            return this;
        }

        public Builder age( int age) {
            this.age = age;
            return this;
        }

        public Builder driverLastName( String driverLastName) {
            this.driverLastName = driverLastName;
            return this;
        }

        public Driver build() {
            return new Driver(this);
        }


    }


    }
