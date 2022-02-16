package com.bl;

import java.util.Scanner;

public class Line
{
	public static int getLength(Scanner c) {
       System.out.println("Enter x1 value");
       int x1 = c.nextInt();

       System.out.println("Enter y1 value");
       int y1 = c.nextInt();

       System.out.println("Enter x2 value");
       int x2 = c.nextInt();

       System.out.println("Enter y2 value");
       int y2 = c.nextInt();

       int output1 = (int) Math.pow((x2 - x1), 2);
       int output2 = (int) Math.pow((y2 - y1), 2);
       int result = (int) Math.sqrt(output1 + output2);

       return result;
}

public static void main(String[] args) {
       Scanner c = new Scanner(System.in);
       System.out.println("Please enter values for line 1");
       int length_line1 = getLength(c);
       System.out.println("Please enter values for line 2");
       int length_line2 = getLength(c);
        if(length_line1 == length_line2)
            System.out.println("Both lines are equal");
    else if(length_line1 > length_line2)
            System.out.println("The line1 is greater than line2");
    
    else
            System.out.println("The line2 is greater than line1");

       c.close();
}
}

	