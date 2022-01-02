package accessmod;




	class third{
		
		public int a;
		public int b;
		public void amethod() {
			System.out.println("A value is: " + a);
		}
		
		third(){
			System.out.println("this is third's constructor...");
		}
		{
			System.out.println("this is third's instance block...");
		}
		static {
			System.out.println("this is third's static block...");
		}
	}
	


public class firstclass {
	

	
	
	public static void main(String args[]) {
	
		third ob1 = new third();
		
		int A = ob1.a;
		System.out.println(A);
		ob1.amethod();
	
		
		System.out.println(ob1.a);
	}

}


