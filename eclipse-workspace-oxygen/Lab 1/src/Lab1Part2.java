//Jasmine Allen
//June 28, 2018
import java.util.*;

public class Lab1Part2 {

	public static void main(String[] args) 
	{
		Scanner scnr = new Scanner(System.in);
		//final result variables
		int years = 0;
		int months = 0;
		int days = 0;
		//date 1
		int years1 = 0;
		int months1 = 0;
		int days1 = 0;
		//date 2
		int years2 = 0;
		int months2 = 0;
		int days2 = 0;
		
		int date1;
		int date2;
		
		//collect data
		System.out.println("Please enter your 1st date in...");
		System.out.print("Years: ");
	    years1 = scnr.nextInt();
	    System.out.println();
		System.out.print("Months: ");
	    months1 = scnr.nextInt();
	    System.out.println();
		System.out.print("Days: ");
	    days1 = scnr.nextInt();
	    
	    System.out.println();
	    System.out.println();

		
		System.out.println("Please enter your 2nd date in...");
		System.out.print("Years: ");
	    years2 = scnr.nextInt();
	    System.out.println();
		System.out.print("Months: ");
	    months2 = scnr.nextInt();
	    System.out.println();
		System.out.print("Days: ");
	    days2 = scnr.nextInt();

	    System.out.println();
	    System.out.println();
	    
	    //calculate the duration (in days)
	    
	    date1 = (years1 * 365 + months1 * 30) + days1; 
	    date2 = (years2 * 365 + months2 * 30) + days2;
	    
	    //adjust amount of days for appropriate months
	    switch(months1)
	    {
	    	case 1:        
	    		date1 += 1;
	    		break;
		    case 2:
		        date1 -= 2;
		        break;
		    case 3:        
	    		date1 += 1;
	    		break;
		    case 5:        
	    		date1 += 1;
	    		break;
		    case 7:        
	    		date1 += 1;
	    		break;
		    case 8:        
	    		date1 += 1;
	    		break;
		    case 10:        
	    		date1 += 1;
	    		break;
		    case 12:        
	    		date1 += 1;
	    		break;
		    	    
	    }
	    
	    //adjust amount of days if leap year 
	    if(years1 < years2)
	    {
	    	//checks every year between
	    	for(int i = years1; i <= years2; i++)
	    	{
	    		//if leap year add 1 day
	    		if((0 == i%4) && (0 == i%100) && (0 != i%400))
	    		{
	    			days++;
	    		}
	    	}
	    
	    }
	    
	    
	    int difference = date1 - date2;
	    if(difference < 0)
	    {
	    	difference = 0;
	    	difference = date2 - date1;
	    }
	    
	    years = difference / 356;
	    months = (difference % 365) / 30;
	    days = (difference % 365) % 30;
	    
	    //print results
        System.out.println("Your time difference is: " + years + " Years, " + months + " Months, and " + days + " Days.");

		
	}

}
