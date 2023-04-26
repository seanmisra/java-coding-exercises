package org.example;
import java.sql.*;

public class App {

    static public void main(String... args)  {
        try {
            Connection myConn = DriverManager.getConnection("jdbc:mysql:sampleurl");
            PreparedStatement ps = myConn.prepareStatement("select * from sampleTable where city = ?");
            ps.setString(1, "LA"); // note that indexing starts at 1
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                int nameIndex = rs.findColumn("name");
                int ageIndex = rs.findColumn("age");

                String name = rs.getString(nameIndex);
                int age = rs.getInt(ageIndex);

                // Can then work with retrieved data as needed (Ex: adding it to List data structure)
            }

        } catch (SQLException e) {
            // handle error
        }
    }
}