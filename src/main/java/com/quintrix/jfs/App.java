package com.quintrix.jfs;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	long biggerNum = 1000L;
    	
    	boolean checkNum = false;
    	
    	String str1 = new String("Hello");
    	
    	String str2 = new String("Hello");
    	
    	/*if(str1 == str2) {
    		System.out.println("They are equal");
    	} else {
    		System.out.println("They are not equal");
    		}
    	*/
    	Integer carsCounter1 = 10;
    	
    	Integer carsCounter2 = 10;
    	
    	if(carsCounter1 == carsCounter2) {
    		System.out.println("They are equal");
    	} else {
    		System.out.println("They are not equal");
    	}
    	
    	int carsCounter = 0;
    	
    	char alphabet = '\u2764';
    	
    	
    	double testDecimalVal = 1.0;
    	
    	testDecimalVal = testDecimalVal + 0.2;
    	
    	
    
    	carsCounter = (int) biggerNum;
    	
    	carsCounter++;
        
        System.out.println("Test Output: " + testDecimalVal);
    }
}
