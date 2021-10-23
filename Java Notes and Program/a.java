import java.util.Scanner;
public class a{
	public static void main(String args[]) {
		/*
		System.out.println("Addition :- "+(a+b));
		System.out.println("Subtraction :- "+(a-b));
		System.out.println("Multiplication :- "+(a*b));
		System.out.println("Division :- "+(a/b));
		System.out.println("Modulus :- "+(a%b));
		System.out.println("Increment :- "+(++a));
		System.out.println("Decreament :- "+(++b));
		*/
		//Assignment Operators
		/*
		System.out.println("Increment and Equal :- "+(a+=3));//a=13
		System.out.println("Dcrement and Equal :- "+(a-=3));//a=a-3,a=13-3,10
		System.out.println("Multiplication and Equal :- "+(a*=3));//a=a*3,a=10,a=10*3=30
		System.out.println("Division and Equal :- "+(a/=3));//a=a/3,30/3=10
		System.out.println("Modulus and Equal :- "+(a%=3));//a=a%3 , a=10,10%3=1
		*/
		//Comparison operators
		/*
		System.out.println("Equal to :- "+(a==b));//a=10,b=20;
		System.out.println("Not equal :- "+(a!=b));
		System.out.println("Greater than :- "+(a>b));
		System.out.println("Less than :- "+(a<b));
		System.out.println("Less than and equal to :- "+(a>=b));
		System.out.println("Greater than and equal to :- "+(a<=b));
		*/
		//Logical Operator
		//And operator
		/*
		System.out.println("And :- "+(false && false));
		System.out.println("And :- "+(false && true));
		System.out.println("And :- "+(true && false));
		System.out.println("And :- "+(true && true));
		*/
		//OR operator
		/*
		System.out.println("OR :- "+(false || false));
		System.out.println("OR :- "+(false || true));
		System.out.println("OR :- "+(true || false));
		System.out.println("OR :- "+(true || true));
		*/
		//NOT Operator
		/*
		System.out.println("NOT :- "+(!false));
		System.out.println("NOT :- "+(!true));
		*/
		//Compliment operator
		//System.out.println("Compliment :- "+(~7));
		//System.out.println("Compliment :- "+(~~~~~5));

		/*
		a+=10;//a=+10
		a-=2;
		a*=5;
		a/=2;
		System.out.println("Answer :- "+a);//70
		a=+10;
		System.out.println("Answer :- "+a);
		System.out.println("Answer :- "+a);
		
		*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter First Number  :- ");
		int a=sc.nextInt();
		System.out.println("Eneter Second Number  :- ");
		int b=sc.nextInt();
		System.out.println("Eneter Third Number  :- ");
		int c=sc.nextInt();
		System.out.println("Eneter Fourth Number  :- ");
		int d=sc.nextInt();
		System.out.println("Eneter Fifth Number  :- ");
		int e=sc.nextInt();
		int sum=a+b+c+d+e;
		int avg=sum/5;
		System.out.println("Sum of all numbers is "+sum);
		System.out.println("Average of all numbers is "+avg);
		
		
		
		
		
		
		
		
		
	}
}