import java.util.Scanner;
import java.util.Random;						

public class Rnumber{


	public static void main(String args[])
	{

	Random rNo = new Random();
	Scanner uInput = new Scanner(System.in);

	int mxnumber, guess;

	System.out.println("Enter maximum number: ");
	mxnumber= uInput.nextInt();


	System.out.print("Random No: ");
	System.out.println(rNo.nextInt(mxnumber));
	
	

	do{
	
		System.out.println("What would be the random number: ");
       	        guess = uInput.nextInt();

	   if(guess == rNo.nextInt(mxnumber))
	    {
		System.out.println("you are right");
		
	    }
	    else if(guess<rNo.nextInt(mxnumber))
	     {
		System.out.println("Too low");
	     }else
		{System.out.println("Too high");
		}

	}while(guess != rNo.nextInt(mxnumber));
	
	
	

	}

}