package br.com.creational.factory.apple.halfSimple.factory;

import br.com.creational.factory.apple.halfSimple.model.IPhone;
import br.com.creational.factory.apple.halfSimple.model.IPhone11;
import br.com.creational.factory.apple.halfSimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {
    @Override
    protected IPhone createIPhone(String model) {
        if (model.equals("standard")) {
            return new IPhone11();
        } else {
            return new IPhone11Pro();
        }
    }
}
