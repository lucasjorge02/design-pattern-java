package db;

public class SQLServerDB implements DB{
    @Override
    public void query(String sql) {
        System.out.println("Buscando " + sql + " no SQL Server Database");
    }

    @Override
    public void update(String sql) {
        System.out.println("Atualizando dados " + sql + " no SQL Server Database");
    }
}
