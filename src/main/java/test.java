
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IT_School on 04.12.2015.
 */
    public class test {
    private Connection com;
    public test(){
      String url = "jdbc:mysql://localhost/les1";
        String name = "Alex";
        String password = "1199";

        try {

            Connection con = DriverManager.getConnection(url, name, password);
            System.out.println("Connected");
            Statement st = con.createStatement();
            String qwery = "select * from c";
            ResultSet rs = st.executeQuery(qwery);
            printResult(rs);
            System.out.println();


            System.out.println("Disconnected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void printResult(ResultSet rs) throws SQLException {
            String CNum, CName, City;
            int Rating;
        int SNum;
            while (rs.next()) {
                CNum = rs.getString("CNum");
                CName = rs.getString("CName");
                City = rs.getString("City");
                SNum = rs.getInt("SNum");
                Rating = rs.getInt("Rating");

                System.out.println("***********");

                System.out.println("CNum" + CNum);
                System.out.println("CName" + CName);
                System.out.println("City" + City);
                System.out.println("SNum" + SNum);
                System.out.println("Rating" + Rating);

                System.out.println("*******************");
            }
        }

        public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver suc");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
            test a = new test();
        }
    }

