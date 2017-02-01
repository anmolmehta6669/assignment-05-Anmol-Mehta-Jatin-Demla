package edu.knoldus

import java.sql.ResultSet

/**
  * Created by knoldus on 1/2/17.
*/

object SelectFormTables {

  def selectFromEmployee():Employee = {
    val statement = DBConnection.connection.createStatement
    val resultSet=statement.executeQuery(s"select * from employee")
    require(resultSet != null)
    Employee(resultSet.getInt("empId"),resultSet.getString("empName"),resultSet.getString("address"),resultSet.getString("phone"),resultSet.getInt("deptId"))
  }

  def selectFromDepartment():Department = {
    val statement = DBConnection.connection.createStatement
    val resultSet=statement.executeQuery(s"select * from department")
    require(resultSet != null)
    Department(resultSet.getInt("deptId"),resultSet.getString("deptName"))
  }

  def selectFromProject():Project = {
    val statement = DBConnection.connection.createStatement
    val resultSet=statement.executeQuery(s"select * from project")
    require(resultSet != null)
    Project(resultSet.getInt("projectId"),resultSet.getString("projectName"),resultSet.getInt("clientId"))
  }

  def selectFromClient():Client = {
    val statement = DBConnection.connection.createStatement
    val resultSet=statement.executeQuery(s"select * from client")
    require(resultSet != null)
    Client(resultSet.getInt("clientId"),resultSet.getString("clientName"),resultSet.getString("address"))
  }

  def selectFromEmployeeProject():EmployeeProject = {
    val statement = DBConnection.connection.createStatement
    val resultSet=statement.executeQuery(s"select * from employeeProject")
    require(resultSet != null)
    EmployeeProject(resultSet.getInt("empId"),resultSet.getInt("projectId"))
  }
}

