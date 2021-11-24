
//OOPS
/*
    Opps stand for object oriented programming.
    object means a real -world entity such as pen , chair, table....
    Object oriented programming is a methodology to design a programme using classes and obeject;
    
    //classes
    
        Collection of objects is called class.
        It is logical entity;
        A class can also be defined as a blueprint from which you can create an individual object;
        Class doesn't consume any space;
     
    //Object :
        
        Any entity that has state and behavior is known as an object . For example a pen,chair;
        An object can be define as an instance of a class 
        An object contains an address and takes up some space in the memory;
        
    //Inheritance :-
    
        When one object acquires all the properties and behavior of a parent object , it is known as inhertance.
        It provides code reusability.
        It is used to archieve reuntime polymorphism.
        */
//Code 
/*
class A{
    void display(){
        System.out.println("Class A");
    }
}
class B extends A{
    void display2(){
        System.out.println("Class B");
    }
}
public class Main
{
	public static void main(String[] args) {
		B obj=new B();
		obj.display();
}
}
*/
// Type of Inheritance
//1.) Single Inheritance
//2.) Multilevel Inheritance
//3.) Hierarchical Inheritance
//4.) Hybrid Inheritance
//5. ) Multiple Inheritance

//Single Inheritance
/*
class A{
    void display_car(){
        int amount=2000000;
        String color="Red";
        System.out.println("Amount :- "+amount);
        System.out.println("Colour :- "+color);
    }
}
class B extends A{
    void owner_details(){
        String name="Sanju";
        int age=24;
        System.out.println("Owner Name :- "+name);
        System.out.println("Owner Age :- "+age);
    }
}
public class Main
{
	public static void main(String[] args) {
		B obj=new B();
		obj.display_car();
		obj.owner_details();
}
}
*/

//Multilevel inhertance :

/*
class A{
    void display1(){
        System.out.println("This is Parent Class");
    }
}
class B extends A{
    void display2(){
        System.out.println("This is Child Class");
    }
}
class C extends B{
    void display3(){
        System.out.println("This is Grand Child Class");
    }
}
public class Main
{
	public static void main(String[] args) {
		C obj=new C();
		obj.display1();
		obj.display2();
		obj.display3();
}
}
*/

//Hierarchical Inheritance

class A{
    void display1(){
        System.out.println("Method 1");
    }
}
class B extends A{
    void display2(){
        System.out.println("Method 2");
    }
}
class C extends A{
    void display3(){
        System.out.println("Method 3");
    }
}
public class Main
{
	public static void main(String[] args) {
		C obj=new C();
		B obj1=new B();
		obj.display1();
		obj.display3();
		obj1.display2();
		obj1.display1();
}
}



