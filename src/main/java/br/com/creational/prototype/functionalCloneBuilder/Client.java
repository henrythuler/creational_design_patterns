package br.com.creational.prototype.functionalCloneBuilder;

import br.com.creational.prototype.functionalCloneBuilder.model.Address;
import br.com.creational.prototype.functionalCloneBuilder.model.User;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Address userAddress = new Address("ABC Street", 1000);
        User user = new User("ToClone", 25, userAddress);
        System.out.println(user);
        User clonedUser = User.getBuilder(user).newName("Cloned User").newAddress(Address.getBuilder(userAddress).newStreet("DEF Street").done()).done();
        System.out.println(user);
        System.out.println(clonedUser);
    }
}