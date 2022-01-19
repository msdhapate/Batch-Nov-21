package OOPConceptPart1;

public class CallByRefAndCallByValue {
	
	int p;
	int q;

	public static void main(String[] args) {
		
		CallByRefAndCallByValue obj = new CallByRefAndCallByValue();
		int x = 10;
		int y = 20;
		obj.testsum(x, y);  //call by value or pass by value
		
		obj.p = 50;
		obj.q = 60;
		
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		

	}
	
	public int testsum(int a,int b) {
		int c = a+b;
		return c;
	}
	
	// call by reference
	public void swap(CallByRefAndCallByValue t) {
		int temp;
		temp = t.p;
		t.p = t.q;
		t.q = temp;
		
		
	}

}
