package pl.zlapkontakt.ccone_1.ccone_ki1;

import pl.zlapkontakt.ccone_1.ccone_ki1.Entity.Consultant;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DAO {

    private final static String DBURL = "jdbc:mysql://localhost/ccone_ki?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
    private final static String DBUSER = "kowal_ps2";
    private final static String DBPASS = "Bialykon16!";
    private final static String DBDRIVER = "com.mysql.cj.jdbc.Driver";

    //obiekt tworzący połączenie z bazą danych.
    private Connection connection;
    //obiekt pozwalający tworzyć nowe wyrażenia SQL
    private Statement statement;
    //zapytanie SQL
    private String query;


    public void connectToDBAndPutQuery(String query) {
        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName(DBDRIVER);

            //STEP 3: Open a connection
            conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);

            //STEP 4: Execute a query
            stmt = conn.createStatement();
            String sql;
            sql = query;
            stmt.executeUpdate(sql);

            //STEP 5: Extract data from result set
//            while(rs.next()){
//                //Retrieve by column name
//
//                String first = rs.getString("FIRSTNAME");
////                String last = rs.getString("last");
//
//                //Display values
//
//                System.out.println("Imię: " + first);
//
//            }
            //STEP 6: Clean-up environment
//            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

    }

//    public void connectToCloudDBAndPutQuery(String query) {
//        Connection conn = null;
//        Statement stmt = null;
//        try {
//            //STEP 2: Register JDBC driver
//            Class.forName(CLOUDDBDRIVER);
//
//            //STEP 3: Open a connection
//            conn = DriverManager.getConnection(CLOUDDBURL, CLOUDDBUSER, CLOUDDBPASS);
//
//            //STEP 4: Execute a query
//            stmt = conn.createStatement();
//            String sql;
//            sql = query;
//            stmt.executeUpdate(sql);
//
//            //STEP 5: Extract data from result set
////            while(rs.next()){
////                //Retrieve by column name
////
////                String first = rs.getString("FIRSTNAME");
//////                String last = rs.getString("last");
////
////                //Display values
////
////                System.out.println("Imię: " + first);
////
////            }
//            //STEP 6: Clean-up environment
////            rs.close();
//            stmt.close();
//            conn.close();
//        } catch (SQLException se) {
//            //Handle errors for JDBC
//            se.printStackTrace();
//        } catch (Exception e) {
//            //Handle errors for Class.forName
//            e.printStackTrace();
//        } finally {
//            //finally block used to close resources
//            try {
//                if (stmt != null)
//                    stmt.close();
//            } catch (SQLException se2) {
//            }// nothing we can do
//            try {
//                if (conn != null)
//                    conn.close();
//            } catch (SQLException se) {
//                se.printStackTrace();
//            }
//        }
//
//    }

    public static List<Consultant> connectToDbAndGetAllRecordsFromTableAsConsultantList() {
        List<Consultant> consultants = new ArrayList<>();

        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(DBDRIVER);
            conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT * FROM consultants";
//            System.out.println(sql);
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Consultant consultant = new Consultant();
                consultant.setLogin(rs.getString("login"));
                consultant.setPassword(rs.getString("password"));
                consultants.add(consultant);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return consultants;
    }

    public static void addReportToDb(String sentby, String NIP, String company, String contactPersonFname, String contactPersonLname, String tel, String email, String obligationValue, String paydate, String contactDate, String objections, String additionalContent, String document) {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(DBDRIVER);
            conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
            stmt = conn.createStatement();
            String sql;
            sql = "INSERT INTO reports (NIP,company,fname,lname,tel,email,value,doc,due,contactdate,objections,additionalcontent,sentby)VALUES (0,'"
                    + NIP
                    + "','" + company
                    + "','" + email
                    + "','" + contactPersonFname
                    + "','" + contactPersonLname
                    + "','" + tel
                    + "','" + email
                    + "','" + obligationValue
                    + "','" + document
                    + "','" + paydate
                    + "','" + contactDate
                    + "','" + objections
                    + "','" + additionalContent
                    + "','" + sentby
                    + "');";

            ResultSet rs = stmt.executeQuery(sql);
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

    }
}
