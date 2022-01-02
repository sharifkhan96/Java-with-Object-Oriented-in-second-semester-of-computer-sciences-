import javax.swing.JOptionPane;


public class Gui{

public static void main(String args[]){

String userinput;
String name;
int no;

userinput = JOptionPane.showInputDialog("Enter your name");
name = userinput;
System.out.println("You are : " + name);


userinput = JOptionPane.showInputDialog("Enter your age ");
no = Integer.parseInt(userinput);
System.out.println("You are " + no + " years old ");


}

}