//Jasmine S. Allen
//July 16th, 2018
//Command+Shift+O == auto import for known errors
import java.util.*;

public class DetailGenerator {

	public static void main(String[] args) {
		
		double length = 0.0;
		double width = 0.0;
		double height = 0.0;
		int area = 0;
		int perimeter = 0;
		double volume = 0;
		
		String choice = "y";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		while(choice.matches("y") || choice.matches("Y"))
		{
			System.out.print("Enter Length: ");
			length = scan.nextDouble();
			System.out.print("Enter Width: ");
			width = scan.nextDouble();
			System.out.print("Enter Height: ");
			height = scan.nextDouble();
			//calculate area and perimeter 
			area = (int)(length * width);
			perimeter = (int)((2 * length) + (2 * width));
			
			//extra challenge
			volume = length * width * height;
			
			System.out.println();
			//print results
			System.out.println("Area: " + area + "\n" + "Perimeter: " + perimeter + "\n" + "Volume: " + volume); 
			

			//update user's choice to continue
			System.out.println("Continue? (y/n)");
			choice = scan.next();
			
			System.out.println();
		}
		
	}

}
