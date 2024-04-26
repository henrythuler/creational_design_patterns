package br.com.creational.factory.apple.simpleFactory;

import br.com.creational.factory.apple.simpleFactory.factory.IPhoneSimpleFactory;
import br.com.creational.factory.apple.simpleFactory.model.IPhone;

public class Client {

    public static void main(String[] args) {

        IPhoneSimpleFactory iphoneFactory = new IPhoneSimpleFactory();

        System.out.println("### Ordering an iPhone X");
        IPhone iphoneX = iphoneFactory.orderIPhone("X", "standard");
        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone11Pro = iphoneFactory.orderIPhone("11", "highEnd");

    }
}
