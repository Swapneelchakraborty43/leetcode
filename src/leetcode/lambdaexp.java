package leetcode;


//class myclass implements I{
//
//	@Override
//	public void display() {
//		System.out.println("Printing from my class");
//		
//	}
//	
//}

public class lambdaexp {
	interface I{
		 void display(String s);
	}

	public static void main(String[] args) {
	
		
		I m = (k) -> System.out.println(k);
			
			
		
			
		m.display("tera baap");
		

	}

}
