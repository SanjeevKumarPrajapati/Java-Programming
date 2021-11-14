
import java.util.Scanner;
public class Main
{
    /*
    public static void even_odd(int num){
        if(num%2==0){
            System.out.println("Entered Number is Even");
        }
        else{
            System.out.println("Entered Number is Odd");
        }
    }
    
    public static void meth(){
        System.out.println("Method 1");
    }
    
    public static void add(int x){
        int y=10;
        int z=30;
        int sum=x+y+z;
        System.out.println("Sum == "+sum);
    }
    public static int add(int x, int y){
        return (x+y);
    }
    */
    /*
    public int add(int x){
        int y=10;
        int z=20;
        int c=30;
        int sum=x+y+z+c;
        return sum;
    }
    public void even_odd(int x){
        if(x%2==0){
            System.out.println("Even Number ");
        }
        else{
            System.out.println("Odd Number ");
        }
    }
    */
    //Factorial 5!=5*4*3*2*1
    /*
    public int Factorial(int x){
        if (x==1){
            return 1;
        }
        else{
            return x*Factorial(x-1);
        }
    }*/
    public int fibo(int x){
        int f1=0;
        int f2=1;
        int f3=1;
        for(int i=0;i<=x;i++){
            System.out.println("Your Fibonacci Series is :-"+f1);
            f1=f2;
            f2=f3;//0,1,1,2,3,5,8................
            f3=f1+f2;
        }
        return 0;
    }
	public static void main(String[] args) {
		//Method 
		/* A method is a block of code or collection of statement or a set of code grouped together to perform a certain task or operation.
		We write a method once and use it many times.
		We do not require to write a code again and again .
		The method is executed only when we call or invoke it.
		*/
		//public int method_name( optional :- argument){
		    //block of code;
	    //}
	    //even_odd(20);
	    //meth();
	    //add(10);
	    //int a=add(30,40);
	    //System.out.println(a);
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Any Number :- ");
	    int a=sc.nextInt();
	    Main obj=new Main();
	    obj.fibo(a);
		}
}
