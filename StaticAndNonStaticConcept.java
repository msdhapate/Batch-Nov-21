package OOPConceptPart1;

public class StaticAndNonStaticConcept {
	
	//Global var:the scope of global var will available across all the functions with same conditions 
	
		String name = "Tom";  // non static global var
		static int age = 25;  // static global var
		

	public static void main(String[] args) {
		
		// how to call static merhod and vars?
		//1. direct calling:
		sum();
		//2. calling by class name:
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		// how to call non static method vars
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendmail();
		System.out.println(obj.name);
		
		// can i access static method by object reference ?--yes  (but no need to ccall)
		obj.sum(); //warning will be given
	}
	
	public void sendmail(){      //non static method
		System.out.println("send mail method");
	}
	
	public static void sum(){      //satic method
		System.out.println("sum method");
		
	}

}
