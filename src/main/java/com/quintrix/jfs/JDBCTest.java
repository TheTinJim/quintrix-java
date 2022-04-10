package com.quintrix.jfs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {

  public static void main(String[] args) {
    Connection connection = null;
    Statement insertStmt = null;
    Statement selectStmt = null;
    Statement updateStmt = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      connection =
          DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBCDemo", "root", "password");


      insertStmt = connection.createStatement();
      insertStmt.execute(
          "INSERT INTO CHARACTERS (CHARACTERID,NAME,ORIGIN,RATING) VALUES (1,'Mario','Mario',9)");
      insertStmt.execute(
          "INSERT INTO CHARACTERS (CHARACTERID,NAME,ORIGIN,RATING) VALUES (2,'Luigi','Mario',5)");
      insertStmt.execute(
          "INSERT INTO CHARACTERS (CHARACTERID,NAME,ORIGIN,RATING) VALUES (3,'Cloud','Final Fantasy',7)");
      insertStmt.execute(
          "INSERT INTO CHARACTERS (CHARACTERID,NAME,ORIGIN,RATING) VALUES (4,'Sephiroth','Final Fantasy',10)");
      insertStmt.execute(
          "INSERT INTO CHARACTERS (CHARACTERID,NAME,ORIGIN,RATING) VALUES (5,'Sonic','Sonic',9)");


      selectStmt = connection.createStatement();
      ResultSet rs = selectStmt
          .executeQuery("SELECT CHARACTERID,NAME,ORIGIN,RATING FROM CHARACTERS WHERE RATING > 5");
      while (rs.next()) {
        System.out.print(rs.getString(1) + " | "); // First Column
        System.out.print(rs.getString(2) + " | "); // Second Column
        System.out.print(rs.getString(3) + " | "); // Third Column
        System.out.println(rs.getString(4)); // Fourth Column
      }
      System.out.println("");
      updateStmt = connection.createStatement();
      updateStmt.executeUpdate("UPDATE CHARACTERS SET NAME='Tifa' WHERE CHARACTERID=4");
      rs = selectStmt.executeQuery("SELECT CHARACTERID,NAME,ORIGIN,RATING FROM CHARACTERS");
      while (rs.next()) {
        System.out.print(rs.getString(1) + " | "); // First Column
        System.out.print(rs.getString(2) + " | "); // Second Column
        System.out.print(rs.getString(3) + " | "); // Third Column
        System.out.println(rs.getString(4)); // Fourth Column
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        selectStmt.close();
        insertStmt.close();
        updateStmt.close();
        connection.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }

}

