/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author S542406
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Employee e1 = new Employee(102,"Mani",100000);
        Employee e2 = new Employee(101,"Sai",200000);
        Employee e3 = new Employee(108,"Deep",300000);
        Employee e4 = new Employee(104,"Allu",400000);
        Employee e5 = new Employee(103,"Manideep",500000);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        
        System.out.println("After sorting is ascending order using empId");
        Collections.sort(employees);  
        for(Employee emp:employees)
        {  
	    System.out.println(emp.toString());
	} 
        
        
        System.out.println("After sorting using empSalary");
        Collections.sort(employees,new Comparator<Employee>()
        {
            public int compare(Employee arg0, Employee arg1) 
            {
                return Double.compare(arg0.getEmpSalary(), arg1.getEmpSalary());
	    }
        });
        for(Employee emp:employees)
        {  
	    System.out.println(emp.toString());
	}  
        
        System.out.println("After sorting using empSalary");
        Collections.sort(employees,new Comparator<Employee>()
        {
            public int compare(Employee arg0, Employee arg1) 
            {
               return arg0.getEmpName().compareTo(arg1.getEmpName());
            }
        });
        for(Employee emp:employees)
        {  
	    System.out.println(emp.toString());
	}  
    }
    
}
