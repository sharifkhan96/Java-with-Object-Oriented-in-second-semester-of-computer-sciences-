package insblock;

public class instanceblock {
	
	String name;
	int passno;
	String job;
	
	instanceblock(String name){
		
		this.name=name;
		System.out.println("You can only be a U.S. citizen for now");
		
	}
	
	instanceblock(String name, int passno){
		this.name=name;
		this.passno=passno;
		System.out.println("You are U.S. citezen & You can be a driver");
		
	}
	
	instanceblock(String name, int passno, String job){
		this.name=name;
		this.passno=passno;
		this.job=job;
		System.out.println("You are a U.S. citizen, You can be a driver OR a professional job holder");
		
	}
	
	void showinfo(){
		System.out.println("Name: " + name);
		System.out.println("Pass No: " + passno);
		System.out.println("Occupation: " + job);
	}
	
	{
		System.out.println("Welcome to United States...");
	}
	
	public static void main(String args[]) {

		
		instanceblock obj1 = new instanceblock("Khalid");
		obj1.showinfo();
		
		System.out.println("========================================================");
		System.out.println(" ");
		
		instanceblock obj2 = new instanceblock("Khalid", 2847);
		obj2.showinfo();
		
		System.out.println("========================================================");
		System.out.println(" ");
		
		instanceblock obj3 = new instanceblock("Khalid", 4858, "Body Builder");
		obj3.showinfo();
		
	}


}
