import java.util.Scanner;

public class prime_pro{

	public static void main(String args[]){

	Scanner userinput = new Scanner(System.in);

	int lBound, uBound, count=0;
	

	do{

	System.out.println("Enter lower bound number: ");
	lBound = userinput.nextInt();

	System.out.println("Enter upper bound number: ");
	uBound = userinput.nextInt();
	System.out.println("===============================================================");
	
	}while(lBound > uBound);

	

	for(int i=lBound; i<=uBound; i++){

		for(int j=2; j<i; j++){
		
		    if(i % j == 0){
			count = 0;
			break;
		    }else{
			count = 1;
		    }
		
	        }
		
		if(count==1){
			System.out.println(i);
		}	
	}	



      }

 }