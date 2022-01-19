package OOPConceptpart2;

public class TestCar {

	public static  void main(String[] args) {
	/*when same method is present in parent class as well as in child class with the same number and same arguments,is called 
		method overriding.*/
		
		//
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsaftey();
		
		//this called static polymorphism---or compile polymorphism
		
		Car C = new Car();
	    C.start();
		C.stop();
		C.refuel();
	
		System.out.println("******");
		
		// also known as top casting
		Car c1 = new BMW(); //child class object can be referred by parent class reference object is called dynamic polymorphism
		//or run time polymorphism.
		c1.start();
		c1.stop();
		c1.refuel();
		
		//Down casting
		BMW b1 = (BMW)new Car();//Class Cast Exception---car can not be cast to class BMW--Error msg will come
		
		
		
		
		
		
		

	}

}
