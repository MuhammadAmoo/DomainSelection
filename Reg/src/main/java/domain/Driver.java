package domain;

import sun.security.provider.certpath.Builder;

import java.util.Set;

public class Driver {

    private String driverFirstName, driverLastName;
    private int age;
    private long id;
    private long registration_no;

    private Set<TrafficOfficer> officers;


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

    public void setDriverFirstName(String driverFirstName) {
        this.driverFirstName = driverFirstName;
    }

    public String getDriverLastName() {
        return driverLastName;
    }


       public void setDriverLastName(String driverLastName) {
        this.driverLastName = driverLastName;
    }

    public long getRegistration_no() {
        return registration_no;
    }

    public void setRegistration_no(long registration_no) {
        this.registration_no = registration_no;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public static class Builder {
        private String driverFirstName, driverLastName;
        private int age;
        private long id;
        private long registration_no;


        public Builder id (long id){
            this.id = id;
            return this;
        }

        public Builder driverFirstName( String driverFirstName) {
            this.driverFirstName = driverFirstName;
            return this;
        }

        public Builder registration_no( long registration_no) {
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
