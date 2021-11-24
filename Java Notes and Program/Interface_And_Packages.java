/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
/*
            A
        B        C
            D
*/
//Hybrid Inheritance
/*
class A{
    void display1(){
        System.out.println("Method 1");
    }
}
class B extends A{
    void display2(){
        System.out.println("Method1");
    }
}
class C extends A{
    void display3(){
        System.out.println("Method3");
    }
}
class D extends B{
    void display4(){
        System.out.println("Method 4");
    }
}
public class Main
{
	public static void main(String[] args) {
		D obj=new D();
		obj.display4();
		obj.display2();
		obj.display1();
	}
}
*/
//Multiple Inheritance
/*          A       B 
                C*/
/*Not Possible without interface
class A{
    void display1(){
        System.out.println("Method 1");
    }
}
class B{
    void display2(){
        System.out.println("Method2");
    }
}
class C extends A,B{
    void display3(){
        System.out.println("Method3");
    }
}*/
/*
interface A{
    void display1();
}
interface B{
    void display2();
}
class C implements A,B{
    public void display1(){
        System.out.println("Method1");
    }
    public void display2(){
        System.out.println("Method2");
    }
}
public class Main
{
	public static void main(String[] args) {
		C obj=new C();
		obj.display1();
		obj.display2();
	}
}*/
//polymorphism
/* 1.) Runtime polymorphism(method overriding)
    2.) Compile time polymorphism(method overloading)
    
//overriding :-  Method name is Same
                Parameter is same 
                Class is different
                
//overloading :- Method name is same
                paramtere is different
                class is also same

Packages :- 
Packages are those class which contains methods without the main method in them
Packages are mainly used to reuse the classes which are already created/used in other program//Packages mypackage;
We can define many number of classes in the same package.
Packages are mainly divided into two types.They are 
1.Built in packages
2.User defined Package

Built in Package :-

1.) lang;
2.) util;import java.util.*;
3.) io ::input/output support classes.They provide the facility for input/output of data
4.) awt :- set of classes for implementing graphical userinterface.They include classes for windows,buttons,lists
5.) net :- Classes for networking.They include classes for communicating with local computers as well as with internal servers.
6.) applet

User define packages
1st Program A.java
package mypackage;
public class A{
    public void display(){
        System.out.println("Method 1");
    }
}
2nd program
import mypackage.*;
class packagedemo{
    public static void main (String [] args){
        A obj=new A();
        obj.display();
    }
}


// Accessing a packages

1.) import packages.*;
2.) import package.classname;
3.) fully qualified time;


//import package name
//A.java
package pack;
public class A{
    public void display(){
        System.out.println("Method1");
    }
}

//B.java
import pack.*;
class B{
    public static void main(String [] args){
        A obj =new A();
        obj.display();
    }
}
//Method1

import pack.A;
class B{
    public static void main(String [] args){
        A obj=new A();
        obj.display();
    }
}
//method1
//A.java;
package pack; 
public class A{
public void msg(){System.out.println("Hello");}

//save by B.java 
package mypack; 
class B{
public static void main(String args[]){
pack.A obj = new pack.A();//using fully qualified name
obj.msg();
}







