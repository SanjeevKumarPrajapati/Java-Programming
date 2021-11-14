/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class A{
    public void meth1(int a){
        System.out.println("My first method :"+a);
    }
}
class B{
    public void meth1(int a){
        System.out.println("My Second Method :- "+a);
    }
}
class C{
    public void meth1(int a){
        System.out.println("My Third Method :- "+a);
    }
}
public class Main
{   
    //Method overloading;
    /*
    static int add(int x,int y){
        return x+y;
    }
    static int add(int x,int y,int z){
        return x+y+z;
    }
    public static int meth1(int c){
        System.out.println(c);
        return 0;
    }
    public static int meth1(int c , int num){
        System.out.println(c+" "+num);
        return 0;
    }
    int show(int a,double b){
        System.out.println("Method Number 1.");
        return 0;
    }
    int show(int a,double b,double c){
        System.out.println("Method Number 2");
        return 0;
    }
    public int meth1(int num1,int num2){
        System.out.println("This is Method Number 1.");
        return num1+num2;
    }
    public int meth2(int var1,int var2){
        System.out.println("This is Method Number 2.");
        return var1+var2;
    }*/
    //Valid or Invalid Of method overloading.
    /*Case 1 :- int method_name(int a,int b,float c)
                int method_name(int var1,int var2,float c)
                
        Error :- Compile time error:Arguments lists are exactly same.Both method are having same number,same data type and same sequence of
                data type;
        Case 2:- int method_name(int a,int b);
                int method_name(float a,float b);
        Case 3:- int method_name(int a,int b)
                int method_name(int num)
        Case 4:- float method_name(int a,float b);
                float method_name(float var1,int var2);
            perfectly fine.valid case of Parameter of overloading
            sequence of data types of parameter are Diffrent ,first method is having(int,float),and the second method is having (float,int);
            
        Case 5 :- int method_name(int a , int b);
                  float method_name(int var1,int var2);
                  
            Compile time error:- Arguments lists are exactly same.Even through return type of method are diffrent , it is not a valid Case.
            Since return type of method does't mattter while overloading a method.
    */
    //Method Overridding
    //1.) Class is Diffrent
    //2.) Method NAme is Same
    //3.) Parameter same.
	public static void main(String[] args) {
	    // if a class has multiple method having 1.) Same method name 2.) Diffrent Parameter 3.) Class name is same,it is known method overloading;
	    //Advantage:- Method overloading increase the readability of the program.
	    //Diffrent ways to overload the Method
	    /*There are too ways to overload the method in the java.
	        1.) By Changing the number of Argumnets
	        2.) By Changing the data type.
	        */
	        A obj1=new A();
	        B obj2=new B();
	        C obj3=new C();
	        obj1.meth1(10);
	        obj2.meth1(20);
	        obj3.meth1(30);
	}
}
