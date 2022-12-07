package arrayconcept;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
         System.out.println("Enter your first number");
       double no1= sc.nextDouble();
       
       System.out.println("please select your operator");
       
       String op = sc.next();
       
       System.out.println("Enter your second number");
       double no2= sc.nextDouble();
       
       switch (op) {
       case "+": System.out.println("addition of two numbers= "+ no1+no2);
       break;
       case "-": System.out.println("subtraction of two numbers= "+(no1-no2));
       break;
       case "*": System.out.println("multication of two numbers= "+no1*no2);
       break;
       case "/": System.out.println("division of two numbers= "+no1/no2);
       break;
       }
	}

}
