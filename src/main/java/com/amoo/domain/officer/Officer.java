package com.amoo.domain.officer;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Officer {


    private String officerFirstName, officerLastName, rank;
    @Id
    private int OfficerId;

    public Officer(){}

    public Officer(Builder builder) {
        this.officerFirstName = builder.officerFirstName;
        this.officerLastName = builder.officerLastName;
        this.rank = builder.rank;
        this.OfficerId = builder.OfficerId;
    }


    public String getOfficerFirstName() {
        return officerFirstName;
    }


    public String getOfficerLastName() {
        return officerLastName;
    }


    public String getRank() {
        return rank;
    }


    public int getOfficerId() {
        return OfficerId;
    }


    public static class Builder {

        private String officerFirstName, officerLastName, rank;
        private int OfficerId;

        public Builder officerFirstName(String officerFirstName) {
            this.officerFirstName = officerFirstName;
            return this;
        }

        public Builder officerLastName(String officerLastName) {
            this.officerLastName = officerLastName;
            return this;
        }

        public Builder rank(String rank){
            this.rank = rank;
            return this;
        }

        public Builder OfficerId(int OfficerId){
            this.OfficerId = OfficerId;
            return this;
        }

        public Officer build() {
            return new Officer(this);
        }


    }


}
