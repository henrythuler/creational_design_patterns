package br.com.creational.factory.apple.factory.factory;

import br.com.creational.factory.apple.factory.model.IPhone;
import br.com.creational.factory.apple.factory.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {
    @Override
    public IPhone createIPhone() {
        return new IPhone11Pro();
    }
}
