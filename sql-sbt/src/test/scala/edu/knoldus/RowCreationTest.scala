package edu.knoldus

import java.sql.SQLException

import org.scalatest.FunSuite

/**
  * Created by knoldus on 1/2/17.
  */
class RowCreationTest extends FunSuite{
  test("CreateDepartment"){
    assert(RowCreation.createDepartment(102,"Scala Development")==1)
  }
  test("CreateEmployee"){
    intercept[SQLException] {
      assert(RowCreation.createEmployee(102, "Anmol", "Address", "9810101681", 105) == 1)
    }
    assert(RowCreation.createEmployee(102, "Anmol", "Address", "9810101681", 101) == 1)
  }
  test("CreateClient"){
    assert(RowCreation.createClient(102,"Google","USA")==1)
  }
  test("CreateProject"){
    intercept[SQLException] {
      assert(RowCreation.createProject(102,"scalageek",105) == 1)
    }
    assert(RowCreation.createProject(102,"scalageek",101) == 1)
  }
  test("CreateEmployeeProject"){
    intercept[SQLException]{
      assert(RowCreation.createEmployeeProject(105,102)==1)
      assert(RowCreation.createEmployeeProject(102,105)==1)
    }
    assert(RowCreation.createEmployeeProject(102,102)==1)
  }

}
