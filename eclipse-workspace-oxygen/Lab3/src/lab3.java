import java.util.*;
public class lab3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String name = "";
		String choice = "y";
		
		//get user name
		System.out.print("Hello! What is your name? ");
		name = scan.next();
		System.out.println();
		
		while(choice.matches("y") || choice.matches("Y"))
		{
			//get user number		
			System.out.println(name + ", please enter a whole number between 1 and 100: ");
			
			//number validation
			while(num < 1 || num > 100)
			{
				try
				{
					num = scan.nextInt();
					
				}
				catch (InputMismatchException e)
				{
					System.out.println("Now, " + name + ", that wasn't a whole number! I'll fix it for you THIS time.");
					num = (int)num;
				}
				
				if(num < 1 || num > 100)
					{
						scan.nextLine();
						//get user number		
						System.out.println(name + ", PLEASE enter a number between 1 and 100: ");
						num = scan.nextInt();
					}
				
				
			}
			
			
			
			//checks the number entered
			if(num > 2 && num < 25)
			{
				//if even/odd
				if(0 == num%2)
					System.out.println("Even and less than 25");
				else
					System.out.println("Odd");
					
			}
			else if(num > 25 && num < 60)
			{
				//if even/odd
				if(0 == num%2)
					System.out.println("Even");
				else
					System.out.println(num + " is Odd");
					
			}
			else if(num > 60)
			{
				//if even/odd
				if(0 == num%2)
					System.out.println(num + " Even");
				else
					System.out.println(num + " Odd and over 60.");
					
			}
			else
			{
				//if even/odd
				if(0 == num%2)
					System.out.println("Even");
				else
					System.out.println(num + " Odd");
			}
			
		
			
			//update user's choice to continue
			System.out.println("Continue? (y/n)");
			choice = scan.next();
			
			//reset num for loop
			num = 0;
			
			System.out.println();
		}
		
	}
}
