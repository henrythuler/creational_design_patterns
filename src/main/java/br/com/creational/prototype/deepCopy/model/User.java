package br.com.creational.prototype.deepCopy.model;

public class User implements Cloneable {
    public String name;
    public Integer age;
    public Address address;

    public User(String name, Integer age, Address address) {
        super();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
    }

    //Shallow Copy
    //	@Override
    //	public User clone() throws CloneNotSupportedException {
    //		return (User) super.clone();
    //	}

    //Deep Copy
    @Override
    public User clone() throws CloneNotSupportedException {
        User cloneUser = (User) super.clone();
        //Cloning address object too
        cloneUser.address = (Address) address.clone();
        //Returning a deep copy
        return cloneUser;
    }

}
