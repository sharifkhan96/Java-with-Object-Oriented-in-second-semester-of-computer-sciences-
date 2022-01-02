package constructors;

public class constructor1 {
	
	int id;
	String ename;
	String job;
	
	
	void take(int i, String en, String j) {
		
		id = i;
		ename = en;
		job = j;
		
	}
	
	void give() {
		System.out.println("Id: " + id);
		System.out.println("Name of employee: " + ename);
		System.out.println("Job position: " + job);
	}
	
	constructor1(){
		id = 0000;
		ename = "No Data";
		job = "Jobless";
	}
	
	public static void main(String args[]) {
	
		constructor1 obj = new constructor1();
		
		obj.take(3345, "Jameel", "Analyst");
		obj.give();
		
		
		
	}
	
}
