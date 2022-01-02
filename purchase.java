import java.util.Scanner;

public class purchase{

	public static void main(String args[]){

	Scanner userinput = new Scanner(System.in);

	int nbooks, npoints;
	
	System.out.println("Dear user please enter how many books you want to buy");
	nbooks = userinput.nextInt();

	if(nbooks == 0){
		npoints = 0;
		System.out.println(npoints +" Points");
	}else if(nbooks == 1){
		npoints = 5;
		System.out.println(npoints+" points");
	}else if(nbooks == 2){
		npoints = 15;
		System.out.println(npoints +" points");
	}else if(nbooks == 3){
		npoints = 30;
		System.out.println(npoints+ " points");
	}else if(nbooks == 4){
		npoints = 60;
		System.out.println(npoints +" points");
	}else{
		npoints= 100;
		System.out.println("Welcome dear user." + npoints + " Points ");
	}


	}

  }