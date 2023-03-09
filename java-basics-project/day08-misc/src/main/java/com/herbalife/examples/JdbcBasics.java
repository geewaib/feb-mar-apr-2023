package com.herbalife.examples;

import java.sql.*;

public class JdbcBasics {
    public static void main(String[] args) throws SQLException {
        //insertPerson("Ram", "Narain", 32);
        insertPersonUsingPreparedStatement("Joe", "Martin", 35);
        //printAllPersons();
        printAllPersonsWithAgeGt(10);
    }

    /*
    CREATE PROCEDURE `sp_sel_persons_with_age_gt` (in age_param int)
    BEGIN
        select * from persons where age > age_param;
    END

    call sp_sel_persons_with_age_gt(18);
    *
    * */
    private static void printAllPersonsWithAgeGt(int ageParam) throws SQLException {
        //Call stored procedure here
        //call sp_sel_persons_with_age_gt(18);
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Type.GetType("");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
            String query = "{call sp_sel_persons_with_age_gt(?)}";
            CallableStatement callableStatement = connection.prepareCall(query);
            callableStatement.setInt("age_param", ageParam);
            ResultSet rs = callableStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                int age = rs.getInt("age");
                System.out.println(id + ", " + firstName + " " + lastName + ", " + age);
            }
            rs.close();
            callableStatement.close();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
    }

    private static void printAllPersons() throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Type.GetType("");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
            Statement statement = connection.createStatement();
            String query = "select * from persons";
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("first_name");
                String lastName = rs.getString("last_name");
                int age = rs.getInt("age");
                System.out.println(id + ", " + firstName + " " + lastName + ", " + age);
            }
            rs.close();
            statement.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
    }

    private static void insertPersonUsingPreparedStatement(String firstName, String lastName, int age) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Type.GetType("");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
            String query = "insert into persons(first_name, last_name, age) values (?,?,?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setInt(3, age);
            statement.executeUpdate();
            statement.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
    }

    //Load the driver
    //Create connection
    //Create a statement
    //Execute query
    //Close the statement
    //Close the connection
    private static void insertPerson(String firstName, String lastName, int age) throws SQLException {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //Type.GetType("");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/training", "root", "root");
            Statement statement = connection.createStatement();
            String query = "insert into persons(first_name, last_name, age) values('" + firstName + "','" + lastName + "'," + age + ")";
            statement.executeUpdate(query);
            statement.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
    }

}
