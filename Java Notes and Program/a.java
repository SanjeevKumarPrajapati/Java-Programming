import java.util.Scanner;
public class a{
	public static void main(String args[]) {
		//Conditional satement
		//if  and else
		/*
		 * if statement is a condition execution statement , if a condition is true it will executed a block of code satements and if the condiditon is false then it
		 * will not executed your if block and in the case it execute else block of statement*/
		//Syntax
		/*
		if(condition) {
			//statement;
		}
		*/
		//Example 
		/*
		if(a<b) {
			System.out.println("a is less than b");
		}
		*/
		/*
		if(a>b) {
			System.out.println("A is greater than B");
		}
		else {
			System.out.println("B is greater than A");
		}
		*/
		//WAP of find the number is even or odd
		Scanner sc=new Scanner(System.in);
		/*
		System.out.println("Enter Your Number :- ");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("Entered Number is Even");
		}
		else {
			System.out.println("Enterd Number is Odd");
		}
		*/
		// WAP to find the greater number between two elements ( Takiing input form the user)
		/*
		System.out.println("Enter First Number :- ");
		int a=sc.nextInt();
		System.out.println("Enter Second Number :- ");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println("Your First Number is Greater than Second Number...");
		}
		else {
			System.out.println("Your Second Number is Greater than First Number...");
			
		}
		*/
		//3.) WAP to find given number is positive or negative (taking input from the user)
		/*
		System.out.print("Enter Your Number :- ");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("Your Number is Positive");
		}
		else {
			System.out.println("Your Number is Negetive");
		}
		*/
		//4.) WAP to find the entered year is leap year or not and taking input from the user
		/*
		System.out.print("Enter your Year :- ");
		int a=sc.nextInt();
		if((a%100!=0) && (a%4==0)||(a%400==0)) {
			System.out.println("Entered Year is a Leap Year");
		}
		else {
			System.out.print("Entered Year is not a leap year");
		}*/
		
		//Ternary operaotrs
		/*
		 * There is also short-hand if else,which is known as the ternary operators because it consists of three operands . It can be used to replace multiple lines of code
		 * with a single line.
		 * It is often used to replace simple if-else statement.
		 */
		//Syntax
		//variable_name=(condition)?expression true : epression false;
		int a=30;
		int b=20;
		String abc=(a>b)?"First Number is greater than Second Number":"Second Number is Greater than my first number";
		System.out.println(abc);		
	}
}