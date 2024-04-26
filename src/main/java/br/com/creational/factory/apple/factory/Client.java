package br.com.creational.factory.apple.factory;

import br.com.creational.factory.apple.factory.factory.IPhone11ProFactory;
import br.com.creational.factory.apple.factory.factory.IPhoneXFactory;
import br.com.creational.factory.apple.factory.model.IPhone;

public class Client {

    public static void main(String[] args) {

        System.out.println("### Ordering an iPhone X");
        IPhone iphoneX = new IPhoneXFactory().orderIPhone();
        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone11Pro = new IPhone11ProFactory().orderIPhone();

    }
}
