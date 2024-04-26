package br.com.creational.factory.apple.factory.factory;

import br.com.creational.factory.apple.factory.model.IPhone;
import br.com.creational.factory.apple.factory.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {
    @Override
    protected IPhone createIPhone() {
        return new IPhone11();
    }
}
