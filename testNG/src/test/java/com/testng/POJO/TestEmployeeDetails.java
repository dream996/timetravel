package com.testng.POJO;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestEmployeeDetails {
    //创建对象
    EmployeeDetails employee = new EmployeeDetails();
    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();

    @Test
    public void testCalculateAppriasal(){
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);
        double appraisal = empBusinessLogic.calculateAppraisal(employee);

        Assert.assertEquals(500,appraisal,0.0,"500");
    }

    @Test
    public void testCalculateYearlySalary(){
        employee.setName("Rajeev");
        employee.setAge(25);
        employee.setMonthlySalary(8000);
        double salary = empBusinessLogic.calculateYearlySalary(employee);
        Assert.assertEquals(9600,salary,0.0,"8000");
    }
}
