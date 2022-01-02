package constructors;

public class cons2with_this {
	
	
	
	cons2with_this(){
		//this(3);
		System.out.println("this is zero argument constructor...");
	}
	
	cons2with_this(int i){
		//this(4,5);
		System.out.println("this is 1 argument constructor...");
	}
	
	cons2with_this(int i, int j){
		System.out.println("this is 2 argument constructor...");
	}

	
	
	
	
	public static void main(String args[]) {
		
		
	cons2with_this obj = new cons2with_this();
//		
//		cons2 obj2 = new cons2(3);
//		
//		cons2 obj3 = new cons2(4,5);

	
		// one constructor can call one/multiple constructors through this keyword:    this(parameters);
		
		
	}

}
