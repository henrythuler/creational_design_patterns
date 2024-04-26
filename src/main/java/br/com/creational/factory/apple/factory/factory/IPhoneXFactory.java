package br.com.creational.factory.apple.factory.factory;

import br.com.creational.factory.apple.factory.model.IPhone;
import br.com.creational.factory.apple.factory.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {
    @Override
    public IPhone createIPhone() {
        return new IPhoneX();
    }
}
