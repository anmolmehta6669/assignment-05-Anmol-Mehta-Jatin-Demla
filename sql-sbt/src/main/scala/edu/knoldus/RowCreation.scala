package edu.knoldus

/**
  * Created by knoldus on 1/2/17.
*/
object RowCreation {
  def createEmployee(id: Int, name: String, address: String, phone: String, deptId: Int): Int = {
    new InsertIntoTables().addEmployee(Employee(id, name, address, phone, deptId))
  }

  def createDepartment(deptId: Int, deptName: String): Int = {
    new InsertIntoTables().addDepartment(Department(deptId, deptName))
  }

  def createProject(projectId: Int, projectName: String, clientId: Int): Int = {
    new InsertIntoTables().addProject(Project(projectId, projectName, clientId))
  }

  def createClient(clientId: Int, name: String, address: String): Int = {
    new InsertIntoTables().addClient(Client(clientId, name, address))
  }

  def createEmployeeProject(empId: Int, projectId: Int): Int = {
    new InsertIntoTables().addEmployeeProject(EmployeeProject(empId, projectId))
  }
}
