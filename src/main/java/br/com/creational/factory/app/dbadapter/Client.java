package br.com.creational.factory.app.dbadapter;

import br.com.creational.factory.app.dbadapter.db.DB;
import br.com.creational.factory.app.dbadapter.factory.DBFactory;
import br.com.creational.factory.app.dbadapter.factory.DBSimpleFactory;

public class Client {

    public static void main(String[] args) {
        DBFactory dbFactory = new DBSimpleFactory();
        //Getting an Oracle DB Connection
        DB oracle = dbFactory.getDatabase("oracle");
        oracle.query("INSERT INTO T_TESTE");

        //Getting a PostgreSQL Connection
        DB postgre = dbFactory.getDatabase("postgre");
        postgre.update("UPDATE T_TESTE SET teste = 'testando'");

    }
}
