package db;

public class MySQLDB implements DB{
    @Override
    public void query(String sql) {
        System.out.println("Buscando " + sql + " no MySQL Database");
    }

    @Override
    public void update(String sql) {
        System.out.println("Atualizando dados " + sql + " no MySQL Database");
    }
}