package lesson47;

import java.sql.DriverManager;

public class JdbcApp {
    public static void main(String[] args) {
        DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres")
    }
}
