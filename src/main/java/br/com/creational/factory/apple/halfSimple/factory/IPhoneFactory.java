package br.com.creational.factory.apple.halfSimple.factory;

import br.com.creational.factory.apple.halfSimple.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone orderIPhone(String model) {
        IPhone device = null;

        device = createIPhone(model);

        device.getHardware();
        device.assemble();
        device.certificates();
        device.pack();

        return device;

    }

    protected abstract IPhone createIPhone(String model);

}
