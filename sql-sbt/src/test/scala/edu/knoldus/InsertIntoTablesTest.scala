package edu.knoldus

import java.sql.SQLException

import org.scalatest.FunSuite
//import concurrent.Future

/**
  * Created by knoldus on 1/2/17.
  */
class InsertIntoTablesTest extends FunSuite{
  val obj=new InsertIntoTables
  test("insertDepartment"){
    assert(obj.addDepartment(Department(101,"Scala Development"))==1)
  }
  test("insertEmployee"){
    intercept[SQLException] {
      assert(obj.addEmployee(Employee(101, "Anmol", "Address", "9810101681", 105)) == 1)
    }
    assert(obj.addEmployee(Employee(101, "Anmol", "Address", "9810101681", 101)) == 1)
  }
  test("insertClient"){
    assert(obj.addClient(Client(101,"Google","USA"))==1)
  }
  test("insertProject"){
    intercept[SQLException] {
      assert(obj.addProject(Project(101,"scalageek",105)) == 1)
    }
    assert(obj.addProject(Project(101,"scalageek",101)) == 1)
  }
  test("insertEmployeeProject"){
    intercept[SQLException]{
      assert(obj.addEmployeeProject(EmployeeProject(105,101))==1)
      assert(obj.addEmployeeProject(EmployeeProject(101,105))==1)
    }
    assert(obj.addEmployeeProject(EmployeeProject(101,101))==1)
  }

}
