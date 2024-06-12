package lesson47;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcApp {
    private static final String CREATE_TABLE = "CREATE TABLE students\n" +
            "(\n" +
            "    id      serial primary key,\n" +
            "    name    varchar(20),\n" +
            "    surname varchar(20),\n" +
            "    age     numeric\n" +
            ");";


    private static final String INSERT_INTO = "INSERT INTO students(name, surname, age) VALUES(?, ?, ?);";


    private static final String SELECT_ALL_STUDENTS = "SELECT * FROM students;";


    public static void main(String[] args) throws SQLException {
        createTable();
        insertStudents();
        selectStudents().forEach(System.out::println);
    }

    private static List<Student> selectStudents() throws SQLException {
        try (final Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "mysecretpassword")) {
            PreparedStatement preparedStatement = conn.prepareStatement(SELECT_ALL_STUDENTS);
            ResultSet resultSet = preparedStatement.executeQuery();
            List<Student> students = new ArrayList<>();
            while (resultSet.next()) {
                long id = resultSet.getLong("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                Student student = new Student(id, name, surname, age);
                students.add(student);
            }
            return students;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void insertStudents() {
        try {
            final Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres",
                    "mysecretpassword");
            PreparedStatement preparedStatement = conn.prepareStatement(INSERT_INTO);
            preparedStatement.setString(1, "Agil");
            preparedStatement.setString(2, "Hasanov");
            preparedStatement.setInt(3, 26);
            int affectedRows = preparedStatement.executeUpdate();
            System.out.println(affectedRows);
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    private static void createTable() {
        try (final Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres",
                "mysecretpassword")) {
            PreparedStatement preparedStatement = conn.prepareStatement(CREATE_TABLE);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
