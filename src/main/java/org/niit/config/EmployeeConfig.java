/*
 * Author Name: Philip Meshach
 * Date: 22-12-2022
 * Praise The Lord
 */
package org.niit.config;

import org.niit.Domin.Department;
import org.niit.Domin.Employee;
import org.springframework.context.annotation.Bean;

public class EmployeeConfig {


    @Bean
    public Employee getDetails(){
        Employee employee = new Employee();
        employee.setEmpName("Meshach");
        employee.setEmpId("12");
        employee.setEmpAddress("Western city");
        return employee;
    }

    @Bean("dept")
    public Department getDeptData(){
        return new Department("Mechanical","12","Production");
    }

    @Bean("dept1")
    public Department getDeptData1(){
        return new Department("AutoMobile","13","Production");
    }
}
