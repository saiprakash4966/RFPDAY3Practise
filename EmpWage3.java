package com.bl;

public class EmpWage3 
{
	
		public static void main(String[] args) {
		final int emp_rate_per_hour=20;
			
			final int is_part_time=1;
			final int is_full_time=2;
			
			//variables
			int salary=0;
			int empHours=0;
			System.out.println("Welcome to Employee Wage Calculation");
			
			
			double empCheck=Math.floor(Math.random()*10) % 3;
			
			if(empCheck==is_full_time) {
				System.out.println("Employee is full_time");
				empHours=8;
			}
			else if(empCheck==is_part_time)
			{
				System.out.println("Employee is Part_time");
				empHours=4;
			}
				salary=empHours * emp_rate_per_hour;
				
				System.out.println("Employee salary is  "+salary);
			
		}

}
