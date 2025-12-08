package factory;

import db.DB;

public interface DBFactory {
    DB getDatabase();
}
