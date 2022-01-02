
import java.util.Scanner;




public class passport {
	
	
	boolean passportinfo(int age, String name) {
		
		boolean check;
		
		if(age>=18) {
			check = true;
		}else {
			check = false;
		}
		
		System.out.println("Name: " + name);
		
		if(check==true) {
			System.out.println("You are eligible for passport");
		}else {
			System.out.println("You are NOT eligible for passport");
		}
		
		
		return check;
	}
	
	public static void main(String args[])
	{
		
		passport ob = new passport();
		
		Scanner hi = new Scanner(System.in);
		
		String pholder;
		System.out.print("Enter your name: ");
		pholder = hi.nextLine();
		System.out.print("Enter your age for passport: ");
		int aging = hi.nextInt();
		
		//boolean checkup = ob.passport(aging) ;
		//then you must omit ob.passport(aging) from if and add only "check==true"
		
		
		System.out.println(ob.passportinfo(aging, pholder));
		
		
		
		
	}

}
