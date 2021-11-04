/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		//WAP to calculate the sum of first 10 natural number;
		//First Method
		/*
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Number :- ");
		int n=sc.nextInt();
		int sum=(n*(n+1))/2;
		System.out.print("Your Sum  is=="+sum);//5+4+3+2+1
		*/
		//Second Method
		/*
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Your Number :- ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++){
		    sum+=i;
		}
		System.out.println("Your Sum of All natural number is :- "+sum);
		*/
		//Write a program to find factorial value of any number
		/*
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number :- ");
		int factorial=0;
		int num=sc.nextInt();
		for(int i=0;i<=num;i++){
		    factorial*=i;
		}
		System.out.println("The Factorial of the given number is :- "+factorial);
		*/
		//Write a program of fibonacci series
		//0,1,1,2,3,5,8........
		/*
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Any Number :- ");
		int num=sc.nextInt();
		int f1=0;
		int f2=1;
		int f3=1;
		for(int i=0;i<=num;i++){
		    System.out.println("Your Fibonacci Series is:- "+f1);
		    f1=f2;
		    f2=f3;
		    f3=f1+f2;
		}
		*/
		/*While loop 
		    The java while loop is used to iterate a part of the program repeatdly until the specified boolean condition
		    is true.As soon as the boolean condition false,the loop automatically stop;
		    
		    Syntax:
		        initialized the value
		        while(condition){
		            Statement
		            increment/decrement
		        }
		 */
		 /*
		 int i=0;
		 while(i<=10){
		     System.out.println("Your Number is :- "+i);
		     i++;
		 }*/
		 /*
		 int sum=0;
		 int i=0;
		 while(i<=15){
		     sum+=i;
		     i++;
		 }
		 System.out.println("Sum of n natural number is == :"+sum);
		 */
		 //Do While:
		    /* The java do-while loop is used to iterate a part of the program repeatdly , until the specified condition is true;
		        if the number of iteration is not fixed and you must have to execute the loop atleast once .
		        do{
		            //code
		            //satement.
		        }while(condition)
		       */
		       /*
		      int i=0;
		      do{
		          System.out.println("Your Number is :- "+i);
		          i++;
		      }while(i<=10);
		      */
		      //fibonaaci series using do-while loop
		      //0,1,1,2,3,5,8...
		      int num=20;
		      int i=0;
		      int f1=0;
		      int f2=1;
		      int f3=1;
		      do{
		          System.out.println("Your Fibonacci Series is:-"+f1);
		          f1=f2;
		          f2=f3;
		          f3=f1+f2;
		          i++;
		      }while(i<=num);
		  
	}
}
