package edu.knoldus

import java.sql.DriverManager

object DBConnection {

  val url = "jdbc:mysql://localhost:3306/anmol"
  val driver = "com.mysql.jdbc.Driver"
  Class.forName(driver)
  val connection = DriverManager.getConnection(url,"root","root")
}
