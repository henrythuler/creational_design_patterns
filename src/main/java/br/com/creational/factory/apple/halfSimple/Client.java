package br.com.creational.factory.apple.halfSimple;

import br.com.creational.factory.apple.halfSimple.factory.IPhone11Factory;
import br.com.creational.factory.apple.halfSimple.factory.IPhoneFactory;
import br.com.creational.factory.apple.halfSimple.factory.IPhoneXFactory;
import br.com.creational.factory.apple.halfSimple.model.IPhone;

public class Client {

    public static void main(String[] args) {

        IPhoneFactory iphoneXFactory = new IPhoneXFactory();
        IPhoneFactory iphone11Factory = new IPhone11Factory();

        System.out.println("### Ordering an iPhone X");
        IPhone iphoneX = iphoneXFactory.orderIPhone("standard");

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone11 = iphone11Factory.orderIPhone("highend");

    }
}
