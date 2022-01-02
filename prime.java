import javax.swing.JOptionPane;
import java.util.Scanner;

public class prime{

	public static void main(String args[]){

	Scanner userinput = new Scanner(System.in);

	int number;
	String extra;
	boolean  check = true;
	
	
	extra = JOptionPane.showInputDialog("Dear user please enter a number for finding prime:");
	number = Integer.parseInt(extra);

	for(int j=2; j<number; j++){
	
	if(number % j == 0){

		check = false;
		break;
	  }
	}

	if(check==true){

		System.out.println("prime");	

	}else {
		
		System.out.println("Not a prime");
       	}
	

    }

  }