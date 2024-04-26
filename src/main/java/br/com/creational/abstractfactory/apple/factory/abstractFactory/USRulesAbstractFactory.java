package br.com.creational.abstractfactory.apple.factory.abstractFactory;

import br.com.creational.abstractfactory.apple.model.certificate.Certificate;
import br.com.creational.abstractfactory.apple.model.certificate.USCertificate;
import br.com.creational.abstractfactory.apple.model.packing.Packing;
import br.com.creational.abstractfactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {
    @Override
    public Certificate getCertificates() {
        return new USCertificate();
    }

    @Override
    public Packing getPacking() {
        return new USPacking();
    }
}
