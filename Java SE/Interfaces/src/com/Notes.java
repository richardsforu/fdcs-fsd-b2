package com;

public class Notes {

/*
 *  interfaces
 *  --------------
 *  
 *  -> An interface is a method specification which contains zero or 
 *     more abstract methods
 *  -> by default all methods in the interface act like public and abstract
 *  -> by default all properties in the interface act like public final and
 *     static.
 *  
 *  
 *  
 *  Notes
 *  --------
 *  1. A class can implements more than one interface at a time
 *  2. A class can not extends more than one class at at time
 *  3. A class can not extends to an interface
 *  4. An interface can extends to another interface
 *  5. An interface can extends to more than  one interface at a time
 *  6. An interface can not implements another interface
 *  7. A class can extends to a class one time and can implements more than
 *     one interface at a time. Make sure extends keyword appears before 
 *     implements keyword
 *     
 *  --------------------------------------------------------------------
 *  
 *  
 *  
 *  
 *    EmployeeDaoImpl
 *    ------------------------------------
 *    	void saveEmployee(Employee emp){}
 *      void findEmployee(int empId) { } 
 *      void listAllEmployees() {}
 *      void updateEmployee(Employee newObj){}
 *      void deleteEmployee(int empId) {}
 *      
 *     -----------------------------------
 *     
 *     Actors 
 *     -------
 *     1. JrProgrammer
 *     		-> listEmployee, findEmployeeById
 *     2. SrProgrammer
 *     		-> saveEmployee,listEmployee, findEmployeeById 
 *     3. ProgramManager
 *     		-> give access to all the methods
 *    
 *    ----------------------------------------------
 *     
 *      
 *     
 *  
 *  
 *  
 *  
 *  
 *  
 *  
 */

}
