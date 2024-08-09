package com.controller;

import java.util.List;
import java.util.Scanner;

import com.dto.EmployeeDto;
import com.repository.EmployeeRespositoryImpl;
import com.service.EmployeeServiceImpl;

public class MyController {

	// Spring se Banvao iska Object ( Dependency Injection) se
	private EmployeeServiceImpl employeeServiceImpl;
	
	
	public EmployeeServiceImpl getEmployeeServiceImpl() {
		return employeeServiceImpl;
	}


	public void setEmployeeServiceImpl(EmployeeServiceImpl employeeServiceImpl) {
		this.employeeServiceImpl = employeeServiceImpl;
	}


	public void request() {
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.print("Enter your Choice");
			
			System.out.println("PRESS '1' -> Insert Employee");
			System.out.println("PRESS '2' -> Read Employee");
			System.out.println("PRESS '3' -> Update Employee");
			System.out.println("PRESS '4' -> Delete Employee");
			System.out.println("PRESS '5' -> Count Employee");
			System.out.println("PRESS '6' ->  EXIT");
			int choice = scn.nextInt();
			
			if(choice==6) {
				break;
			}
			switch (choice) {
			case 1:
				//Controller -> Service ( Insert )
				System.out.println("Enter the Details of the Employee ");
				System.out.println("Enter 'Employee Id' ");
				int id = scn.nextInt();
				scn.nextLine();
				System.out.println("Enter 'Employee Name' ");
				String name=scn.nextLine();
				System.out.println("Enter 'Employee Adress'");
				String address = scn.nextLine();
				System.out.println("Enter 'Employee Salaray'");
				int salary= scn.nextInt();
				
				EmployeeDto employee = new EmployeeDto(id, name, address, salary);
				String status = employeeServiceImpl.createService(employee);
				if(status.equals("created")) {
					System.out.println("Employee Created Successfully");
				}else {
					System.out.println("Employee Not Created Successfully");
				}
				break;
			case 2:
				
				List<Object> list = employeeServiceImpl.readService();
				for(Object obj :list) {
					EmployeeDto emp = (EmployeeDto) obj;
					System.out.println(emp);
					
				}
				System.out.println("---------------");
				break;
				
			case 3:
				
				break;
				
			case 4:
				
				break;
				
			case 5:
				
				break;
			

			default:
				break;
			}
		}
	}
	
}
