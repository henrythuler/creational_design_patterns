package br.com.creational.factory.apple.factory.factory;

import br.com.creational.factory.apple.factory.model.IPhone;
import br.com.creational.factory.apple.factory.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {
    @Override
    public IPhone createIPhone() {
        return new IPhoneXSMax();
    }
}
