package br.com.creational.factory.app.dbadapter.factory;

import br.com.creational.factory.app.dbadapter.db.DB;
import br.com.creational.factory.app.dbadapter.db.OracleDB;
import br.com.creational.factory.app.dbadapter.db.PostgresDB;

public class DBSimpleFactory implements DBFactory {
    @Override
    public DB getDatabase(String db) {
        if ("oracle".equalsIgnoreCase(db)) {
            return new OracleDB();
        } else if ("postgre".equalsIgnoreCase(db)) {
            return new PostgresDB();
        } else {
            return null;
        }
    }

}
