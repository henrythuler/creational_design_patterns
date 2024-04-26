package br.com.creational.factory.apple.halfSimple.factory;

import br.com.creational.factory.apple.halfSimple.model.IPhone;
import br.com.creational.factory.apple.halfSimple.model.IPhoneX;
import br.com.creational.factory.apple.halfSimple.model.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {
    @Override
    protected IPhone createIPhone(String model) {
        if (model.equals("standard")) {
            return new IPhoneX();
        } else {
            return new IPhoneXSMax();
        }
    }
}
