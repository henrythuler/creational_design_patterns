package br.com.creational.prototype.functionalCloneBuilder.model;

public class Address implements Cloneable {
    private String street;
    private Integer number;

    public Address(String street, Integer number) {
        super();
        this.street = street;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public Integer getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Address [street=" + street + ", number=" + number + "]";
    }

    @Override
    public Address clone() {
        try {
            Address clone = (Address) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static class Builder {
        private Address address;

        public Builder(Address address) {
            this.address = address.clone();
        }

        public Builder newStreet(String street) {
            this.address.street = street;
            return this;
        }

        public Builder newNumber(Integer number) {
            this.address.number = number;
            return this;
        }

        public Address done() {
            return this.address;
        }

    }

    public static Builder getBuilder(Address a) {
        return new Builder(a);
    }

}
