package OOPConceptPart1;

public class Car {
	
	//Class Vars
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		//new car();--This is the object of car class
		// new keyword is used to create the object 
		//a,b,c--- are the object reference variable
		Car a = new Car();
		Car b = new Car();
		Car c = new Car ();
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2014;
		b.wheel = 4;
		
		c.mod =2013;
		c.wheel = 4;
		
		
		System.out.println(c.mod);
		System.out.println(b.wheel);
		
		a=b;
		b=c;
		c=a;
		
		a.mod = 10;
		System.out.println(a.mod);
		c.mod = 20;
		System.out.println(a.mod);

	}

}
