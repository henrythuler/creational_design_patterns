package br.com.creational.abstractfactory.app.service.factory;

import br.com.creational.abstractfactory.app.service.services.CarEJBService;
import br.com.creational.abstractfactory.app.service.services.CarService;
import br.com.creational.abstractfactory.app.service.services.UserEJBService;
import br.com.creational.abstractfactory.app.service.services.UserService;

public class EJBServicesAbstractFactory implements ServicesAbstractFactory {
    @Override
    public CarService getCarService() {
        return new CarEJBService();
    }

    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }
}
