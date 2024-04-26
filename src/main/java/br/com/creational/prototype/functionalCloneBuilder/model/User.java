package br.com.creational.prototype.functionalCloneBuilder.model;

public class User implements Cloneable {
    private String name;
    private Integer age;
    private Address address;

    public User(String name, Integer age, Address address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
    }

    @Override
    public User clone() {
        try {
            User clone = (User) super.clone();
            clone.address = (Address) address.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public static class Builder {
        private User user;

        Builder(User user) {
            this.user = user.clone();
        }

        public Builder newName(String name) {
            this.user.name = name;
            return this;
        }

        public Builder newAge(Integer age) {
            this.user.age = age;
            return this;
        }

        public Builder newAddress(Address address) {
            this.user.address = address;
            return this;
        }

        public User done() {
            return user;
        }

    }

    public static Builder getBuilder(User u) {
        return new Builder(u);
    }

}
