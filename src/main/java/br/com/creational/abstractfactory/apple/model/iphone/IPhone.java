package br.com.creational.abstractfactory.apple.model.iphone;

import br.com.creational.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;

public abstract class IPhone {
    CountryRulesAbstractFactory rules;

    public IPhone(CountryRulesAbstractFactory rules) {
        this.rules = rules;
    }

    public abstract void getHardware();

    public void assemble() {
        System.out.println("Assembling all the hardwares");
    }

    public void certificates() {
        System.out.println(rules.getCertificates().applyCertification());
        System.out.println("Testing all the certificates");
    }

    public void pack() {
        System.out.println(rules.getPacking().pack());
        System.out.println("Packing the device");
    }
}
