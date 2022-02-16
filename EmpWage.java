package com.bl;

public class EmpWage
{
	

		public static void main(String[] args) 
		{
			final int is_fulltime=1;
			double empCheck=Math.floor(Math.random()*10) % 2;
			
			if(empCheck==is_fulltime)
			{
				System.out.println("Employee is Present");
			}
			else
				System.out.println("Employee is Absent");
			
		}

}
