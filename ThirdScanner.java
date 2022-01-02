import java.util.Scanner;

public class ThirdScanner{


public static void main(String args[])  {

Scanner inputvalue = new Scanner((System.in));

System.out.println("We will take input from the user");
System.out.println("Write down your age: ");
int age = inputvalue.nextInt();
System.out.print("You are " + age + " years old");

}


}