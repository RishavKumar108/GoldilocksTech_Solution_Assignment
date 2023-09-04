import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 3. Write a program to read value from the DB. The SB scheme is as follows:
// a. Username: root
// b. Password: root
// c. Table name: test
// d. Schema
// i. Emp name varchar 200
// ii. Emp age int 10

// Time using : 30 - 35 min
public class problem3{

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/goldiLocksDB";
        String username = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String query = "SELECT empName, empAge FROM goldiLocksDB";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(query)) {

                while (resultSet.next()) {
                    String eName = resultSet.getString("empName");
                    int eAge = resultSet.getInt("empAge");

                    System.out.println("Employee Name: " + eName + ", Employee Age: " + eAge);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
