//Jasmine Allen
//June 28, 2018
import java.util.*;
public class Lab1 {

	public static void main(String[] args) 
	{
		
		getInput();
		
	}
	 //Put task into separate method
	static void getInput()
	{
		Scanner scnr = new Scanner(System.in);
	      int num1[]= new int[3];
	      int num2[]= new int[3];
	      int i = 0;
	      
	      //collect input for first number (validation/user prompts)
	      System.out.println("Please enter two numbers one digit at a time:");
	      System.out.print("Hundreds: ");
	      num1[i++] = scnr.nextInt();
	      System.out.print("Tens: ");
	      num1[i++] = scnr.nextInt();
	      System.out.print("Ones: ");
	      num1[i++] = scnr.nextInt();
	      System.out.println();
	      
	      //print array
  	  System.out.print("You have entered: ");
	      for(int j = 0; j < num1.length; j++ )
	    	  System.out.print(num1[j]);
	      System.out.println();
	      
	      //reset counter to zero
	      i = 0;
	      
	      //collect input for second number
	      System.out.println("Please enter two numbers one digit at a time:");
	      System.out.print("Hundreds: ");
	      num2[i++] = scnr.nextInt();
	      System.out.println();
	      System.out.print("Tens: ");
	      num2[i++] = scnr.nextInt();
	      System.out.println();
	      System.out.print("Ones: ");
	      num2[i++] = scnr.nextInt();
	      System.out.println();
	      
	      //print array
  	  System.out.print("You have entered: ");
	      for(int j = 0; j < num1.length; j++ )
	    	  System.out.print(num2[j]);
	      
	      System.out.println();
	      System.out.println();
	      
	      //Check if each corresponding place in the two numbers (ones, tens, hundreds, …)
	      //sums to the same total. 
	      
	      if((num1[0]+num2[0]) == (num1[1]+num2[1]))
	      {
	    	  if((num1[1]+num2[1]) == (num1[2]+num2[2]))
	    		  System.out.println("True.");
	      }
	      else
	    	  System.out.println("False.");
	      
	      
	}
	
	

}
