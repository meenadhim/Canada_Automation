package java_code_WrapperClasses;

import java.util.ArrayList;

public class UnderstandingWrapper {

	
		
		//short,byte,int,long,double,char,float,boolean - all are primitive data types
		//Java is an OOP language
		//Java needs objects
		
	
        public static void main(String[] args) {
        	ArrayList l =  new ArrayList();
        	l.add(10);
        	//this add method requires an Object as input parameter
        	//but what we are giving now? we have passed an int primitive data type parameter
        	//we need to convert the primitive date type to Object and provide that object as an input parameter to the add method
        	//how do we convert the primitive data type to an Object?
        	//To wrap the primitive data type to object by using Wrapper class
        	
        	//int = Integer
        	//short = Short
        	//byte = Byte
        	//long = Long
        	//double = Double
        	//boolean = Boolean
        	//float = Float
        	//char = Character
        	
        	//Objectives of wrapper class
        	//1. Wrap primitive data types into Object form so that we can handle or use primitive data types just like object
        	//2. To define several utility methods for primitives for conversion and other operations
        	
        	 int i = 10;   // convert this int into a string
        	String S1 = Integer.toString(10);
        	Integer.parseInt(null);     // this method will convert string to an int
        	
        	//Boolean.valueOf(true);           this method will help convert string to a boolean
        	
        	//Autoboxing
        	//it means the automatic conversion of the primitive data types to their corresponding wrapper classes
        	//example: if you assign an int value to an Integer variable, java will convert the int to Integer
        	//Autoboxing allows you to use primitive data types as if they were Objects
        	
        	int num1 = 10;
        	Integer var1 = num1;      //now, num1 is an Integer Object.It is no longer an int value in this line
        	
        	
            //Unboxing
        	//It is the opposite of autoboxing
        	//it is the method of converting wrapper class to primitive data type 
        	//example: if you have an Integer Object and you assign it to an int variable, java will convert the Integer to an int
        	//Unboxing allows you to use wrapper class as if they were primitive data types
        	
        	Integer num2 = new Integer(123);
        	int var2 = num2;    //now num2 is an int
        	
        	String S2 = "123";      //convert this string into an int
        	int value = Integer.parseInt(S2);     //this will return an int value
        	System.out.println(value);
        	
        	
        	//convert the string to a boolean
        	String S3 = "true";
        	boolean bool = Boolean.valueOf(S3);
        	System.out.println(bool);
        	
        	
        	
        
        }
}
