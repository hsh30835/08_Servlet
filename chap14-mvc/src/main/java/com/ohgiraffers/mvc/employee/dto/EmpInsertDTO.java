package com.ohgiraffers.mvc.employee.dto;

import java.sql.Date;

public class EmpInsertDTO {
    private String empName;
    private String empNo;
    private String email;
    private String phone;
    private String jobCode;
    private int salary;
    private double bonus;
    private String managerId;
    private  java.sql.Date hireDate;
    private String deptCode;
    private String setSalaryLevel;
    private String empId;

    public EmpInsertDTO() {
    }

    public EmpInsertDTO(String empName, String empNo, String email, String phone, String jobCode, int salary, double bonus, String managerId, Date hireDate, String deptCode, String setSalaryLevel, String empId) {
        this.empName = empName;
        this.empNo = empNo;
        this.email = email;
        this.phone = phone;
        this.jobCode = jobCode;
        this.salary = salary;
        this.bonus = bonus;
        this.managerId = managerId;
        this.hireDate = hireDate;
        this.deptCode = deptCode;
        this.setSalaryLevel = setSalaryLevel;
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getJobCode() {
        return jobCode;
    }

    public void setJobCode(String jobCode) {
        this.jobCode = jobCode;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public String getDeptcode() {
        return deptCode;
    }

    public void setDeptcode(String deptcode) {
        this.deptCode = deptcode;
    }

    public String getSetSalaryLevel() {
        return setSalaryLevel;
    }

    public void setSetSalaryLevel(String setSalaryLevel) {
        this.setSalaryLevel = setSalaryLevel;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return "EmpInsertDTO{" +
                "empName='" + empName + '\'' +
                ", empNo='" + empNo + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", jobCode='" + jobCode + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", managerId='" + managerId + '\'' +
                ", hireDate=" + hireDate +
                ", deptCode='" + deptCode + '\'' +
                ", setSalaryLevel='" + setSalaryLevel + '\'' +
                ", empId='" + empId + '\'' +
                '}';
    }
}
