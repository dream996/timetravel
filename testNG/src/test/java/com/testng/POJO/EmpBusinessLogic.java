package com.testng.POJO;

public class EmpBusinessLogic {
    /**
     * 计算年薪
     *
     * @param employeeDetails
     * @return
     */
    public double calculateYearlySalary(EmployeeDetails employeeDetails) {
        double yearlySalary = employeeDetails.getMonthlySalary() * 12;
        return yearlySalary;
    }

    /**
     * 考核支付给员工奖金
     * @param employeeDetails
     * @return
     */
    public double calculateAppraisal(EmployeeDetails employeeDetails) {
        double appraisal = 0;
        if (employeeDetails.getMonthlySalary() < 10000) {
            appraisal = 500;
        } else {
            appraisal = 1000;
        }
        return appraisal;
    }
}
