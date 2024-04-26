package br.com.creational.abstractfactory.app.service.factory;

import br.com.creational.abstractfactory.app.service.services.CarRestApiService;
import br.com.creational.abstractfactory.app.service.services.CarService;
import br.com.creational.abstractfactory.app.service.services.UserRestApiService;
import br.com.creational.abstractfactory.app.service.services.UserService;

public class RESTServicesAbstractFactory implements ServicesAbstractFactory {
    @Override
    public CarService getCarService() {
        return new CarRestApiService();
    }

    @Override
    public UserService getUserService() {
        return new UserRestApiService();
    }
}
