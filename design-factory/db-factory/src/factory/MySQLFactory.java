package factory;

import db.DB;
import db.MySQLDB;

public class MySQLFactory implements DBFactory{
    @Override
    public DB getDatabase() {
        return new MySQLDB();
    }
}
