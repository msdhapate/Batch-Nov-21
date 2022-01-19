package OOPConceptPart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();
		//one object will be created,obj is the reference variable,reffering to this object
		//after creating the object,the copy of all non static method will be given to this object
		
		obj.test();
		int l =obj.pqr();
		System.out.println(l);
		
		String s1 =obj.qa();
		System.out.println(s1);
		
		int div = obj.division(30, 10);
		System.out.println(div);
		
		//main method is void --who never returns a value 
		

	}
	//Non static method
	//void---does not return any value
	//return type--void
	public void test() {
		System.out.println("test method");
	}
	//return type--int
	public int pqr() {
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
		
	}
	//return type--STRING
	public String qa() {
		System.out.println("qa method");
		String s = "selenium";
		
		return s;
	}
	//return type--int
	public int division(int x,int y) {
		System.out.println("division method");
		int d = x/y;
		
		return d;
	}

}
