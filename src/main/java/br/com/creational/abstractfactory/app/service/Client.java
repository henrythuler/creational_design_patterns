package br.com.creational.abstractfactory.app.service;

import br.com.creational.abstractfactory.app.service.factory.EJBServicesAbstractFactory;
import br.com.creational.abstractfactory.app.service.factory.RESTServicesAbstractFactory;
import br.com.creational.abstractfactory.app.service.factory.ServicesAbstractFactory;

public class Client {

    public static void main(String[] args) {
        //Saving and updating a car in REST API
        ServicesAbstractFactory rest = new RESTServicesAbstractFactory();
        rest.getCarService().save("Nivus");
        rest.getCarService().update("T-Cross");

        //Saving and deleting an user in EJB
        ServicesAbstractFactory ejb = new EJBServicesAbstractFactory();
        ejb.getUserService().save("Fulano");
        ejb.getUserService().delete(1);
    }
}
