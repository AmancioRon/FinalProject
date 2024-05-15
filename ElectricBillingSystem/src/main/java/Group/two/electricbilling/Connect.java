package group.two.electricbilling;

import java.sql.*;

public class Connect {

    Connection c;
    Statement s;
    Connect() {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=CONVERT_TO_NULL [arth on Default schema]", "arth", "arth123");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
