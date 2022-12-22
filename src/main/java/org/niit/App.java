package org.niit;

import org.niit.Domin.Employee;
import org.niit.config.EmployeeConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(EmployeeConfig.class);
        Employee emp = applicationContext.getBean(Employee.class);
        System.out.println("emp = " + emp);
    }
}
