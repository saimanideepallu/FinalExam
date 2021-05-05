/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question12;

import java.util.Collections;

/**
 *
 * @author S542406
 */
public class Employee implements Comparable<Employee>{
 
    private int empId;
    private String empName;
    private int empSalary;

    public Employee(int empId, String empName, int empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }
    
    
    @Override
    public int compareTo(Employee arg0) {
        if(empId==arg0.empId)
        {
	    return 0;
        }
        else if(empId>arg0.empId)  
        {
	    return 1;
        }
	else  
        {
	    return -1; 
        }
    }

    @Override
    public String toString()
    {
        return "EmpId: "+empId+" EmpName: "+empName+" EmpSalary: "+empSalary;
    }
    
    
}
