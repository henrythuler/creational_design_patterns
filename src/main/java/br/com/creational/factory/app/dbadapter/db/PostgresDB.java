package br.com.creational.factory.app.dbadapter.db;

public class PostgresDB implements DB {

    public void query(String sql) {
        System.out.println("Querying " + sql + " in Postgres database");
    }

    public void update(String sql) {
        System.out.println("Uptade query " + sql + " in Postgres database");
    }
}
