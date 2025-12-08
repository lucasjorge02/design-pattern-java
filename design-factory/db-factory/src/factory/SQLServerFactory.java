package factory;

import db.DB;
import db.SQLServerDB;

public class SQLServerFactory implements DBFactory {
    @Override
    public DB getDatabase() {
        return new SQLServerDB();
    }
}
