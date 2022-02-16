package com.bl;

public class EmpWage5
{
	public static void main(String[] args) {

		//constants
		final int isPart_time=0;
		final int isFull_time=1;

		//variables
		int rateperHour=20;
		int empHours=0;
		int salary=0;
		int num_working_Hours=20;
		int monthlySalary=0;
		
		for(int day=1;day<=num_working_Hours;day++) {
			
		double empCheck=Math.floor(Math.random()*10) % 3;
		int empcheck=(int)empCheck;
		
		switch(empcheck){    
		case isFull_time:    
			empHours=8;
			break;  //optional  
		case isPart_time:    
			empHours=4;
			break; 
		default:     
			empHours=0;  
			break;
		} 
		
		salary=rateperHour*empHours;
		monthlySalary=monthlySalary+salary;
		}
		System.out.println("Employee Salary is "+salary);
		System.out.println("Employee Monthly Salary is "+monthlySalary);
	}

}
