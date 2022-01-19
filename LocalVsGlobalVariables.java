package OOPConceptPart1;

public class LocalVsGlobalVariables {
	
	//Global vars--Class variable
	String name ="Tom";
	int age = 25;

	public static void main(String[] args) {
		
		int i = 10;//loacal variable for main method
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age); 
		
		
		

	}
	
	public void sum(){
		int j = 10;
		int i = 20; //local var for sum method
		int age = 25;
		System.out.println(i);
	}

}
