package br.com.creational.factory.apple.simpleFactory.factory;

import br.com.creational.factory.apple.simpleFactory.model.*;

public class IPhoneSimpleFactory {

    public IPhone orderIPhone(String generation, String model) {

        IPhone device = null;

        device = createIPhone(generation, model);

        if (device != null) {
            device.getHardware();
            device.assemble();
            device.certificates();
            device.pack();
        }

        return device;

    }

    public IPhone createIPhone(String generation, String model) {

        switch (generation) {

            case "X":
                if (model.equals("standard")) {
                    return new IPhoneX();
                } else if (model.equals("highEnd")) {
                    return new IPhoneXSMax();
                } else {
                    return null;
                }

            case "11":
                if (model.equals("standard")) {
                    return new IPhone11();
                } else if (model.equals("highEnd")) {
                    return new IPhone11Pro();
                } else {
                    return null;
                }

            default:
                return null;
        }

    }

}
