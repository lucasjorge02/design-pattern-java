import db.DB;
import factory.MySQLFactory;

public class Main {
    public static void main(String[] args) {
        DB db = new MySQLFactory().getDatabase();
        db.query("SELECT * FROM table;");
        db.update("UPDATE table SET coluna = valor WHERE condicao;");
    }
}