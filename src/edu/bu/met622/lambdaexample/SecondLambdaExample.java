package edu.bu.met622.lambdaexample;
import java.util.ArrayList; 

/**
 * adapted from here: https://www.geeksforgeeks.org/lambda-expressions-java-8/
 * http://tutorials.jenkov.com/java/lambda-expressions.html
 * 
 */
public class SecondLambdaExample {
	// A Java program to demonstrate simple lambda expressions 
	    public static void main(String args[]) 
	    { 
	        // Creating an ArrayList with elements 
	        // {1, 2, 3, 4} 
	        ArrayList<Integer> arrL = new ArrayList<Integer>(); 
	        arrL.add(1); arrL.add(2); arrL.add(3); 
	        arrL.add(4); 
	        arrL.add(5); 
	        arrL.add(6); 
	        arrL.add(7);
	        
	        // empty lambda is not working in recent version of Java. It should be an interface
	        //() -> System.out.println("Zero parameter lambda");
	        
	        // Using lambda expression to print all elements  of arrL 
	        arrL.forEach(n -> System.out.println("just print them:"+n)); 
	  
	        // Using lambda expression to print even elements of arrL 
	        arrL.forEach(n -> { if (n%2 == 0) System.out.println("n is:"+n); }); 
	    } 
}
