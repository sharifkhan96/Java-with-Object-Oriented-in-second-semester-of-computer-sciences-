package inherit;

import java.util.Scanner;

class x{
	int id;
	String ename;
}

class y extends x{
	String province;
	String district;
}

class z extends y{
	int houseNo;
	String job;
	
	void getdata(int i, String n, String p, String d, int hn, String j) {
		id = i;
		ename = n;
		province = p;
		district = d;
		houseNo = hn;
		job = j;
	}
	
	void showdata() {
		System.out.println("ID: " + id);
		System.out.println("Name: " + ename);
		System.out.println("Province: " + province);
		System.out.println("District: " + district);
		System.out.println("House No: " + houseNo);
		System.out.println("Job: " + job);
	}
	
	static{
		System.out.println("You have not submitted your data yet...");
	}
	z(){
		System.out.println("Please submite your data!");
		System.out.println("===================================");
	}
}
	

public class sing_mul {

	

	
	public static void main(String args[]) {
		
	Scanner getting = new Scanner(System.in);
	
	z ob2 = new z();
	
	// ob2.getdata(34, "Jamil", "Kabul", "Parza", 3453, "Farmer");
	
	System.out.println("Enter ID: ");
	ob2.id = getting.nextInt();
	System.out.println("Enter Name: ");
	ob2.ename = getting.next();
	System.out.println("Enter Province: ");
	ob2.province = getting.next();
	System.out.println("Enter District: ");
	ob2.district = getting.next();
	System.out.println("Enter House No: ");
	ob2.houseNo = getting.nextInt();
	System.out.println("Enter Job: ");
	ob2.job = getting.next();

	ob2.showdata();
	
	
		
	}
}
