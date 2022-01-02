import java.io.*;

public class week3lab4_buffer{

	public static void main(String args[]) throws IOException{

	BufferedReader hi = new BufferedReader(new InputStreamReader(System.in));



	System.out.println("hey there, this is the buffer system");

	int x;
	String value;

	value = hi.readLine();

	x = Integer.parseInt(value);
	
	System.out.println(" this the value of x " + x);




}

}