package edu.knoldus

import java.sql.{SQLException, ResultSet}

import org.scalatest.FunSuite

/**
  * Created by knoldus on 1/2/17.
  */
object SelectFromTablesTest extends FunSuite{

  test("selectFromEmployee"){
    intercept[SQLException]{
      assert(SelectFormTables.selectFromEmployee==null)
    }
    assert(SelectFormTables.selectFromEmployee==Employee(101, "Anmol", "Address", "9810101681", 105))
  }
  test("selectFromDepartment"){
    intercept[SQLException]{
      assert(SelectFormTables.selectFromDepartment==null)
    }
    assert(SelectFormTables.selectFromDepartment==Department(101,"Scala Development"))
  }
  test("selectFromClient"){
    intercept[SQLException]{
      assert(SelectFormTables.selectFromClient==null)
    }
    assert(SelectFormTables.selectFromClient==Client(101,"Google","USA"))
  }
  test("selectFromProject"){
    intercept[SQLException]{
      assert(SelectFormTables.selectFromProject==null)
    }
    assert(SelectFormTables.selectFromProject==Project(101,"scalageek",101))
  }
  test("selectFromEmployeeProject"){
    intercept[SQLException]{
      assert(SelectFormTables.selectFromEmployeeProject==null)
    }
    assert(SelectFormTables.selectFromEmployeeProject==EmployeeProject(105,101))
  }

}
