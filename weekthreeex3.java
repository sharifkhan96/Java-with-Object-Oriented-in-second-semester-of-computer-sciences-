import java.util.Scanner;
public class weekthreeex3{

public static void main(String args[]){

Scanner input = new Scanner(System.in);

int a, b;

System.out.print("Enter First No: ");
a = input.nextInt();

System.out.print("Enter Second No: ");
b = input.nextInt();

System.out.println("1. Division ");
System.out.println("2. Subtraction ");
System.out.println("3. Addition ");
System.out.println("4. Multiplication ");

int op;
System.out.print("Enter which operation would like to do...");
op = input.nextInt();

if(op==1){

System.out.print("a / b: ");
System.out.println(a/b);

}else if(op==2){

System.out.print("a - b: ");
System.out.println(a-b);

}else if(op==3){

System.out.print("a + b: ");
System.out.println(a+b);

}else if(op==4){

System.out.print("a * b: ");
System.out.println(a*b);

}





}
}