/*
 * Author Name: Philip Meshach
 * Date: 22-12-2022
 * Praise The Lord
 */
package org.niit.Domin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    private String empName;
    private String empAddress;
    private String empId;

    @Autowired
    @Qualifier("dept1")
    private Department department;

    public Employee() {
    }

    public Employee(String empName, String empAddress, String empId, Department department) {
        this.empName = empName;
        this.empAddress = empAddress;
        this.empId = empId;
        this.department = department;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empAddress='" + empAddress + '\'' +
                ", empId='" + empId + '\'' +
                ", department=" + department +
                '}';
    }
}
