package edu.knoldus

  class InsertIntoTables {
    def addEmployee(employee: Employee):Int = {
      val statement = DBConnection.connection.createStatement
      statement.executeUpdate(s"Insert into employee values(${employee.empId},'${employee.empName}','${employee.address}',${employee.phone},${employee.deptId})")
    }

    def addDepartment(department: Department):Int = {
      val statement = DBConnection.connection.createStatement
      statement.executeUpdate(s"Insert into department values(${department.deptId},'${department.deptName}')")
    }

    def addProject(project: Project):Int = {
      val statement = DBConnection.connection.createStatement
      statement.executeUpdate(s"Insert into project values(${project.projectId},'${project.projectName}',${project.clientId})")
    }

    def addClient(client: Client):Int = {
      val statement = DBConnection.connection.createStatement
      statement.executeUpdate(s"Insert into client values(${client.clientId},'${client.name}','${client.address}')")
    }

    def addEmployeeProject(employeeProject: EmployeeProject):Int = {
      val statement = DBConnection.connection.createStatement
      statement.executeUpdate(s"Insert into employeeProject values(${employeeProject.empId},'${employeeProject.projectId}')")
    }
  }
