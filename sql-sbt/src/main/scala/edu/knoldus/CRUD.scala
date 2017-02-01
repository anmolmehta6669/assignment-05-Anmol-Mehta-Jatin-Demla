package edu.knoldus

case class Employee(empId:Int, empName:String, address:String, phone:String, deptId:Int)
case class Department(deptId:Int, deptName:String)
case class Project(projectId:Int, projectName:String, clientId:Int)
case class Client(clientId:Int, name:String, address:String)
case class EmployeeProject(empId:Int,projectId:Int)



