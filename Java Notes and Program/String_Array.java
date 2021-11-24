//String
/* 
    String is a sequence of Characters .But in java string is an object that represents a sequence of Character.
    The java.lang.String class is used to create a string object.
    */
    //How to create a string object
    //1.) using string literal
    //2.) Using New Keyword
    
//String Literal :
        /*
            Java sting literal is created by using double guotes . For Ex:- String s="Welcome";
            
        Eacn time you create a string iteral tha java JVM checks the "String constant pool" first.
        If the string already exists in the pool, a reference to the pooled instance is returned .
        A new string instance is created and placed in the pool .
        For Example: - String s1="Welcome";
                        String s2="Welcome";
        */

public class Main
{
	public static void main(String[] args) {
		//1.) By literal Method
		/*
		String sc="Welcome";
		System.out.println(sc);
		*/
		
		// 2.) By New Keyword
		/*
		String sc=new String("Welcome");
		System.out.println(sc);
		*/
		//String Methods
		
		// 1.) CharAt(int index): It returns char value for the particular index
		//String s1="Hello Java";
		//String s2="Developer";
		//String s3="Hello Java";
		//System.out.println(s1.charAt(7));
		
		//2.) Length() :- It returns string Length.
		//System.out.println(s1.length());
		
		//3.) Equals() :- It check the equality of the string with the given string;
		
		    //System.out.println(s1.equals(s2));
		    //System.out.println(s1.equals(s3));
		   
		//4.) Concat(string str): - It concatenates the specified string ;
		
		    //System.out.println(s1.concat(s2));
		  
		 //5.) Replace( char old,char new): it replace all occurence of the specified char value;
		    
		    //System.out.println(s2.replace("D","P"));
		   
		//6 .)  indexOf(int char): it returns the specified char value index;
		        
		        //System.out.println(s2.indexOf("p"));
		        
		//toLowerCase() :- It returns a string in Lowercase;
		    
		    //System.out.println(s1.toLowerCase());
		    
		//toUpperCase() :- It returns a string in the Upper case

            //System.out.println(s1.toUpperCase());		    
		    
		//Array :-  Similar type of data store linearly and call by same name;
		//Index starting from 0 to .......
		
		// types of arrya:
		    //1.)  One Dimensional
		    //2.) Multi Dimensional
		    
	//1.) One Dimensional Arrray :
	//Syntax:- 
	    /* data_type [] arr;or
	     data_type[] arr;or
	     data_type arr[];
	     
	     */
	     
	     //Initialization of Array
	    /* arr=new datatype[5];
	        arr = new int[5];
	        arr[0]=1;
	        arr[1]=2;
	        arr[2]=3;
	        arr[3]=4;
	        arr[4]=5;
	  */
	  /*
	  int arr[]=new int[6];
	        arr[0]=1;
	        arr[1]=2;
	        arr[2]=3;
	        arr[3]=4;
	        arr[4]=5;
	        arr[5]=6;
	   for(int i=0;i<=5;i++){
	       System.out.println(arr[i]);
	   }
	   int arr1[]={1,2,3,4,5,6};
	   for(int i=0;i<=5;i++){
	       System.out.println(arr1[i]);
	   }
	   */
	   //Multidimesional Array
	   // In such case data is stored in row and column based index also known as matrix form;
	   //data_type [][] array;
	   //data_type[][] array;
	   //data_type array[][];
	   //data_type []array[];
	   /*
	   int [][]arr=new int[3][3];
	   arr[0][0]=1;
	   arr[0][1]=2;
	   arr[0][2]=3
	   arr[1][0]=4
	   arr[1][1]=5
	   arr[1][2]=6
	   arr[2][0]=7
	   arr[2][1]=8
        arr[2][2]=9
    */
	   
	   int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
	   for(int i=0;i<=2;i++){
	       for(int j=0;j<=2;j++){
	           System.out.print(arr[i][j]+" ");
	       }
	       System.out.println();
	   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}
}
