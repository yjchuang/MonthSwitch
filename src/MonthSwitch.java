import java.util.Scanner;

public class MonthSwitch {

	public static void main(String[] args) {
	
		 //This program will print 'May' when you run it.
        int days = 0;
        String monthName;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the exactl days of month: ");	
        
        days =  sc.nextInt(); 
        
        
        switch (days) {
            case 30:  monthName = "April, June, September and Novenber have exacttly 30 days";
                     break;
            case 31:  monthName = "January, March, May, July, August, October and December have 31 days";
                     break;
            case 29: 
            case 28:  monthName = "February has 28 or 29 days";
                     break;
            default: monthName = "No months have exactly " + days + " days";
                     break;
        }
        System.out.println(monthName);
        
        sc.close();

	}

}
