package br.com.creational.abstractfactory.apple;

import br.com.creational.abstractfactory.apple.factory.IPhone11Factory;
import br.com.creational.abstractfactory.apple.factory.IPhoneFactory;
import br.com.creational.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.creational.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbstractFactory;
import br.com.creational.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.creational.abstractfactory.apple.factory.abstractFactory.USRulesAbstractFactory;

public class Client {

    public static void main(String[] args) {
        //Creating a brazilian iPhone X factory
        CountryRulesAbstractFactory brazilianRules = new BrazilianRulesAbstractFactory();
        IPhoneFactory iPhoneX = new IPhoneXFactory(brazilianRules);

        //Creating an american iPhone 11 factory
        CountryRulesAbstractFactory americanRules = new USRulesAbstractFactory();
        IPhoneFactory iPhone11 = new IPhone11Factory(americanRules);

        //Ordering a brazilian iPhone XS MAX
        iPhoneX.orderIPhone("highEnd");

        //Ordering a standard american iPhone 11
        iPhone11.orderIPhone("standard");
    }

}
