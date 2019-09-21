package com.amoo.domain.driver;

import java.util.Objects;

public class Address {

    private int address_id, postcode;
    private String area, street;
    private Address(){}

    private Address (Builder builder){
        this.address_id = builder.address_id;
        this.area = builder.area;
        this.street = builder.street;
        this.postcode = builder.postcode;
    }

    public int getAddress() {
        return address_id;
    }

    public void setAddress(int address_id) {
        this.address_id = address_id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public static class Builder {

        private int address_id, postcode;
        private String area, street;

        public Builder address_id (int address_id)
        {
            this.address_id = address_id;
            return this;

        }

        public Builder street (String street)
        {
            this.street = street;
            return this;

        }

        public Builder postcode (int postcode)
        {
            this.postcode = postcode;
            return this;

        }

        public Builder area (String postcode)
        {
            this.area = area;
            return this;

        }

        public Address build() {
            return new Address(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "address_id=" + address_id +
                    ", postcode=" + postcode +
                    ", area='" + area + '\'' +
                    ", street='" + street + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Builder builder = (Builder) o;
            return address_id == builder.address_id &&
                    postcode == builder.postcode &&
                    Objects.equals(area, builder.area) &&
                    Objects.equals(street, builder.street);
        }

        @Override
        public int hashCode() {
            return Objects.hash(address_id, postcode, area, street);
        }
    }
}
