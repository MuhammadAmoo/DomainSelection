package com.amoo.domain.violation;

public class Violation {

    private int violation_id;
    private String date_violation, time_violation, other_details;

    public Violation(){}


    public Violation(Builder builder) {
        this.violation_id = builder.violation_id;
        this.date_violation = builder.date_violation;
        this.time_violation = builder.time_violation;
        this.other_details = builder.other_details;


    }

    public int getViolation_id() {
        return violation_id;
    }

    public String getDate_violation() {
        return date_violation;
    }

    public String getTime_violation() {
        return time_violation;
    }

    public String getOther_details() {
        return other_details;
    }


    public static class Builder {
        private int violation_id;
        private String date_violation, time_violation, other_details;

        public Builder id (int id){
            this.violation_id = violation_id;
            return this;
        }

        public Builder date_violation (String date_violation){
            this.date_violation = date_violation;
            return this;
        }

        public Builder time_violation (String time_violation){
            this.time_violation = time_violation;
            return this;
        }

        public Builder other_details (String other_details){
            this.other_details = other_details;
            return this;
        }

        public Violation build(){
            return new Violation(this);
        }

    }


}
